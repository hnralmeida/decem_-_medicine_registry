import {createSlice, PayloadAction} from '@reduxjs/toolkit'
import type {RootState} from '../app/store'
import {EvamApi, Operation} from "@evam-life/sdk";
import OperationState from "@evam-life/sdk/sdk/domain/OperationState";

interface ActiveOperationState {
    value: Operation | undefined
}

const initialState: ActiveOperationState = {
    value: undefined
}

const evam = new EvamApi()

if (!EvamApi.isRunningInVehicleServices) {
    // We are not running in Vehicle Services, so we inject a pre-defined Operation
    // after a few seconds to simulate a new Operation being received from Rakel.
    setTimeout(
        () => {
            evam.injectSettings(
                {debug: true}
            )
        }, 3000
    )
    // Simulate the reception of an active case 5s after the app starts
    setTimeout(
        () => {
            evam.injectOperation(Operation.fromJSON(
                {
                    operationID: "56",
                    patientName: "Test Testkort",
                    operationState: OperationState.ACTIVE,
                    patientUID: "900608-2381",
                    callCenterId: "18",
                    caseFolderId: "1",
                    prio: "PRIO 1",
                    vehicleStatus: {
                        name: "Test status",
                        event: undefined,
                        successorName: undefined,
                        isStartStatus: false,
                        isEndStatus: false,
                        categoryType: "other",
                        categoryName: "test",
                    },
                    destinationSiteLocation: {
                        latitude: 59.35393,
                        longitude: 17.973795,
                        street: "Vretenvägen 13"
                    },
                    name: "Test operation",
                    sendTime: (new Date()).getTime() / 1000,
                    createdTime: (new Date()).getTime() / 1000,
                }
            ))
        }, 5000
    )
    // You can add more events like the one above here to be run afterward
}

export const activeOperationSlice = createSlice({
    name: "activeOperation",
    initialState,
    reducers: {
        setActiveCase: (state, action: PayloadAction<Operation | undefined>) => {
            state.value = action.payload
        }
    }
})

export const {setActiveCase} = activeOperationSlice.actions

export const selectActiveCase = (state: RootState) => state.activeCase.value

export default activeOperationSlice.reducer