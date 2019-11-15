package tutorial;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServerStartStop {

    static String Appium_Node_Path="C:\\Program Files (x86)\\Appium\\node.exe";
    static String Appium_JS_Path="C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";
    static AppiumDriverLocalService service;
    static String service_url;

    public static void appiumStart() throws Exception{
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(2856).usingDriverExecutable(new File(Appium_Node_Path)).
                withAppiumJS(new File(Appium_JS_Path)));
        service.start();
        Thread.sleep(25000);
        service_url = service.getUrl().toString();
    }

   // public static void appiumStop() throws Exception{
     //   service.stop();

    }

