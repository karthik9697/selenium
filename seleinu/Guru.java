package seleinu;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\program files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		 WebElement table=driver.findElement(By.xpath(("//table")));
		 List<WebElement>tablerow=  table.findElements(By.xpath((".//tbody//tr")));
		for(int i=1;i<tablerow.size();i++) {
			String currentPrice=tablerow.get(i).findElement(By.xpath(".//td[4]")).getText();
			float f=Float.parseFloat(currentPrice);
			if(f<=500.00) {
				System.out.println(tablerow.get(i).findElement(By.xpath(".//td[1]")).getText()+" "+currentPrice);
			}
}
	}
}