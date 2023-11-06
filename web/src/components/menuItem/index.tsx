import React from 'react';

interface MenuItemProps {
    menuName: string;
    className: string;
    onPress: () => any;
}

export default function MenuItem({ menuName, className, onPress }: MenuItemProps) {

    return (
        <  >
            <button className={className} onClick={() => onPress()}>
                {menuName}
            </button>
        </ >
    )

}