package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions {

	public void login(String userName, String password) {
		enterUserName(userName);
		enterUserPassword(password);
		clickOnLoginButton();
	}

	public void enterUserName(String userName) {
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("userName");
	}

	public void enterUserPassword(String password) {
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("password");
	}

	public void clickOnLoginButton() {
		driver.findElement(By.cssSelector("//button[@type='submit']")).click();
	}
	
	public boolean isLoginUserNameErrorOnLoginPage() {
		WebElement userNameLoginErrorMsg = driver.findElement(By.cssSelector("#txtUsername-error"));
		return userNameLoginErrorMsg.isDisplayed();
	}
	public boolean isLoginPasswordErrorOnLoginPage() {
		WebElement passwordLoginErrorMsg = driver.findElement(By.cssSelector("#txtPassword-error"));
		return passwordLoginErrorMsg.isDisplayed();
	}
	public boolean verifyImageLogoDisplayed() {
		System.out.println("STEP : Verify Logo displayed on Login Page for A");
		System.out.println("------------------------");
		System.out.println("STEP : Verify Logo displayed on Login Page Changes B");
		System.out.println("On Branch B Line 39");
		System.out.println("On Branch B Upload");
		return driver.findElement(By.cssSelector("div.organization-logo.shadow>img")).isDisplayed();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
