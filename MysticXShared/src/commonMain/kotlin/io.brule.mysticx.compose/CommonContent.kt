package io.brule.mysticx.compose

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun CommonContent() {

    // snack bar
    val (showSnackBar, setShowSnackBar) = remember { mutableStateOf(false) }

    Row {
        Spacer(modifier = Modifier.fillMaxWidth(0.20f))
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            Card(modifier = Modifier.fillMaxWidth(0.80f)) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(text = "MysticX")
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "This is a sample app for the MysticX library.")
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "It is built with Jetpack Compose.")
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(onClick = {
                        setShowSnackBar(!showSnackBar)
                    }) {
                        when (showSnackBar) {
                            true -> Text(text = "Hide Snack Bar")
                            false -> Text(text = "Show Snack Bar")
                        }
                    }
                }
            }
        }
    }

    if (showSnackBar) { Snackbar(
        modifier = Modifier.fillMaxWidth(),
        action = {
            Button(onClick = {
                setShowSnackBar(!showSnackBar)
            }) {
                Text(text = "Hide Snack Bar")
            }
        },
        content = {
            Text(text = "This is a snack bar.")
        }
    ) }

}