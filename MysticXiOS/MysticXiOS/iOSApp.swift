import SwiftUI
/*
 * MysticXShared is the Kotlin interop module.
 * You can see the declarations on it in the generated header file
  MysticXShared/build/bin/iosArm64/podDebugFramework/MysticXShared.framework/Headers/MysticXShared.h
 */
import MysticXShared

/*
 * AppDelegate is the main application delegate.
 * It is responsible for loading the Compose App
 */
class AppDelegate: UIResponder, UIApplicationDelegate {
    var window: UIWindow?

    func application(_ application: UIApplication,
                     didFinishLaunchingWithOptions launchOptions:
                     [UIApplication.LaunchOptionsKey: Any]?) -> Bool {

        //HelperKt.initKoin()
        // Configure the window to use the MainViewController from the Shared Module.
        window = UIWindow(frame: UIScreen.main.bounds)
        let mainViewController = MainViewControllerKt.MainViewController()
        window?.rootViewController = mainViewController
        window?.makeKeyAndVisible()
        return true
    }
}

/*
 * iOSApp is a class containing the main method.
 * This is the earliest entrypoint of the application.
 * It loads the AppDelegate (above) into UIApplicationMain
 */

@main
class iOSApp{
    static func main() {
        UIApplicationMain(CommandLine.argc, CommandLine.unsafeArgv, nil, NSStringFromClass(AppDelegate.self))
    }
}

