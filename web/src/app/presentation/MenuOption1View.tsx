import {Box, Button, Typography} from "@mui/material";
import {EvamApi, Notification, NotificationType} from "@evam-life/sdk";

export function MenuOption1View() {
    return (
        <Box padding={"24px"}>
            <Typography variant={"h2"}>Menu option 1</Typography>
            <p>Donec vitae erat quis velit auctor bibendum. Suspendisse ante
                nibh, interdum nec ligula vel, auctor faucibus sem. Sed sagittis
                laoreet porta. Donec suscipit ante a odio tincidunt iaculis.
                Mauris quis diam scelerisque, fringilla sapien non, luctus nisl.
                Donec eu lacus ut dolor dapibus porta. Aenean leo arcu, mollis
                vel lobortis sed, iaculis non neque. Nulla nulla purus, aliquam
                a dolor eget, dictum pulvinar nibh. Nulla ultricies metus augue,
                id maximus odio sollicitudin sit amet. Vivamus tincidunt elit
                lectus, sed rutrum sapien tempor in. Nulla ullamcorper bibendum
                ligula. Vivamus ut tortor orci.</p>
        </Box>
    )
}