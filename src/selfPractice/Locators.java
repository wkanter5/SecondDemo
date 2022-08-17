package selfPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");//by id
		//driver.findElement(By.name("submit_search")).click();//by name
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();//linked text
		//driver.findElement(By.partialLinkText("Printed Chiffon")).click();//linked text
		
		List<WebElement> slider =driver.findElements(By.className("homeslider-container"));
		System.out.println(slider.size());
		
		//driver.close();
	}

}
