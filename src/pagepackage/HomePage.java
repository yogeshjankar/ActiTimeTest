package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage extends BaseTest{
	
	@FindBy(xpath = "//a[.='Create new tasks']") private WebElement createNewTasksLink;
	@FindBy(id = "SubmitTTButton") private WebElement saveLeaveTimeButton;
	@FindBy(id = "//a[.='View Time-Track']") private WebElement viewTimeTrackLink;
	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutLink;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public WebElement getLogoutLink()
	{
		return logoutLink;
	}
	public WebElement getCreateNewTasksLink()
	{
		return createNewTasksLink;
	}
	public WebElement getSaveLeaveTimeButton() 
	{
		return saveLeaveTimeButton;
	}
	public WebElement getViewTimeTrackLink()
	{
		return viewTimeTrackLink;
	}
	
	
	public void clickOngetCreateNewTasksLink()
	{
		createNewTasksLink.click();
	}
	
	public void clickOnsaveLeaveTimeButton()
	{
		saveLeaveTimeButton.click();
	}
	
	public void clickOnviewTimeTrackLink()
	{
		viewTimeTrackLink.click();
	}
	
	public void clickOnLogoutLink()
	{
		logoutLink.click();
	}
	
	

}
