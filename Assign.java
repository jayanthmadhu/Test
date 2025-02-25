import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/loginpagePractise/");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// TODO Auto-generated method stub
		d.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		d.findElement(By.id("password")).sendKeys("learning");
		d.findElement(By.xpath("//input[@name='terms']")).click();
		//d.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		//Thread.sleep(2000);
		//d.switchTo().alert().dismiss();
		d.findElement(By.id("signInBtn")).click();
		WebElement drop=d.findElement(By.cssSelector("select[class='form-control']"));
		 Select s = new Select(drop);
		 s.selectByIndex(0);

	}

}
