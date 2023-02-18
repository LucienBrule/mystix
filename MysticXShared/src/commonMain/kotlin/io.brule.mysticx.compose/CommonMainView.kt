package io.brule.mysticx.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*
* This is the main view for the app. It contains the top bar, drawer, content, and bottom bar.
*/
@Composable
internal fun CommonMainView() {
    val scaffoldState =
        rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Closed))
    Box(modifier = Modifier.height(50.dp).fillMaxWidth().background(Color.Black))
    Scaffold(
        scaffoldState = scaffoldState,
        backgroundColor = Color.Black,
        contentColor = Color.White,
        topBar = {
            CommonTopBar()
        },
        drawerShape = MaterialTheme.shapes.small,
        drawerBackgroundColor = Color.Black,
        drawerContentColor = Color.White,
        drawerContent = {
            CommonDrawerContent()
        },
        content = {
            CommonContent()
        },
        bottomBar = {
            CommonBottomBar()
        }
    )
}



