package cucumberIntegrationTests.stepDefinitions.android;

import UITestFramework.CreateSession;
import cucumber.api.java.en.And;
import cucumberIntegrationTests.PageConstants.android.AndroidAbhiBus;

public class AndroidLoginSteps {
    AndroidAbhiBus androidAbhiBus;


    public AndroidLoginSteps(CreateSession createSession) {
        androidAbhiBus = new AndroidAbhiBus(createSession.driver);
    }



    }

