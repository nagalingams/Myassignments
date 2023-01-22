package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement eleuserName=driver.findElement(By.id("username"));	
		//Enter UserName
		eleuserName.sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Enter Login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naga");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sundar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test for apps");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nagalingams12389@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important the text completed");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The title is:"+driver.getTitle());
		driver.close();

	}

}
