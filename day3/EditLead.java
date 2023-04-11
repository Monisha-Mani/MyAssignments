package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("Demosalesmanager");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	WebElement login = driver.findElement(By.className("decorativeSubmit"));
	login.click();
	WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
	crmsfa.click();
	WebElement leads = driver.findElement(By.linkText("Leads"));
	leads.click();
	WebElement createLead = driver.findElement(By.linkText("Create Lead"));
	createLead.click();
	WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
	companyName.sendKeys("Student");
	WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
	firstName.sendKeys("Monisha");
	WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
	lastName.sendKeys("Mani");
	WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	firstNameLocal.sendKeys("Moni");
	WebElement dept = driver.findElement(By.id("createLeadForm_departmentName"));
	dept.sendKeys("CSE");
	WebElement description= driver.findElement(By.id("createLeadForm_description"));
	description.sendKeys("Testing Description");
	WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
	email.sendKeys("monishamkt@gmail.com");
	WebElement stateProvision = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dropdown = new Select(stateProvision);
	dropdown.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
	duplicate.click();
	WebElement companyNameDuplicate = driver.findElement(By.id("createLeadForm_companyName"));
	companyNameDuplicate.clear();
	companyNameDuplicate.sendKeys("New Company");
	WebElement firstNameDuplicate = driver.findElement(By.id("createLeadForm_firstName"));
	firstNameDuplicate.clear();
	firstNameDuplicate.sendKeys("FirstName");
	driver.findElement(By.className("smallSubmit")).click();
	String pageFinalTitle = driver.getTitle();
	System.out.println(pageFinalTitle);
}
}

