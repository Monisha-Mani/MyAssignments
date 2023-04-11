package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	//driver.close();
}
}
