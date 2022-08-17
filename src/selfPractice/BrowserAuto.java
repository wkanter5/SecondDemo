package selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAuto {
	

	public static void main(String[] args) {
		
		//1 Open Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// 2 Open URL https://opensource-demo.orangehrmlive.com/");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
		
		//3 Enter user name
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		//4 Enter password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//5 Clink Login
		driver.findElement(By.className("button")).click();

		//capture title of the home page.()Actual title
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		if(actualTitle.equals(expectedTitle)) {
			
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
	//	System.out.println(driver.getTitle());
		
	}

}
