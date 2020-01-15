package cal01;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class cal {
	WiniumDriver driver=null;
	@BeforeClass
	public void Setup() throws InterruptedException {
	DesktopOptions desktop =new DesktopOptions();
	desktop.setApplicationPath("c:\\windows\\System32\\calc.exe");
	try {
		desktop.setDebugConnectToRunningApp(false);
		desktop.setLaunchDelay(2);
		driver =new WiniumDriver(new URL("http://localhost:9999"), desktop);
        Thread.sleep(1000);		
		
	}catch(MalformedURLException e)
	{
		e.printStackTrace();
		
	}
	}
@Test
public void testcase() {
	driver.findElementByName("seven").click();
	
}

}
