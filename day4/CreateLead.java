package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class CreateLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Student");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Monisha");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
	driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Testing Description");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("monishamkt@gmail.com");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("123456789");
	driver.findElement(By.className("smallSubmit")).click();
}
}
