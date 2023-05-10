package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	public static void main() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

	}

}
