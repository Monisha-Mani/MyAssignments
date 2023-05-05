package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brand).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='topbrands']/..//a)[1]")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		if (title.contains("L'Oreal Paris")) {
			System.out.println("Title of the page contains " + title);
		}
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Shampoo'])")).click();
		driver.findElement(By.xpath("(//span[text()='Concern'])")).click();
		driver.findElement(By.xpath("(//span[text()='Color Protection'])")).click();
		boolean isShampooDisplayed = driver.findElement(By.xpath("//span[text()='Shampoo']")).isDisplayed();
		if (isShampooDisplayed) {
			System.out.println("Shampoo filter is selected");
		} else {
			System.out.println("Shampoo filter is not selected");
		}
		WebElement elementShampoo = driver.findElement(
				By.xpath("((//div[@class='product-listing']/div/div/div/div/div/following-sibling::a/div)[2]/div)[1]"));
		String shampooName = elementShampoo.getText();
		System.out.println("Product is: " + shampooName);
		Thread.sleep(1000);
		elementShampoo.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowlist = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowlist.get(1));
		driver.findElement(By.xpath("//select[@title='SIZE']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='1']")).click();
		String shampooMRP = driver.findElement(By.xpath("(//span[text()='MRP:'])[1]/following-sibling::span")).getText();
		System.out.println("Price of the product " + shampooName + " is: " + shampooMRP);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("(//p[text()='You Pay']/following::p)[1]"));
		String cartValue = cart.getText();
		System.out.println("Grand total in the cart is :" + cartValue);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();
		Thread.sleep(1000);
		String totalValue = driver.findElement(By.xpath("(//p[text()='Price Details']/following::p)")).getText();
		System.out.println("Grand total in the address page: " + totalValue);
		if (cartValue.equals(totalValue)) {
			System.out.println("Both the total are same");
		} else {
			System.out.println("Both the total are not same");
		}
		driver.quit();
	}
}
