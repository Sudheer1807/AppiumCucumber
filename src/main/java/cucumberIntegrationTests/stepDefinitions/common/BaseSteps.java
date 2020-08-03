package cucumberIntegrationTests.stepDefinitions.common;

import cucumber.api.java.en.Given;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.PageConstants.android.AndroidAbhiBus;
import cucumberIntegrationTests.PageConstants.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;

public class BaseSteps {
    CreateSessionCucumber createSessionCucumber;
    WebDriver driver;
    String platform;
    AndroidAbhiBus androidAbhiBus;
    IOSLoginScreen iosLoginScreen;


    @Given("^User has slideshare \"([^\"]*)\" app$")
    public void userHasSlideshareApp(String invokeDriver) throws Exception {

        platform = invokeDriver;
        createSessionCucumber = new CreateSessionCucumber();
        createSessionCucumber.createDriver(invokeDriver, BaseSteps.class.getDeclaredMethod("userHasSlideshareApp",String.class));
        driver = createSessionCucumber.getWebDriver();

        if (invokeDriver.equalsIgnoreCase("android")) {
            androidAbhiBus = new AndroidAbhiBus(driver);
        } else if (invokeDriver.equalsIgnoreCase("iOS")) {
            iosLoginScreen = new IOSLoginScreen(driver);
        }
    }

    @Given("^User has launched Abhibus \"([^\"]*)\" app$")
    public void UserLaunchAbhiBusApp(String invokeDriver) throws Exception {

        platform = invokeDriver;
        createSessionCucumber = new CreateSessionCucumber();
        createSessionCucumber.createDriver(invokeDriver, BaseSteps.class.getDeclaredMethod("UserLaunchAbhiBusApp",String.class));
        driver = createSessionCucumber.getWebDriver();

        if (invokeDriver.equalsIgnoreCase("android")) {
            androidAbhiBus = new AndroidAbhiBus(driver);
        } else if (invokeDriver.equalsIgnoreCase("iOS")) {
            iosLoginScreen = new IOSLoginScreen(driver);
        }
    }
}
