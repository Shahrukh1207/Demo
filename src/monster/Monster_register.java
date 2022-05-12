package monster;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Monster_register {

		private static final CharSequence ENTER = null;

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		
		//OPEN MONSTER
				driver.get("https://www.monsterindia.com/");	
						
				//CLICKS ON ALERTPOPUP
				driver.findElement(By.xpath("//div/div/button[@id=\"wzrk-cancel\"]")).click();
				//Thread.sleep(3000);
				
				//CLICK ON JOBSEEKER LOGIN
				driver.findElement(By.xpath("//div[2]/ul[2]/ul/li[1]/a/span[2]")).click();
				
				//CLICK ON REGISTER
				WebElement register = driver.findElement(By.xpath("//div/div/div[2]/div[1]/div[2]/a"));
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView(true)", register);
				//Thread.sleep(2000);
				register.click();
				
				//ENTER NAME
				driver.findElement(By.xpath("//div/div/form/div[2]/div[1]/div/input")).sendKeys("Delta");
				
				//ENTER EMAIL
				driver.findElement(By.name("email")).sendKeys("deltaone@gmail.com");
//				driver.findElement(By.xpath("//div/div/input[@placeholder='Please enter your email.']")).sendKeys("deltaone@gmail.com");
				
				//ENTER PASSWORD
				driver.findElement(By.name("Password")).sendKeys("12qwaszx");
				//driver.findElement(By.xpath("//div/div/input[@placeholder='Password should be minimum 6 characters']")).sendKeys("123456789");
				
				//SELECT COUNTRY CODE
		//		Select drpCountry = new Select(driver.findElement(By.xpath("//div/select[@class='countryCodes']")));
	//			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		//		jse.executeScript("arguments[0].scrollIntoView(true)", drpCountry);
			//	drpCountry.selectByValue("94");
				
				
				//ENTERS NUMBER
				WebElement phone = driver.findElement(By.name("Mobile Number"));
				phone.sendKeys("4554454545");
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView(true)", phone);
				phone.sendKeys(Keys.TAB);
					
				//ENTERS LOCATION
				WebElement loc = driver.findElement(By.xpath("//div/input[@placeholder='Search Location']"));
				loc.sendKeys("india");
				Thread.sleep(1500);
				loc.sendKeys(Keys.ENTER);
				loc.sendKeys(Keys.TAB);
				JavascriptExecutor jse3 = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView(true)", loc);
		
//				WebElement otherlocation = driver.findElement(By.name("location_city"));
	//			otherlocation.sendKeys("island");
		//		//Thread.sleep(2000);
			//	otherlocation.sendKeys(Keys.TAB);
				
				//experience
				WebElement exp = driver.findElement(By.xpath("//div/div/div/div/div[2]/input[@placeholder='Experience in years']"));
				exp.click();
				Thread.sleep(1500);
				exp.sendKeys(Keys.ENTER);
				exp.sendKeys(Keys.TAB);
			
	
				WebElement month = driver.findElement(By.xpath("//div/div/div/div/div[2]/input[@placeholder='Experience in months']"));
				month.sendKeys("4");
				Thread.sleep(2000);
				month.sendKeys(Keys.ENTER);
				month.sendKeys(Keys.TAB);
				
			
				WebElement skill = driver.findElement(By.id("skillInput"));
				skill.sendKeys("test");
				Actions actions = new Actions(driver);
				actions.sendKeys(skill, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				
				
				
			/*		
				
				//skills
				WebElement skill = driver.findElement(By.id("skillInput"));
			//	skill.click();
				skill.sendKeys("test");
				Thread.sleep(2000);
				skill.sendKeys(Keys.ENTER);
			//	Thread.sleep(2000);
				skill.sendKeys(Keys.TAB);
				skill.sendKeys(Keys.TAB);
				skill.sendKeys(Keys.ENTER);
			
				//industry
				WebElement industry = driver.findElement(By.xpath("//div[2]/div/div/div[2]/input"));
		//		industry.click();
				Thread.sleep(2000);
				industry.sendKeys(Keys.DOWN);
				industry.sendKeys(Keys.ENTER);
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView(true)", industry);
			/*	
				industry.sendKeys("IT");
				Thread.sleep(2000);		
				industry.sendKeys(Keys.DOWN);
				Thread.sleep(2000);
				industry.sendKeys(Keys.ENTER);
				
				
			
				
				WebElement dept = driver.findElement(By.id("functionInput"));
				dept.click();
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView(true)", dept);
				
		*/		
				driver.findElement(By.id("registerSubmit"));
					
				WebElement submit = driver.findElement(By.id("registerSubmit"));
				JavascriptExecutor jse4 = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView(true)", submit);
				
				
				
				
			//	driver.findElement(By.id("registerSubmit"));	

		}	
		}
