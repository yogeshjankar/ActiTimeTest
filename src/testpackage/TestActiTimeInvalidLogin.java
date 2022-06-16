package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestActiTimeInvalidLogin extends BaseTest {



	@Test
	public void invalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{

		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");

		LoginPage lp = new LoginPage(driver);

		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);

			lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);




		}
		bt.tearDown();
	}

}
