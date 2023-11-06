// FUnções
import React from 'react';
import logo from '../../assets/diagnose.png';

//Navegaçao
import { Navigate, useNavigate } from "react-router-dom";
import { Link } from 'react-router-dom';
import MenuItem from '../menuItem';

export function MenuBar() {

    const navigate = useNavigate();
    const [menuOpen, setMenuOpen] = React.useState(false);

    // const toggleMenu = () => {
    //     setMenuOpen(!menuOpen);
    // };

    return (
        <>
            <div className="App-header">
                <Link to="/">
                    <img src={logo} className="App-logo" alt="logo" />
                </Link>
            </div>

            {/* <button className="toggle-menu" onClick={toggleMenu}>
                {menuOpen ? 'Fechar Menu' : 'Abrir Menu'}
            </button> */}

            <div className={`menubar ${menuOpen ? 'open' : ''}`}>

                {/* Home */}
                <MenuItem
                    menuName='Home'
                    className='button-nav'
                    onPress={() => {
                        navigate("/home")
                        setMenuOpen(false);
                    }}
                />

                {/* Atores */}
                <MenuItem
                    menuName='Diagnosticar'
                    className='button-nav'
                    onPress={() => {
                        navigate("diagnosticar")
                        setMenuOpen(false)
                    }} />

                {/* Filmes */}
                <MenuItem
                    menuName='Histórico'
                    className='button-nav'
                    onPress={() => {
                        navigate("historico")
                        setMenuOpen(false)
                    }} />

            </div>
        </>
    )
}