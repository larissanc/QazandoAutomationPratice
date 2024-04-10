package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class RunBase {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriver getDriver(int browser){

        if(driver != null){
            driver.quit();
        }

        switch (browser){
            case 1:
                ChromeOptions optionsC = new ChromeOptions();
                optionsC.addArguments("start-maximized");
                //           options.addArguments("--headless");
                driver = new ChromeDriver(optionsC);
                break;
            case 2:
                FirefoxOptions optionsF = new FirefoxOptions();
                optionsF.addArguments("start-maximized");
                //           options.addArguments("--headless");
                driver = new FirefoxDriver(optionsF);
                break;
            default:
                throw new IllegalArgumentException("Escolha o navegador de execução");
        }

        if (driver != null){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }
}
