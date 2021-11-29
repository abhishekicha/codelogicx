package ui;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupTestCorporate {
	WebDriver driver;
    @Test(description="This method validates the sign up functionality error")
	public void signUpCorporate()
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://www.happyfares.in/");
	WebElement dropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/div[2]/div/div/div/ul/li[6]/div/button/span"));
	dropdown.click();
	List<WebElement> options = dropdown.findElements(By.xpath("/html/body/header/div[1]/div[1]/div[2]/div/div/div/ul/li[6]/div/div/a[2]"));
	options.get(0).click();
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
    driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[1]/div[1]/div[1]/input")).sendKeys("codev");
    WebElement element = driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[1]/div[1]/div[2]/select"));
	Select select = new Select(element);
    select.selectByValue("Mr");
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[1]/div[2]/div[1]/input")).sendKeys("Abhishek");
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[1]/div[2]/div[2]/input")).sendKeys("pramanik");
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[1]/div[3]/div[1]/input")).sendKeys("12315645");
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[1]/div[3]/div[2]/input")).sendKeys("avi@gmail.com");

	
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[1]/input")).sendKeys("kolkata");
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")).sendKeys("1231112225");
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[1]/input")).sendKeys("123uvyvyv");

	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input")).sendKeys("Good");
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[2]/label/span")).click();
	driver.findElement(By.xpath("/html/body/div[2]/main/section/div/div/form/div[3]/div/button")).click();

	driver.quit();
	}

}
