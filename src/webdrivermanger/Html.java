package webdrivermanger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html {
	public WebDriver driver1;
	public WebDriver driver2;
	public WebDriver driver3;

	@BeforeTest
	public void login() {
		WebDriverManager.chromedriver().setup();

		driver1 = new ChromeDriver();

		driver1.get("https://github.com/login");
		driver1.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("ranazinah@gmail.com");
		driver1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ranaz123@#");
		driver1.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[11]")).click();

	}
	@Test()
	public void the_title_test() {
		String actualTitle=driver1.getTitle();
		String expectedTitle="GitHub";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test()
	public void the_logout_test() {
		
	}
	
	

}