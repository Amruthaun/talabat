package testCheck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownCheck {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/admin/order_update.php?form_id=6");
		driver.findElement(By.name("status")).click();
		
		
		
		
	}

}
