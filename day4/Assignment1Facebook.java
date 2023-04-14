package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1Facebook {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Monisha");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mani");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password1!");
	WebElement dateDOB=driver.findElement(By.xpath("//select[@id='day']"));
	Select date=new Select(dateDOB);
	date.selectByVisibleText("1");
	WebElement dobMonth=driver.findElement(By.xpath("//select[@id='month']"));
	Select month=new Select(dobMonth);
	month.selectByVisibleText("Nov");
	WebElement dobYear=driver.findElement(By.xpath("//select[@id='year']"));
	Select year=new Select(dobYear);
	year.selectByVisibleText("1991");
	driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
}
}
