package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Porselvi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopalakrishnan");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop = new Select(source);
		drop.selectByVisibleText("Employee");
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown = new Select(marketing);
		dropdown.selectByValue("DEMO_MKTG_CAMP");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select down = new Select(ownership);
		down.selectByIndex(4);
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select value = new Select(country);
		value.selectByVisibleText("India");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
