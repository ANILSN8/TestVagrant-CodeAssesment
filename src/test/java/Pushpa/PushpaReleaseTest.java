package Pushpa;



import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.FileUtilty;
import GenericUtility.WebDriverUtility;
import ObjectRepositry.IMDB;
import ObjectRepositry.WikiPedia;



public class PushpaReleaseTest extends BaseClass {
	@Test
	public void pushpRelease() throws Throwable {
		ExcelUtility eLib=new ExcelUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		FileUtilty flib=new FileUtilty();
		String pushpa = eLib.getDataFromExcel("Vargant", 0, 0);
		IMDB imdb=new IMDB(driver);
		imdb.getIMdbSearch().sendKeys(pushpa);
	    imdb.getSearchclickBtn().click();
	    imdb.getMovieName().click();
		wLib.scrollToAction(driver);
		String releaseDate = imdb.getReleaseDate().getText();
		Reporter.log(releaseDate,true);
		String country = imdb.getCountry().getText();
		Reporter.log(country,true);
		String url = flib.getPropertyValue("urlWiKipedia");
		driver.navigate().to(url);
		String pushpa1 = eLib.getDataFromExcel("Vargant", 0, 1);
		WikiPedia wiki=new WikiPedia(driver);
		wiki.getMovieName().sendKeys(pushpa1);
	    wiki.getSearchBtn().click();
	    String releasedate1=wiki.getReleaseDate().getText();
	    Reporter.log(releasedate1,true);
	    String country1=wiki.getCountry().getText();
	    Reporter.log(country1,true);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(country, country1);
		Reporter.log("country is pass",true);
	    softassert.assertEquals(releaseDate,releasedate1);
	    softassert.assertAll();
	}

}
