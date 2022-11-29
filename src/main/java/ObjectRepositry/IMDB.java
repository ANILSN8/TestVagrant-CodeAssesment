package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDB {
	       
			//declaration//
			@FindBy(xpath = "//input[@id='suggestion-search']")
			private WebElement IMdbSearch;
			
			@FindBy(xpath = "//button[@class='nav-search__search-submit searchform__submit']")
			private WebElement searchclickBtn;
			
			@FindBy(xpath = "//a[text()='Pushpa: The Rise - Part 1']")
			private WebElement movieName;
			
			@FindBy(xpath = "//a[text()='December 17, 2021 (United States)']")
			private WebElement releaseDate;
			
			@FindBy(xpath="//a[text()='India']")
			private WebElement country;
			
			//initialization//
			public IMDB(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			

			//utilization
			public WebElement getIMdbSearch() {
				return IMdbSearch;
			}

			public WebElement getSearchclickBtn() {
				return searchclickBtn;
			}

			public WebElement getMovieName() {
				return movieName;
			}

			public WebElement getReleaseDate() {
				return releaseDate;
			}

			public WebElement getCountry() {
				return country;
			}
			
			
	}



