package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
		driver.findElement(By.xpath("//span[text()='Alert']/..")).click();
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt91']/span[2]")).click();
		
		Alert alertSimple = driver.switchTo().alert();
		String alertSimpleText = alertSimple.getText();
		System.out.println(alertSimpleText);
		alertSimple.accept();
		
		
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt93']/span[2]")).click();
		Alert alertConfirm = driver.switchTo().alert();
		String alertConfirmText = alertConfirm.getText();
		System.out.println(alertConfirmText);
		alertConfirm.accept();
		
		
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt104']/span[2]")).click();
		Alert alertPrompt = driver.switchTo().alert();
		String alertPromptText = alertPrompt.getText();
		System.out.println(alertPromptText);
		alertPrompt.sendKeys("Monisha");
		Thread.sleep(2000);
		alertPrompt.accept();
	}
}
