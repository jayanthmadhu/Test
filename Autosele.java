import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class Autosele {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");

	      
	        WebElement searchBox = driver.findElement(By.name("q"));
	      searchBox.sendKeys("sele");
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[role='listbox']")));
	        List<WebElement> suggestions = driver.findElements(By.cssSelector("ul[role='listbox'] li span"));
	        for (WebElement suggestion : suggestions) {
	           suggestion.getText();
	        }
	        for (WebElement suggestion : suggestions) {
	            if (suggestion.getText().equalsIgnoreCase("selenium")) {
	                suggestion.click();
	                break;
	            }
	        }
	        wait.until(ExpectedConditions.titleContains("selenium"));
	}

}
