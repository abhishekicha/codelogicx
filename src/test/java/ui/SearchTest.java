package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTest {
	
	WebDriver driver;
    @Test(description="This method validates the search functionality error")
	public void LoginCust() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://www.happyfares.in/");
	Reporter.log("website succeesfully opened");
	WebElement dropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/div[2]/div/div/div/ul/li[7]/div/button/span"));
	dropdown.click();
	List<WebElement> options = dropdown.findElements(By.xpath("/html/body/header/div[1]/div[1]/div[2]/div/div/div/ul/li[7]/div/div/a[1]"));
	options.get(0).click();
	Reporter.log("customer login page working");
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
    driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[1]/input")).sendKeys("8443855089");
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[2]/input")).sendKeys("Rjdhqw+647");
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[5]/button")).click();
	Reporter.log(" succeesfully logged in");
	Thread.sleep(3000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[1]/div/div[1]/div/div/div/input")).sendKeys("kolkata");
 	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[1]/div/div[1]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[1]/div/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
     Reporter.log("origin city kolkata");
    driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[1]/div/div[2]/div/div/div/input")).sendKeys("bangalore");
 	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[1]/div/div[2]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[1]/div/div[2]/div/div/div/input")).sendKeys(Keys.ENTER);
    Reporter.log("destination city bangalore");
    driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/label")).click();
 	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[3]/div/div[2]/div[1]/div/table/tbody/tr[4]/td[5]/table/tbody/tr[2]/td")).click();
	driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[3]/div/div/p\r\n")).click();
    Reporter.log("date of travel 19 november");
 	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[3]/div/div/div/div[1]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[3]/div/div/div/div[3]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[3]/div/div/div/div[4]/div/a[2]")).click();
	driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/form/div/div[3]/div/div/div/div[5]/div/input")).click();
	Reporter.log("4 passengers business class 2 infants");
 	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[2]/div/div[6]/div/input")).click();
	Reporter.log("search is working properly");
	driver.quit();
	}

}
