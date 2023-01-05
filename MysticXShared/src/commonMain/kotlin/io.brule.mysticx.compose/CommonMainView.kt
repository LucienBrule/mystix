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
internal fun CommonMainView() {

    Box(modifier = Modifier
        .height(100.dp)
        .fillMaxWidth()
        .background(Color.Black)
    ) {
        Column(modifier = Modifier.fillMaxWidth().align(Alignment.Center).padding(10.dp)) {
            Text(text = "Hello Common Main View", color = Color.White)
            Spacer(modifier = Modifier.height(10.dp))
            Text("Platform: ${getPlatform().name}", color = Color.White)

        }
    }

}