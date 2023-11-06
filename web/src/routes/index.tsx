// Funções 
import React from 'react';

// Navegação
import {
  createBrowserRouter,
  createRoutesFromElements,
  RouterProvider,
  Routes,
  Route,
  useRouteError,
  isRouteErrorResponse
} from "react-router-dom";

// componentes
import { MenuBar } from '../components/menuBar';

// Páginas
import { Home } from '../screens/Home';
import { Diagnose } from '../screens/Diagnose';
import { History } from '../screens/History';

export type TabStackParamsList = {
  Home: undefined,
  Diagnose: undefined,
  History: undefined,
  ErrorPage: undefined,
}
export function StackRoutes() {

  function ErrorBoundary() {
    const error = useRouteError();
    console.error(error);
    if (isRouteErrorResponse(error)) {
      return <div>{error.data.message}</div>;
    } else {
      return <div>Erro desconhecido</div>;
    }

  }

  return (
    <>
      <div className="App">
        <div className='App-Header-fixed'>
          <MenuBar />
        </div>

        <div className="App-pages">
          <Routes>
          <Route
              path="/"
              element={<Home />}
              errorElement={<ErrorBoundary />}
            />
            <Route
              path="/home"
              element={<Home />}
              errorElement={<ErrorBoundary />}
            />
            <Route
              path="/diagnosticar"
              element={<Diagnose />}
              errorElement={<ErrorBoundary />}
            />
            <Route
              path="/historico"
              element={<History />}
              errorElement={<ErrorBoundary />}
            />

          </Routes>
        </div>
      </div>
    </>
  );
}
