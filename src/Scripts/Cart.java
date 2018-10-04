package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Generic.Auto_constant;
public class Cart implements Auto_constant {
	static
	{
		System.setProperty(key,value);
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=vcommission&utm_medium=affiliate_102bce388bcf95c66282dd2e5a68da");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("puma mens shoes");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	}

}
