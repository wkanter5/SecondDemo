import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Selfirst {
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// invoke the browser
		System.out.println("Enter browser type to check:");
		Scanner scan = new Scanner(System.in);
		String browser = scan.nextLine();
		System.out.println("Close browser after exection?");
		String closeBrowser = scan.nextLine();
		//System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")) {
		//System.out.println(browser);
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJava\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJava\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("No Correct browser type entered, selecting default browser to be chrome");
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJava\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("https://linkedin.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement usernameInput =driver.findElement(By.xpath("//input[@autocomplete='username']"));
		usernameInput.sendKeys("basnetsagar767@gmail.com");
		WebElement userPwInput =driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		userPwInput.sendKeys("Associates2022");
		WebElement clinkSignin =driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']"));
		clinkSignin.click();
		System.out.println(driver.getCurrentUrl());
		/*
		 * if(driver.getCurrentUrl().contentEquals("https://www.linkedin.com/feed/")); {
		 * System.out.println(" You are on Homepage"); }
		 * 
		 */		
		Assert.assertTrue(false);	
		WebElement clickJob =driver.findElement(By.id("ember19"));
		clickJob.click();
		driver.close();
		
		
		//if(closeBrowser.contains("true"));
			//driver.close();	
		
		
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();	
		*/
	
		
		
		//ArrayList<String> a = new ArrayList<String>();
		//a.add("sagar");
		//a.add("basnet");
		//a.get(0);
		//System.out.println(a.get(0)+a.get(1));
		
		//String s= new String();
		//String s="sagar basnet academy";
		//System.out.println(s);
		//String[] splited= s.split("basnet");
		//System.out.println(splited[0]);
		//System.out.println(splited[1]);
		//System.out.println(splited[2]);
		//System.out.println(splited[1].trim());
		//String reverse = new StringBuffer(s).toString();
		//System.out.println(reverse);
		/*
		 * for(int i=s.length()-1;i>=0; i--) {
		 * 
		 * System.out.println(s.charAt(i));
		 * 
		 * }
		 */
		
	}

}
