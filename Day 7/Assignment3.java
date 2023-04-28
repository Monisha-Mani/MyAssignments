package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		int numberOfRows = 0;

		WebElement tableLibrary = driver.findElement(By.xpath("//div[@class='render']//table"));

		List<WebElement> tableRows = tableLibrary.findElements(By.tagName("tr"));
		numberOfRows = tableRows.size();

		for (int i = 0; i < 1; i++) {
			
			WebElement row = tableRows.get(i);
			List<WebElement> column1 = row.findElements(By.tagName("th"));
			
			for (int j = 0; j < column1.size(); j++) {
				WebElement header = column1.get(j);
				System.out.print(header.getText() + "\t\t");
			}

		}
		System.out.println(" ");
		for (int i = 1; i < numberOfRows; i++) {
			WebElement columnValue = tableRows.get(i);
			List<WebElement> tableValues = columnValue.findElements(By.tagName("td"));

			for (int j = 0; j < tableValues.size(); j++) {
				WebElement column = tableValues.get(j);
				System.out.print(column.getText() + "\t");
			}
			System.out.println(" ");
		}

	}
}
