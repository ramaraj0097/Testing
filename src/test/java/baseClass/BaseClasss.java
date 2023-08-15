package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactoryy.PageFactor;

public class BaseClasss  {
	public static WebDriver driver;
	static Actions action;

	public static void Openbrowser() {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.jcpenney.com/");
		driver.manage().window().maximize();
		

	}

	public static void Siginbutton(WebElement hover) {
		action = new Actions(driver);
		action.moveToElement(hover).build().perform();

	}
	
	public static void sendtext(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void click(WebElement elemt) {
		elemt.click();
	}
}
