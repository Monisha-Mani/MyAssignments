package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1A {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']//following-sibling::a/img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>  windowHandleslist= new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandleslist.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		driver.switchTo().window(windowHandleslist.get(0));
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']//following-sibling::a/img")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>  windowHandleslist1= new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windowHandleslist1.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		driver.switchTo().window(windowHandleslist.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message: "+alert.getText());
		alert.accept();
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
	}
}
