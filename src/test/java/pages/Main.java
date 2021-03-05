package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.xml.LaunchSuite.ExistingSuite;

public class Main extends Base {

	public Main(WebDriver driver) {
		super(driver);
	}

	
	
	// General Search in main page
	public boolean search(String product) throws InterruptedException {
		//משקולות יד דאמבלס משושה עם אחיזה נוחה לידיים
		
		typeTextSubmit(By.name("s"), product);
		

		String results = getText(By.cssSelector(".woocommerce-breadcrumb"));
		if (results.contains("תוצאות חיפוש"))
			return true;

		else
			return false;
	}
	
	
	// Get into product
		public boolean getIntoProduct(String product) throws InterruptedException {
			//משקולות יד דאמבלס משושה עם אחיזה נוחה לידיים
			
			click(By.xpath("//h2[text()='"+ product +"']"));
			
			Thread.sleep(2000);
			
			if (isExist(By.xpath("//h1[text()='משקולות יד דאמבלס משושה עם אחיזה נוחה לידיים']")))
				return true;

			else
				return false;
		}
		
	
	


}
