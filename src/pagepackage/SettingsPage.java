package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	// Time-Track Hierarchy Level dropdowns
	@FindBy(xpath = "//a[@class='content administration']") private WebElement settingsLink;
	@FindBy(name = "firstHierarchyLevelCode") private WebElement firstHierarchyLevelCode;
	@FindBy(name = "secondHierarchyLevelCode") private WebElement secondHierarchyLevelCode;
	@FindBy(name = "thirdHierarchyLevelCode") private WebElement thirdHierarchyLevelCode;
	
	// Time track 
	@FindBy(id = "hoursPerDayLimited_LimitTo") private WebElement hoursPerDayLimitedLimitToCheckbox;
	@FindBy(name = "hoursPerDayLimited") private WebElement hoursPerDayLimitedCheckbox;
	@FindBy(id = "restrict_tt") private WebElement timeTrackOfOtherUsersCheckbox;
	@FindBy(id = "enable_leave_tt") private WebElement leaveTimeCheckbox;
	@FindBy(id = "overtime_undertime") private WebElement enableUndertimeRegistrationCheckbox;
	

	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getHoursPerDayLimitedLimitToCheckbox() 
	{
		return hoursPerDayLimitedLimitToCheckbox;
	}


	public WebElement getHoursPerDayLimitedCheckbox()
	{
		return hoursPerDayLimitedCheckbox;
	}


	public WebElement getTimeTrackOfOtherUsersCheckbox() 
	{
		return timeTrackOfOtherUsersCheckbox;
	}


	public WebElement getLeaveTimeCheckbox() 
	{
		return leaveTimeCheckbox;
	}


	public WebElement getEnableUndertimeRegistrationCheckbox()
	{
		return enableUndertimeRegistrationCheckbox;
	}


	public WebElement getSettingsLink() 
	{
		return settingsLink;
	}


	public WebElement getFirstHierarchyLevelCode() 
	{
		return firstHierarchyLevelCode;
	}


	public WebElement getSecondHierarchyLevelCode() 
	{
		return secondHierarchyLevelCode;
	}


	public WebElement getThirdHierarchyLevelCode()
	{
		return thirdHierarchyLevelCode;
	}

	
	public void clickOnSettingsLink()
	{
		settingsLink.click();
	}
	
	public void clickOnFirstHierarchyLevelCode()
	{
		firstHierarchyLevelCode.click();
	}

 

}
