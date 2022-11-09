package testScripts;

import base.PredefinedActions;
import org.testng.Assert;
import pages.LoginPage;

public class LoginTest {

	public void loginTestOperationsTC1() {
		System.out.println("Launch Chrome Browser and Hit Url");
		PredefinedActions.start("asrivastava-trials77.orangehrmlive.com");

		System.out.println("User Login with valid credential");
		LoginPage loginPage = new LoginPage();
		loginPage.login("Admin", "qLm5Ys4@NS");

		System.out.println("VERIFY : User should navigate to home page");
		String expectedTitle = "Employee Management";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle,
				"Login Failed with expected Messgae " + expectedTitle + " but actual message is " + actualTitle + "");

		PredefinedActions.closeBrowser();
	}
}