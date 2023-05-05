package week4.day2;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFrame {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//p[@id='demo']/preceding-sibling::button")).click();
		
		Alert alertPrompt = driver.switchTo().alert();
		alertPrompt.sendKeys("Monisha");
		alertPrompt.accept();
		
		WebElement text = driver.findElement(By.id("demo"));
		String displayText=text.getText();
		
		if(displayText.contains("Monisha"))
			System.out.println("Displayed text contains the word Monisha");
		else
			System.out.println("Displayed text does not contains the word Monisha");
		
		
		driver.switchTo().defaultContent();
		driver.close();
			
	}
}
