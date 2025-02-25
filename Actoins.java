
import java.sql.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actoins {
    public static void main(String[] args) {
    	WebDriver d = new ChromeDriver();
    	d.get("https://www.safeway.com/");
    	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	d.manage().window().maximize();
    	//System.out.println(d.findElement(By.xpath("//a[normalize-space()='Safeway for U']")).getText());
    	//d.findElement(By.xpath("//img[contains(@class,'menu-nav__center-logo logo-safeway')]")).click();
    	//button[normalize-space()='Sign in']//following::button[1]
    	//1and2
    	//d.findElement(By.xpath("//a[@title='Your profile']")).click();
    	//System.out.println(d.findElement(By.xpath("//button[normalize-space()='Sign in']//following::button[1]")).getText());
    	
    	
    	
    
    }
}
