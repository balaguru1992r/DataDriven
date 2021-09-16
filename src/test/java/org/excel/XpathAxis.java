package org.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\DataDriven\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		//Facebook-HomePage---->(forgotten password to Username)
		WebElement txtUsername = driver.findElement(By.xpath("//a[text()='Forgotten password?']/parent::div/preceding-sibling::div/child::div/child::input"));
		txtUsername.sendKeys("yuvi891992");
		//Facebook-HomePage---->( password to Click Create New account)
		WebElement createNew = driver.findElement(By.xpath("//input[@id='pass']/ancestor::div/following-sibling::div/child::a[@role='button']"));
		createNew.click();
		Thread.sleep(3000);
		//Facebook-SignUpPage---->(firstname to  Click Female)
		WebElement female = driver.findElement(By.xpath("//input[@name='firstname']/ancestor::div/following-sibling::div/child::span/child::span/child::input[@value='1']"));
		female.click();
		//Facebook-SignUpPage---->(firstname to  Click Male)
		WebElement male = driver.findElement(By.xpath("//input[@name='firstname']/ancestor::div/following-sibling::div/child::span/child::span/child::input[@value='2']"));
		male.click();
		//Facebook-SignUpPage---->(firstname to  Click Custom)
		WebElement custom = driver.findElement(By.xpath("//input[@name='firstname']/ancestor::div/following-sibling::div/child::span/child::span/child::label[text()='Custom']"));
		custom.click();

System.out.println("Chennai");
System.out.println("Pondicherry");
		System.out.println("Bala");
		System.out.println("Guru");

		
		// Other Xpath
		//By.id
		//By.name
		//By.xpath
		     //tagname[@attribute='attributeValue]
			 //tagname[text()='text']
			 //tagname[contains(text().'partialtext']
			 //tagname[contains(@id,'partialattributevalue']
			 //tagname[@id='attributeValue'][@class='classvalue']
			 //*[@attributename='attributevalue']
		
	
	
	}
	
	
	

}
