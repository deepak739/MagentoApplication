

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home
{
	WebDriver driver;
	
	By myacc = By.linkText("myacc");
	
	public Home(WebDriver driver)
	{
		super();
		this.driver = driver;
	}
	
	public void clickOnMyAccount()
	{
		driver.findElement(myacc).click();
	}
}
