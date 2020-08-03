package cucumberIntegrationTests.stepDefinitions.common;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.PageConstants.android.AndroidAbhiBus;
import cucumberIntegrationTests.PageConstants.iOS.IOSLoginScreen;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginSteps {
    AndroidAbhiBus androidAbhiBus;
    IOSLoginScreen iosLoginScreen;
    WebDriver driver;
    String userName;
    String password;
    Properties configFileObject;
    BaseSteps baseStepsContext;



    public LoginSteps(BaseSteps baseSteps) {
        baseStepsContext = baseSteps;
        driver = baseStepsContext.driver;
        androidAbhiBus = baseStepsContext.androidAbhiBus;
        iosLoginScreen = baseStepsContext.iosLoginScreen;
        configFileObject = CreateSessionCucumber.lobConfigProp;
    }



    @And("user has \"([^\"]*)\" username and password")
    public void usernameAndPasswordIs(String credentialsValidations) {
        if(credentialsValidations.equalsIgnoreCase("valid")){
            userName = configFileObject.getProperty("userName");
            password = configFileObject.getProperty("password");
        }
        else{
            userName = configFileObject.getProperty("abc@gmail.com");
            password = configFileObject.getProperty("password");
        }
    }

    @When("user enters credentials")
    public void userEntersCredentials() {
        androidAbhiBus.waitForVisibility(androidAbhiBus.loginViaSlideShare);
        androidAbhiBus.findElement(androidAbhiBus.loginViaSlideShare).click();
        androidAbhiBus.waitForVisibility(androidAbhiBus.userName);
        androidAbhiBus.findElement(androidAbhiBus.userName).sendKeys(userName);
        androidAbhiBus.findElement(androidAbhiBus.password).sendKeys(password);
    }

    @And("taps on \"([^\"]*)\" button")
    public void tapsOnButton(String arg0) {
        androidAbhiBus.findElement(androidAbhiBus.signInButton).click();


    }

    @Then("\"([^\"]*)\" button should be visible")
    public void buttonShouldBeVisible(String button) {
        //	verify if "Get Started" button is displayed
        if(button.equalsIgnoreCase("Get Started")) {
            androidAbhiBus.waitForVisibility(androidAbhiBus.startedButton);
            androidAbhiBus.findElement(androidAbhiBus.startedButton).click();
            androidAbhiBus.waitForVisibility(androidAbhiBus.titleBar);
        }
    }

    @And("^user should be able to scroll$")
    public void userShouldBeAbleToScroll() {
        // scroll down twice with each duration of 500 ms
        androidAbhiBus.scrollDown(2, 500);
        androidAbhiBus.waitForVisibility(androidAbhiBus.searchIcon);
    }

    @And("long press the search icon")
    public void longPressTheSearchIcon() {
        // long press search icon
        androidAbhiBus.longPress(androidAbhiBus.searchIcon);
    }

    //   --Abhi Bus--  //

    @And("User enters Leaving from as \"([^\"]*)\" place")
    public void userEntersSourceplace(String Place) throws InterruptedException {
        Thread.sleep(5000);
        androidAbhiBus.waitForVisibility(androidAbhiBus.Abhibus_Source_Text);
        androidAbhiBus.findElement(androidAbhiBus.Abhibus_Source_Text).click();
        androidAbhiBus.findElement(androidAbhiBus.Abhibus_Select_Source_city).click();

    }

    @And("User enters going to as \"([^\"]*)\" place")
    public void userEntersdestinatinplace(String Place) throws InterruptedException {
        Thread.sleep(5000);
        androidAbhiBus.waitForVisibility(androidAbhiBus.AbhiBus_Destination);
        androidAbhiBus.findElement(androidAbhiBus.AbhiBus_Destination).click();
        androidAbhiBus.waitForVisibility(androidAbhiBus.Abhibus_destination_search_City);
        androidAbhiBus.findElement(androidAbhiBus.Abhibus_destination_search_City).click();

    }

    @And("User selects departure date")
    public void userSelectsDepartureDate() throws InterruptedException {

        androidAbhiBus.waitForVisibility(androidAbhiBus.Abhibus_Select_Date);
        androidAbhiBus.findElement(androidAbhiBus.Abhibus_Select_Date).click();

    }
    @And("^User click on Search button$")
    public void userclickonSearchbutton() throws InterruptedException {

        androidAbhiBus.waitForVisibility(androidAbhiBus.Abhibus_Search_button);
        androidAbhiBus.findElement(androidAbhiBus.Abhibus_Search_button).click();

    }
    @And("^user should be able to scroll for search bus$")
    public void userShouldBeAbleToScrollforsearchbus() throws InterruptedException {
        Thread.sleep(5000);
        // scroll down twice with each duration of 500 ms
        androidAbhiBus.scrollDown(1, 500);

    }
}
