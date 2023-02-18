package io.brule.mysticx

import androidx.compose.ui.window.Application
import io.brule.mysticx.compose.CommonRoot
import platform.UIKit.UIViewController

/*
 * This is the entry point for the iOS app.
 */
@Suppress("unused", "FunctionName")
fun MainViewController(): UIViewController =
    Application("Client") {
        CommonRoot()
    }