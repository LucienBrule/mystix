package io.brule.mysticx

import androidx.compose.ui.window.Application
import io.brule.mysticx.compose.CommonRoot
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController =
    Application("Client") {
        CommonRoot()
    }