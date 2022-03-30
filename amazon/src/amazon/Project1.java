package amazon;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;



public class Project1 {
	
	public static void main(String[] args)  throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File fs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("C:\\Users\\DELL\\Desktop\\Selenium Screeshot\\login.jpg"));*/
		 String URL = driver.getCurrentUrl();
		 System.out.println(URL);
		if(URL.equals("https://www.amazon.in/"))
		{
			System.out.println("pass");
		}
		else 
			{
				System.out.println("fails");
			}
		WebElement register = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	    register.click();
	    WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
	    username.sendKeys("7387726081");
	    WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
	    continue1.click();
	    WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
	   pass.sendKeys("Atul@1995");
	    WebElement login = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	   login.click();
	   WebElement searchbar = driver.findElement(By.xpath("//input[@dir='auto']"));
	  searchbar.sendKeys("apple mobile");
	  WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	  search.click();
	 WebElement select1 = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
	 select1.click();
	 Thread.sleep(3000);
	 //((JavascriptExecutor)driver).executeScript("scroll(0,600)");
// WebElement select1 = driver.findElement(By.xpath("//p[text()='256GB']"));
	// select1.click();
			// WebElement select2 = driver.findElement(By.xpath("//img[@alt='Purple']"));
			 //select2.click();
	//new WebDriver(driver, Duration.ofSeconds(30))
	// .until((ExpectedCondition<Boolean>)wd((JavascriptExecutor)wd).executeScript(script:"return document.read.equals("complete"));
	 
	
		
	 
	 
			// WebElement select3 = driver.findElement(By.xpath("//select[@name='quantity']"));
			 //Select sel = new Select(select3);
			  // sel.selectByIndex(1);
	 ArrayList<String> atul = new ArrayList<String>(driver.getWindowHandles());
	 driver.switchTo().window(atul.get(1));
	 System.out.println(driver.getCurrentUrl());
	
	
		
	
	
				
	}
}
