package seleinu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\program files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		WebElement ele=driver.findElement(By.name("coffee"));
		Select obj=new Select(ele);
		obj.selectByValue("crisp");
        WebElement selopt=obj.getFirstSelectedOption();
        System.out.println(selopt.getText());
        boolean optmul=obj.isMultiple();
        System.out.println("It's a multiple DropDown>>>"+ optmul);
        List<WebElement>list=obj.getOptions();
        for(WebElement a:list) {
        	System.out.println(a.getText());
        }
	}

}
