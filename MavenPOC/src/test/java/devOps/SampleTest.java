package devOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
  @Test
  public void f() {
	 System.out.println("Printing Test");
	 System.setProperty("webdriver.chrome.driver", "D:\\DevOps\\workspace\\MavenPOC\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://eportal.htcindia.com/home/");
	 driver.manage().window().maximize();
  }
}
