package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

   public class BaseClass {
	public WebDriver driver;
	public FileUtilty fLib=new FileUtilty();
	public WebDriverUtility wLib=new WebDriverUtility();
	
	
	/**
	 * launch the browser
	 * @throws Throwable
	 */
	@BeforeClass
	public void launchTheBrowser() throws Throwable
	{  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser successfully launched");
		wLib.waitTillPageGetsLoad(driver);
		wLib.maximizeTheBrowser(driver);
		driver.get(fLib.getPropertyValue("urlIMDB"));
	}
	
	
	
	/**
	 * close the browser
	 */
	@AfterClass
	public void closeTheBrowser()
	{
		driver.quit();
		System.out.println("Browser successfully closed");
	}

}
