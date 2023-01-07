package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
    driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.xpath("//*[@id=\"accountName\"]")).sendKeys("Debit Limited Account");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.xpath("//*[@id=\"groupNameLocal\"]")).sendKeys("ABC");
	driver.findElement(By.xpath("//*[@id=\"officeSiteName\"]")).sendKeys("XYZ");
	driver.findElement(By.xpath("//*[@id=\"annualRevenue\"]")).sendKeys("300000");
	WebElement industry = driver.findElement(By.name("industryEnumId"));
	Select dropdown = new Select(industry);
	dropdown.selectByIndex(3);
	WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	Select drop = new Select(ownership);
	drop.selectByVisibleText("S-Corporation");
	WebElement source = driver.findElement(By.id("dataSourceId"));
	Select tool = new Select(source);
	tool.selectByValue("LEAD_EMPLOYEE");
	WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
	Select mrtcpn = new Select(marketing);
	mrtcpn.selectByIndex(5);
	WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select sp = new Select(state);
	sp.selectByValue("TX");
	driver.findElement(By.className("smallSubmit")).click();
	
}
}
