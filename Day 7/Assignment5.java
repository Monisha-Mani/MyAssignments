package week4.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node01g9qdv71sr3dlcdsjj5viw7c220661.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement dragLocation = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Point location=dragLocation.getLocation();
		int dragX=location.getX();
		int dragY = location.getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(dragLocation,dragX+100,dragY).perform();
		System.out.println("Drag and Drop performed");
		
		WebElement dropSource = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement dropDest = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		builder.dragAndDrop(dropSource, dropDest).perform();
		System.out.println("Drag and Dropped to dropbox performed");
		
		WebElement dragColumnSource = driver.findElement(By.xpath("(//span[text()='Category'])[1]"));
		WebElement dragColumnDest = driver.findElement(By.xpath("(//span[text()='Name'])[1]"));
		builder.dragAndDrop(dragColumnSource, dragColumnDest).perform();
		System.out.println("Column drag performed");
		
		WebElement dragRowSource = driver.findElement(By.xpath("(//tr[@data-ri='1'])[2]"));
		WebElement dragRowDest = driver.findElement(By.xpath("(//tr[@data-ri='2'])[2]"));
		builder.dragAndDrop(dragRowSource, dragRowDest).perform();
		System.out.println("Row drag performed");
		
		
		WebElement imageResize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		builder.clickAndHold(imageResize).moveByOffset(100,0).release().perform();
		System.out.println("Image Resize performed");
		
		WebElement rangeSlider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		builder.clickAndHold(rangeSlider).moveByOffset(40,0).perform();
		System.out.println("Range slider changed");
		
		String progressLevel = driver.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText();
		System.out.println("Before progress Start: "+progressLevel);
		
		driver.findElement(By.xpath("//span[text()='Start']")).click();
		for(int i=0;i<10;i++)
		{
			progressLevel=driver.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText();
			System.out.println("Current Progress is "+ progressLevel);
			Thread.sleep(5000);
			if(progressLevel.equals("100%"))
			{
				System.out.println("Progress is "+ progressLevel);
				break;
			}
		}
		
	}
	
}