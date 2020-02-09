package cal01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class sampleTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WiniumDriver driver = null;
               
        String appPath = "C:/windows/system32/calc.exe";
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath(appPath);
        option.setDebugConnectToRunningApp(false);
        option.setLaunchDelay(2);
//       manually run driver-not suitable see test2 programe for soultion
        driver = new WiniumDriver(new URL("http://localhost:9999"),option);
        Thread.sleep(1000);
        WebDriverWait wait=new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("One"))));
        driver.findElement(By.name("One")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Plus"))));
        driver.findElement(By.name("Plus")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Two"))));
        driver.findElement(By.name("Two")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Equals"))));
        driver.findElement(By.name("Equals")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("CalculatorResults"))));
        String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");

        System.out.println("Result after addition is: "+output);

        driver.quit();

        }}

