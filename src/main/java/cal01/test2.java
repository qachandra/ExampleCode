package cal01;
//working copy
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class test2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        WiniumDriver driver = null;
        String appPath = "C:/windows/system32/calc.exe";
        String winiumDriverPath = "C:/Users/CL/Downloads/Winium.Desktop.Driver/Winium.Desktop.Driver.exe";
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath(appPath);
        option.setDebugConnectToRunningApp(false);
        option.setLaunchDelay(2);
        File drivePath = new File(winiumDriverPath); //Set winium driver path
        WebDriverWait wait=new WebDriverWait(driver, 60);
		 
	    WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(drivePath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
	    service.start(); //Build and Start a Winium Driver service
	    driver = new WiniumDriver(service, option); //Start a winium driver
        
//        driver = new WiniumDriver(new URL("http://localhost:9999"),option);
        Thread.sleep(1000);
        
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("One")))).click();;
//        driver.findElement(By.name("One")).click();

        driver.findElement(By.name("Plus")).click();

        driver.findElement(By.name("Two")).click();

        driver.findElement(By.name("Equals")).click();

        String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");

        System.out.println("Result after addition is: "+output);

        driver.quit();
        service.stop();

        }}

