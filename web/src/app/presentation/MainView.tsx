import * as React from "react";
import {useAppSelector} from "../hooks";
import {selectActiveCase} from "../../features/operation";
import {EvamTabPanel} from "@evam-life/sdk/sdk/component/appbar/EvamTabPanel";
import {Button, Typography} from "@mui/material";
import {EvamApi, Notification, NotificationType} from "@evam-life/sdk";

export function MainView() {
    const activeCase = useAppSelector(selectActiveCase)
    return (
        <div>
            <EvamTabPanel index={0}>
                <div>
                    <Typography variant={"h2"}>Welcome to your app!</Typography>
                    <Typography variant={"body1"}>This example application
                        showcases a portion of the possibilities offered by the
                        Evam SDK.</Typography>
                    <Typography>In the panels above you can access the
                        platform's Notification API and Operation
                        API.</Typography>
                    <Typography>You can tap the hamburger menu on the top right
                        to access extra options which display pages with dummy
                        data for the sake of example.</Typography>
                </div>
            </EvamTabPanel>
            <EvamTabPanel index={1}>
                <div>
                    <Typography variant={"h2"}>Notification API
                        example</Typography>
                    <Typography variant={"h4"}>Click the button below to send
                        a notification using the Evam SDK.</Typography>
                    <Button variant={"contained"} onClick={() => {
                        const evamApi = new EvamApi();

                        const notification = Notification.fromJSON({
                            heading: "Example Notification",
                            description: "Clicking the buttons below will log a message in the console, please try!",
                            notificationType: NotificationType.ACTION_HUN,
                            primaryButton: {
                                label: "Primary Button",
                                callback: () => {
                                    console.log('Primary Button clicked on test notification');
                                }
                            },
                            secondaryButton: {
                                label: "Secondary Button",
                                callback: () => {
                                    console.log('Secondary Button clicked on test notification');
                                }
                            }
                        });

                        evamApi.sendNotification(notification);
                    }}>Send notification</Button>
                </div>
            </EvamTabPanel>
            <EvamTabPanel index={2}>
                <div>
                    <Typography variant={"h2"}>Active case details</Typography>
                    <Typography variant={"h4"}>The data point below is taken
                        from the Evam SDK data.</Typography>
                    <Typography
                        variant={"body1"}>{activeCase ? `The active case is: ${activeCase.name} (${activeCase.getFullId()})` : "No active case"}
                    </Typography>
                </div>
            </EvamTabPanel>
        </div>
    )
}