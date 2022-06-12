package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {

	@Test
	public void logout() throws IOException, InterruptedException
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		String username = flib.readPropertyFile(PROP_PATH, "username");
		String password = flib.readPropertyFile(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(username, password);
		
		Thread.sleep(3000);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLogoutLink();
		
		
		
		bt.tearDown();
		
	}
}
