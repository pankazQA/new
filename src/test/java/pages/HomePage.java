package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.name("userName")).sendKeys(userName);
	@FindBy(name="userName")
	WebElement edt_userName;
	
	public WebElement enterUserName() {
		return edt_userName;
	}	
	
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(userPass);

	@FindBy(xpath = "//input[@name='password']")
	WebElement edt_userPassword;
	
	public WebElement enterUserPass() {
		return edt_userPassword;
	}

}
