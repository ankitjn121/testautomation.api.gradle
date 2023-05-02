package com.pratilipi.automation.base;

import com.pratilipi.automation.log.Log;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public abstract class Base {
    private static final ThreadLocal<String> currentTestcaseName = new InheritableThreadLocal<>();

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(){
        try{
            final String logFilePath = System.getProperty("user.home") + "/Automation_Logs/application.log";

            //get the caller class from reflection
            final Type classToLog = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            Log.initialiseLogger(classToLog, logFilePath);
        } catch (final Exception ex) {
            Log.exception(ex);
        }
    }


    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(ITestContext context, final Method method) {
        currentTestcaseName.set(method.getName());
     //   context.setAttribute("WebDriver", driver);
        cleanCurrentMethodScreenshots();
    }

    /**
     * Deletes the screenshots in the dir ./build/Reports/Screenshots/ which begins with current test case name
     */
    private void cleanCurrentMethodScreenshots() {
        File dir = new File("./build/Reports/Screenshots/");
        if (dir.exists()) {
            for (File file : dir.listFiles()) {
                if (file.getName().startsWith(currentTestcaseName.get())) {
                    file.delete();
                }
            }
        }
    }

    /**
     * Takes the screenshot of the current view
     *
     * @param
     */
//    public void saveScreenshotOfScreen() {
//        browserControl.getScreenshotOfBrowserScreen(currentTestcaseName.get() + System.currentTimeMillis());
//    }

    /**
     * Takes the screenshot of the current view
     *
     * @param screenshotIdentifier
     */
/*    public void saveScreenshotOfScreen(String screenshotIdentifier) {
        browserControl.getScreenshotOfBrowserScreen(currentTestcaseName.get() + screenshotIdentifier + System.currentTimeMillis());
    }*/

    /**
     * Method rotates the orientation of the mobile device
     *
     * @param orientation
     */
/*    public void rotateMobileScreenOrientation(ScreenOrientation orientation) {
        if (DTKProperties.get(Constants.PLATFORM_JVM_ARG).get().contains("ANDROID_PHONE") || DTKProperties.get(Constants.PLATFORM_JVM_ARG).get().contains("ANDROID_TABLET"))
            browserControl.rotateAndroidScreenOrientation(orientation);
        else
            browserControl.rotateIosScreenOrientation(orientation);
    }*/

    /**
     * Saves the full page's screenshot of the device.
     */
/*    public void saveFullPageScreenShot() {
        browserControl.saveScreenshotOfFullPage(currentTestcaseName.get() + System.currentTimeMillis());
    }*/
}
