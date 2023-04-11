package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
}
