package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTestDemo1 {

	@Test
	public static void testNGDemo() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		System.out.println("======Test Initiated Successfully==========");
		
		System.out.println("============="+driver.getTitle()+"=========");
		
		driver.quit();
		System.out.println("======Test Completed Successfully==========");
	}

}
