package io.brule.mysticx.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/*
* This is the root of the compose app.
* It is the same for all platforms.
*/
@Composable
internal fun CommonRoot() {
    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        CommonMainView()
    }
}


