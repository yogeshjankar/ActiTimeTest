package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest {




	@Test
	public void Login() throws IOException, InterruptedException
	{

		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		String usn = flib.readPropertyFile(PROP_PATH, "username");
	    String pwd = flib.readPropertyFile(PROP_PATH, "password");
	    
	   LoginPage lp = new LoginPage(driver);
	   lp.actiTimeValidLogin(usn, pwd);
	   
	   Thread.sleep(3000);
	   
	   bt.tearDown();
		
		
	}



}
