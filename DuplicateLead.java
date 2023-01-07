package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Porselvi");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("abc");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("9700selvi@gmail.com");
	driver.findElement(By.className("smallSubmit")).click();
	String title1 = driver.getTitle();
	System.out.println(title1);
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hello World");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Selvi");
	driver.findElement(By.className("smallSubmit")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	
}
}
