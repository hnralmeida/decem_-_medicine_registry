import {configureStore} from '@reduxjs/toolkit'
import operationReducer from '../features/operation'

// Store configuration, only contains the active operation but can be extended
export const store = configureStore({
    middleware: (getDefaultMiddleware) => {
        return getDefaultMiddleware({serializableCheck: false})
    },
    reducer: {
        activeCase: operationReducer
    },
})

// Infer the `RootState` and `AppDispatch` types from the store itself
export type RootState = ReturnType<typeof store.getState>
// Inferred type: {posts: PostsState, comments: CommentsState, users: UsersState}
export type AppDispatch = typeof store.dispatch