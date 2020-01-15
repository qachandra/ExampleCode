package cal01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class sampleTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WiniumDriver driver = null;
        String appPath = "C:/windows/system32/calc.exe";
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath(appPath);
        option.setDebugConnectToRunningApp(false);
        option.setLaunchDelay(2);
       
        driver = new WiniumDriver(new URL("http://localhost:9999"),option);
        Thread.sleep(1000);
        driver.findElement(By.name("One")).click();

        driver.findElement(By.name("Plus")).click();

        driver.findElement(By.name("Two")).click();

        driver.findElement(By.name("Equals")).click();

        String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");

        System.out.println("Result after addition is: "+output);

        driver.quit();

        }}

