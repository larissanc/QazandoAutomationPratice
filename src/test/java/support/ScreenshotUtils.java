package support;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static runner.RunBase.driver;
import static runner.RunBase.getDriver;

public class ScreenshotUtils {

    public static void addScreenshotOnScenarioFailed(Scenario scenario){
        scenario.write("FAILED_" + scenario.getName() + "_" + scenario.getStatus());
        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/jpg");
    }

    public static void addScreenshotOnScenarioSucess(Scenario scenario){
        scenario.write("SUCESS_" + scenario.getName() + "_" + scenario.getStatus());
        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/jpg");
    }

    public static void addScreenshotPg(String img) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        try {
            Date now = new Date();
            DateFormat diaf = new SimpleDateFormat("dd");
            DateFormat mesf = new SimpleDateFormat("MM");
            DateFormat anof = new SimpleDateFormat("yyyy");
            String diaF = diaf.format(now);
            String mesF = mesf.format(now);
            String anoF = anof.format(now);
            String dataPasta = diaF + "_" + mesF + "_" + anoF;
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            String hms = Integer.toString(hour) + Integer.toString(minute) + Integer.toString(second);
            try {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                new File("target/" + dataPasta + "/").mkdir();
                FileUtils.copyFile(scrFile, new File("target/" + dataPasta + "/" + img.trim() + "_" + hms + ".jpg"));

            } catch (Exception e) {
                new File("target/" + dataPasta + "/").mkdir();
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("target/" + dataPasta + "/" + img.trim() + "_" + hms + ".jpg"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
