package io.brule.mysticx.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.brule.mysticx.getPlatform

@Composable
internal fun CommonRoot() {
    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        CommonMainView()
    }
}


