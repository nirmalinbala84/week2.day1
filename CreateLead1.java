package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement eleUserName=driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nirmalin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("test");
		driver.findElement(By.name("departmentName")).sendKeys("cse");
		driver.findElement(By.name("description")).sendKeys("Learning Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xxxx@gmail.com");
		WebElement element=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(element);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title of the page is "+driver.getTitle());
		if(driver.getTitle().contains("Create"))
		{
			System.out.println("The title is Correct");
		}
		else
		{
			System.out.println("The title is not Correct");
		}
		driver.close();
		
		
				
		

	}

}
