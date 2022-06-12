package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(name = "username") private WebElement username;
	@FindBy(name = "pwd") private WebElement password;
	@FindBy(id = "loginButton") private WebElement logginButton;
	@FindBy(id = "keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(id = "licenseLink") private WebElement licenseLink;
	@FindBy(xpath = "//a[.='Actimind Inc.']") private WebElement actiMindIncLink;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogginButton() {
		return logginButton;
	}
	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	public WebElement getActiMindIncLink() {
		return actiMindIncLink;
	}
	
	
	
	public void actiTimeValidLogin(String validUsername, String validPassword)
	{
		username.sendKeys(validUsername);
		password.sendKeys(validPassword);
		logginButton.click();
	}
	
	
	
	public void actiTimeInvalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		username.sendKeys(invalidUsername);
		password.sendKeys(invalidPassword);
		logginButton.click();
		Thread.sleep(1000);
		username.clear();
	}
	
	
	public void clickKeepLoggedInCheckBox()
	{
		keepLoggedInCheckBox.click();
	}
	
	public void clickLicenseLink()
	{
		licenseLink.click();
	}
	
	public void clickActiMindIncLink()
	{
		actiMindIncLink.click();
	}
	
	
	
	
	

}
