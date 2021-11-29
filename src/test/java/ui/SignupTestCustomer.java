package ui;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SignupTestCustomer {
	
	WebDriver driver;
    @Test(description="This method validates the sign up functionality error")
	public void signUp()
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://www.happyfares.in/");
	WebElement dropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/div[2]/div/div/div/ul/li[6]/div/button/span"));
	dropdown.click();
	List<WebElement> options = dropdown.findElements(By.xpath("/html/body/header/div[1]/div[1]/div[2]/div/div/div/ul/li[6]/div/div/a[1]"));
	options.get(0).click();
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());

		WebElement element = driver.findElement(By.xpath("//*[@id=\"txtName\"]"));
		Select select = new Select(element);
	    select.selectByValue("Mr");



	   
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/form/div[1]/div[1]/div[2]/input")).sendKeys("Abhishek");
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/form/div[1]/div[1]/div[3]/input")).sendKeys("Pramanik");
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/form/div[1]/div[2]/div[1]/input")).sendKeys("12315645");
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/form/div[1]/div[2]/div[2]/input")).sendKeys("apramanik28@gmail.com");
	
	
//	driver.findElement(By.xpath("//*[@id=\"mdlLogin\"]/div/div/div/div[5]/form/div[1]/div[2]/div[3]/label/span")).click();
//	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/form/div[1]/div[2]/div[4]/input")).sendKeys("Abbytech");
//	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/form/div[1]/div[2]/div[5]/input")).sendKeys("1231112225");
//driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/form/div[1]/div[2]/div[6]/input")).sendKeys("kolkata");
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/form/div[3]/div[2]/button")).click();
	driver.quit();
	}



	}


