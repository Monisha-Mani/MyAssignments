package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {

		List<String> securityNameList = new ArrayList<String>();
		Set<String> uniqSecurityNameSet = new LinkedHashSet<String>();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("navbtn_stockmarket")).click();

		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement table = driver.findElement(By.xpath("(//div[@class='table-responsive']//table)[1]"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			WebElement rowdata = rows.get(i);
			List<WebElement> eachrow = rowdata.findElements(By.tagName("td"));
			securityNameList.add(eachrow.get(0).getText());
		}
		System.out.println(securityNameList);
		uniqSecurityNameSet.addAll(securityNameList);
		for (String each : uniqSecurityNameSet) {
			System.out.println(each);
		}

	}
}
