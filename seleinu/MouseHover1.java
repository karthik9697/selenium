package seleinu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\program files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act=new Actions(driver);
		act.moveToElement(women).build().perform();
		
	}

}
