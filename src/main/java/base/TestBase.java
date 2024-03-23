package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {

	 public static WebDriver driver;
	public static Properties p;
	 
	@Test
	  
	public static void launchDriver() throws IOException {
		//Properties,File and FileInputStream are class and Test is an interface
		p=new Properties();
		File f=new File(System.getProperty("user.dir")+"//src//test//resources//Config.property");
		FileInputStream fs=new FileInputStream(f);
		p.load(fs);
		//System.out.println(p.get("browser"));
		String browsername=(String) p.get("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("Firefox")) {
			
			driver=new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("Edge")){
			
			driver=new EdgeDriver();
		}
			
		}
	    public static void closeDriver() {
		if(driver!=null) {
		driver.quit();
	    }
	}
}
