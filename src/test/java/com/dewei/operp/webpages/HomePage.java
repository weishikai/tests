package com.dewei.operp.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	private static String PAGE_URL = "http://operp.dev.e-dewin.com/loginPage.htm";
	

	// Find operp login Button
	@FindBy(how = How.NAME,name = "busAreaCode")
	private WebElement busAreaCode;
	
	@FindBy(how = How.NAME,name = "userName")
	private WebElement userName;
	
	@FindBy(how = How.NAME,name = "password")
	private WebElement passWord;
	
	@FindBy(how = How.NAME,name = "answer")
	private WebElement ansWer;
	
	@FindBy(how = How.CLASS_NAME,className = "logblb logbut x300 cff loginSubmita")
	private WebElement loginButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		driver.get(PAGE_URL);
		// Initiablise Elements
		PageFactory.initElements(driver, this);
	}
	
	public void login(String busareacode,String username,String password,String answer) {
		busAreaCode.sendKeys(busareacode);
		userName.sendKeys(username);
		passWord.sendKeys(password);
		ansWer.sendKeys(answer);
		loginButton.click();
	}
	
	
	
	
}
