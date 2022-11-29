package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class WebDriverUtility {
    /**
     * maximize The browser
     * @param driver
     */
	public void maximizeTheBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * implicitlywait duration
	 * @param driver
	 */
	public void waitTillPageGetsLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * perform scroll by action
	 * @param driver
	 */
	public void scrollToAction(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,6000)");
	}
}
