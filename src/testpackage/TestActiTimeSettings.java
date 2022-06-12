package testpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.SettingsPage;

public class TestActiTimeSettings extends BaseTest {
	
	@Test
	public void setting() throws IOException
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		String username = flib.readPropertyFile(PROP_PATH, "username");
		String password = flib.readPropertyFile(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(username, password);
		
		SettingsPage sp = new SettingsPage(driver);
		sp.clickOnSettingsLink();
		sp.clickOnFirstHierarchyLevelCode();
		
		// to get all options from top level grouping dropdown
		WebDriverCommonLib wdc = new WebDriverCommonLib();
		WebElement firstHierarchy = driver.findElement(By.name("firstHierarchyLevelCode"));
		wdc.getAllOptions(firstHierarchy);
		
		WebElement secondHierarchy = driver.findElement(By.name("secondHierarchyLevelCode"));
		wdc.getAllOptions(secondHierarchy);
		
		
		
		// slection of option from dropdown
		wdc.selectOption(firstHierarchy, "4");
		
		bt.tearDown();
			
	}

}
