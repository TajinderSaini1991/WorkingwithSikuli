package YouTubeTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

public class DownloadUsingChrome1 {
WebDriver driver;
File folder;

@BeforeMethod
public void setup(){
	
	folder = new File(UUID.randomUUID().toString());
	folder.mkdir();
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SimTaj\\workspace\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	 
	
	Map<String, Object> prefs = new HashMap<String, Object>();
	
	prefs.put("profile.default_content_settings.popups",0);
	prefs.put("download.default_directory",folder.getAbsolutePath());
	
	options.setExperimentalOption("prefs", prefs);
//	DesiredCapabilities cap = DesiredCapabilities.chrome();
//	cap.setCapability(ChromeOptions.CAPABILITY, options);
//	options.merge(cap);
	driver = new ChromeDriver(options);
	//driver = new ChromeDriver(cap); //it is deprecated
}
	@Test
	
	public void download() throws InterruptedException{
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		Thread.sleep(2000);
		
		File listofFiles[]= folder.listFiles();
		// make sure directory is not empty
	Assert.assertTrue(listofFiles.length>0);
	
	//make sure downloaded file is not empty
	
		for (File file:listofFiles){
		Assert.assertTrue(file.length()>0);	
		}
		
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		for(File file:folder.listFiles()){
			file.delete();
		}
		
		folder.delete();
		
	}
	
	
	
	
}










