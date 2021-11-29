package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LoginTestCustomer {

	WebDriver driver;
    @Test(description="This method validates the Login functionality error")
	public void LoginCust()
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


	driver.quit();
	}

}

