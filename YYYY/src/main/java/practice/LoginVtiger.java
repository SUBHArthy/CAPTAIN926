package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginVtiger {

	
	@Test
	public void Login() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
	}
}
