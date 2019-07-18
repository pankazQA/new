package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseNewTours {
	
	public WebDriver driver;
	public String webUrl = "http://newtours.demoaut.com/";
	
	public WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mahbubsiddique/eclipse-workspace/flightsNewtours/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(webUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}

}
