package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesXpath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	//Parent to child
	driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
	//GrandParent to GrandChild
	driver.findElement(By.xpath("(//form[@method='post']//input)[1]")).sendKeys("xxx");
	//Child to Parent
	driver.findElement(By.xpath("//label[@for='username']/.."));
	driver.findElement(By.xpath("//label[@for='username']/parent::p"));
	//GrandChild to GrandParent
	driver.findElement(By.xpath("//label[@for='username']/ancestor::form"));
	//Elder sibling to Younger Sibling
	driver.findElement(By.xpath("//label[@for='username']/following-sibling::input")).sendKeys("Elder sibling to Younger");
	//Younger to Elder Sibling
	driver.findElement(By.xpath("//input[@id='username']/preceding-sibling::label"));
	//Elder cousin to Younger
	driver.findElement(By.xpath("//label[@for='username']/following::input[2]")).sendKeys("cmrsfa");
	//Younger Cousin to Elder
	driver.findElement(By.xpath("//input[@id='password']/preceding::input[1]")).sendKeys("Demosalesmanager");
		
	}
}
