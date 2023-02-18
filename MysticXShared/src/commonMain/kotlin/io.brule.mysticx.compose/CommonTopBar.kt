package io.brule.mysticx.compose

import androidx.compose.foundation.clickable
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
internal fun CommonTopBar() {
    TopAppBar(
        title = {
            Text(
                text = "MysticX",
                color = Color.White,
            )
        },
        backgroundColor = Color.Black,
        actions = {
           // a hamburger menu

        },
        navigationIcon = {
            Icon(Icons.Default.Menu,
                contentDescription = "Menu",
                modifier = Modifier.clickable(onClick = { /*TODO*/ }),
                )
        }
    )
}

