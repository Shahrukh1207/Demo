package github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class letter {

	
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("https://www.mariatash.com/");
		//driver.findElement(By.xpath("(//div/div/button[@type='button'])[9]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/div/div/input[@aria-label='Your email']")).sendKeys("delta@allinc.co");
		driver.findElement(By.xpath("//div/div/div/input[@aria-label='First Name']")).sendKeys("demo");
		driver.findElement(By.xpath("//div/div/div/input[@aria-label='Last Name']")).sendKeys("Saan");
		WebElement country = driver.findElement(By.id("downshift-0-input"));
		country.click();
		country.sendKeys(Keys.DOWN);
		country.sendKeys(Keys.ENTER);
			
		driver.findElement(By.xpath("//div/div/button[@class='needsclick go596865934 kl-private-reset-css-Xuajs1']")).click();
		
	}
}