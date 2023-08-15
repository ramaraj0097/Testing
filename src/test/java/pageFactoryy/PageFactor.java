package pageFactoryy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClasss;

public class PageFactor extends BaseClasss {
	
	public PageFactor() {
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//button[@class='iQ2RY tooltip GWA60']")
public static WebElement sigin;

@FindBy(xpath="(//button[contains(@class,'vIpbG')])[2]")
public static WebElement creataccount;

@FindBy(xpath="//span[text()='Create Account']")
public static WebElement creataccount1;

@FindBy(id="firstName")
public static WebElement firstname;
	
@FindBy(id="lastName")
public static WebElement lasttname;

@FindBy(id="phone")
public static WebElement phonenumber;

@FindBy(id="createAccountEmail")
public static WebElement emailenter;

@FindBy(id="password")
public static WebElement password1;

@FindBy(xpath="//label[@for='keepMeLogged']")
public static WebElement checkbox;

@FindBy(xpath="//button[@data-automation-id='submit_button']")
public static WebElement submit;

@FindBy(xpath ="//button[@class='iQ2RY tooltip GWA60']")
public static WebElement login;

}
