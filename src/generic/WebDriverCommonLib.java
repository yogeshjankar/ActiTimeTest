package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest{

	public String getTitle(String expectedTitle)
	{
		String titleOfWebPage = driver.getTitle();
		return titleOfWebPage;
	}

	public void verifyTitle(String expectedTitle, String pageTitle)
	{
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			Reporter.log(pageTitle+" is verified");
		}
		else
		{
			Reporter.log(pageTitle+" not verified");
		}
	}



	// Handling Dropdowns

	public void getAllOptions(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();

		for(WebElement option: options)
		{
			String text = option.getText();
			System.out.println(text);
		}
	}

	public void selectOption(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectOption(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectOption(String visibleText, WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}


	// Mouse  actions
	public void mouseHover(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}


	public void rightClickAct(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}

	public void dragAndDropAct(WebElement src, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target);
	}

	public void doubleClickAct(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	}


	// Explicit wait

	public void explicitWait(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.titleContains(title));
	}





	// scrolling operations

	public void  scrollRight(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+pixels+",0)");
	}

	public void scrollLeft(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+-pixels+",0)");
	}

	public void scrollDown(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, "+pixels+")");
	}

	public void scrollUp(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, "+-pixels+")");
	}

	public void scrollToParticularWebElement(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Point point = element.getLocation();

		int xaxis = point.getX();
		int yaxis = point.getY();

		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}




	// To take screenshot

	public void getScreenshoOfWebpage(String fileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOTS_FILE_PATH+fileName+".png");

		Files.copy(src, dest);
	}



	// popups

	public void acceptConfirmationPopup()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dismissConfirmationPopup()
	{
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}



	// Navigation operations

	public void refreshBrowser()
	{
		driver.navigate().refresh();
	}

	public void backOpearion()
	{
		driver.navigate().back();
	}

	public void forwardOperation()
	{
		driver.navigate().back();
	}
}

