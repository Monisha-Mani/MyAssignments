package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		int numberOfRows = 0, numberOfColumns = 0;

		WebElement tableAttribute = driver.findElement(By.className("attributes-list"));

		List<WebElement> tableRows = tableAttribute.findElements(By.tagName("tr"));
		System.out.println("No of rows in the table is " + tableRows.size());

		numberOfRows = tableRows.size();

		for (int i = 0; i < numberOfRows; i++) {
			WebElement row = tableRows.get(i);
			List<WebElement> tableColumns = row.findElements(By.tagName("td"));
			numberOfColumns += tableColumns.size();
		}
		System.out.println("No of columns in the table is " + numberOfColumns);

	}
}
