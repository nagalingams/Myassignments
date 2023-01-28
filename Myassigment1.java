package Week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myassigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//div//input[@class='inputtext _58mg _5dba _2ph-\']")).sendKeys("Test");
		driver.findElement(By.xpath("//div//input[@name=\'lastname\']")).sendKeys("leaf");
		driver.findElement(By.xpath("//div//input[@name=\'reg_email__\']")).sendKeys("9464747447");
		driver.findElement(By.xpath("//div//input[@id='password_step_input']")).sendKeys("Test@1234");
	//	WebElement element=driver.findElement(By.className("_9407 _5dba _9hk6 _8esg"));
		Select dd=new Select(driver.findElement(By.name("birthday_day")));
		dd.selectByVisibleText("7");
		Select mon=new Select(driver.findElement(By.name("birthday_month")));
		mon.selectByVisibleText("Mar");
		Select mon1=new Select(driver.findElement(By.name("birthday_year")));
		mon1.selectByVisibleText("2023");
		driver.findElement(By.xpath("//span//label[text()='Male']")).click();
		driver.close();

	}

}
