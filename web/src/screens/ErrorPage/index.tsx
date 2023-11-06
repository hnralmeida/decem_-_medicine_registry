// Funções 
import React from 'react';

// Navegação
import { useRouteError } from "react-router-dom";

export default function ErrorPage() {
  const error:any = useRouteError();

  console.error(error);

  return (
    <div id="error-page">
      <h1>Oops!</h1>
      <p>Desculpa, ocorreu algum erro na página.</p>
      <p>
        <i>{error.statusText || error.message}</i>
      </p>
    </div>
  );
}