package seleinu;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\program files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement ele=driver.findElement(By.xpath("(//*[@target='_blank'])[1]"));
		ele.click();
		String cw=driver.getWindowHandle();
		Set<String>aw=driver.getWindowHandles();
		List<String>list=new ArrayList<String>();
		list.addAll(aw);
		driver.switchTo().window(list.get(1));
		driver.close();
		driver.switchTo().window(list.get(0));
		driver.quit();
	}

}
