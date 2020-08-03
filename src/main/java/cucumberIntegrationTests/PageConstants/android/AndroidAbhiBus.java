package cucumberIntegrationTests.PageConstants.android;

import UITestFramework.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * contains all the locators present on the login Screen
 */
public class AndroidAbhiBus extends GenericMethods {

	public AndroidAbhiBus(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	// Locators on the login screen
	public By loginViaSlideShare = By.xpath("//android.widget.TextView[@text='Sign in with your SlideShare account']");
	public By userName = By.xpath("//android.widget.RelativeLayout//android.widget.EditText");
	public By password = By.xpath("//android.widget.RelativeLayout//android.widget.EditText[2]");
	public By signInButton = By.xpath("//android.widget.RelativeLayout//android.widget.Button");
	public By startedButton = By.id("net.slideshare.mobile:id/get_started_button");
	public By searchIcon = By.id("net.slideshare.mobile:id/action_search");
	public By titleBar = By.id("net.slideshare.mobile:id/title");



	//Abhi bus
	public By Abhibus_Source_Text = By.id("com.app.abhibus:id/sourceTextView");
	//public By Abhibus_enter_source_city = By.id("android:id/search_src_text");
	public By Abhibus_Select_Source_city = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[2]");
	public By AbhiBus_Destination = By.id("com.app.abhibus:id/destinationTextView");
	public By Abhibus_destination_search_City = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[3]");
	public By Abhibus_Select_Date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]");
	public By Abhibus_Search_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.TextView");


	
}

