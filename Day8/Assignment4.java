package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.click();
		searchBox.sendKeys("oneplus 9 pro");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion-container']/div)[1]")).click();
		String priceFirstProd = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		String priceUpdate = priceFirstProd.replaceAll("[^0-9]","");
		System.out.println("Price of the product is: "+priceUpdate);
		Thread.sleep(3000);
		String custRating = driver.findElement(By.xpath("((//div[@class='a-row a-size-small'])[2]/span)[1]")).getAttribute("aria-label");
		System.out.println("Rating of the product is: "+custRating );
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']//img)[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		
		File screenShot = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/IMG001.png");
		FileUtils.copyFile(screenShot,dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(6000);
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		String cartPrice = subTotal.replaceAll("[^0-9]","");
		String removeDecimal= cartPrice.substring(0, (cartPrice.length()-2));
		System.out.println("Price in the cart is: "+removeDecimal);
		if(priceUpdate.equals(removeDecimal))
		{
			System.out.println("Both product and cart rate are same");
		}
		else
		{
			System.out.println("Both product and cart rate are not same");
		}
		driver.quit();
		
	}	
}
