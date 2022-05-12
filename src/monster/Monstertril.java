package monster;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monstertril {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//OPEN MONSTER
		driver.get("https://www.monsterindia.com/");	
				
		//CLICKS ON ALERTPOPUP
		driver.findElement(By.xpath("//div/div/button[@id=\"wzrk-cancel\"]")).click();
		Thread.sleep(3000);
		
		//CLICK ON JOBSEEKER LOGIN
		driver.findElement(By.xpath("//div[2]/ul[2]/ul/li[1]/a/span[2]")).click();
		
		
		//CLICK ON REGISTER
				WebElement register = driver.findElement(By.xpath("//div/div/div[2]/div[1]/div[2]/a"));
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView(true)", register);
				Thread.sleep(2000);
				register.click();
				
		
		
		
	}

}
