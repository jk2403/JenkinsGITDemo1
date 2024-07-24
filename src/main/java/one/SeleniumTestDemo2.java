package one;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestDemo2 {

	@Test
	public static void mainTest() throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationstepbystep.com/");

		System.out.println("Title: "+ driver.getTitle());

		Actions action = new Actions(driver);
		WebElement seleniumMenu;
		WebElement subMenu;

		try
		{
			seleniumMenu = driver.findElement(By.xpath("//ul[contains(@class,'top-menu')]//li[contains(@class,'menu-item')]//a[normalize-space()='Selenium']"));

			action.moveToElement(seleniumMenu).build().perform();

			subMenu =  driver.findElement(By.xpath("//ul[contains(@class,'top-menu')]//li[contains(@class,'menu-item')]//a[normalize-space()='Selenium Introduction']"));
			action.moveToElement(subMenu).click().build().perform();
		}

		catch (Exception e) {

			WebElement popup = driver.findElement(By.xpath("//div[contains(@id,'pum_popup_title')]"));
			if(popup.isDisplayed())
			{
				driver.findElement(By.xpath("//button[@class='pum-close popmake-close']")).click();
			}
			
			Thread.sleep(2000);
			
			seleniumMenu = driver.findElement(By.xpath("//ul[contains(@class,'top-menu')]//li[contains(@class,'menu-item')]//a[normalize-space()='Selenium']"));

			action.moveToElement(seleniumMenu).build().perform();

			subMenu =  driver.findElement(By.xpath("//ul[contains(@class,'top-menu')]//li[contains(@class,'menu-item')]//a[normalize-space()='Selenium Introduction']"));
			action.moveToElement(subMenu).click().build().perform();

		}


		System.out.println("Test Completed");

		driver.quit();
	}

}
