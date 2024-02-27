package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RishiHerbalSite 
{
	
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void url()
		{
			driver.get("https://rishiherbalindia.linker.store/");
			driver.manage().window().maximize();
		}
		@Test
		public void test1() throws Exception
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		   /* driver.findElement(By.xpath("//[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("edward076@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Edward076");
			driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
			driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
			driver.navigate().refresh();*/
			
			
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("edward076@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Edward076");
			driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
					
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth Booster",Keys.ENTER);
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")));
			
			WebElement Hover=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a"));
			Actions act=new Actions(driver);
			act.moveToElement(Hover).perform();
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
			
			js.executeScript("arguments[0].scrollIntoView();", 
		    driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")));
			WebElement Hover1=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a"));
			act.moveToElement(Hover1).perform();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button")).click();
			
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")));
			driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
			
			String Acturl=driver.getCurrentUrl();
			String Expurl="https://rishiherbalindia.linker.store/safety";
			if(Expurl.equals(Acturl))
			{
				System.out.println("Login Successfull");
			}
			else
			{
				System.out.println("Login Failed");
			}
		}
	

}
