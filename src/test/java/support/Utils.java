package support;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunBase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Utils extends RunBase {

    public void acessarAplicacao(String arg) {
        String URL = "http://automationpratice.com.br/";
        getDriver().get(URL);
    }

    public void esperarElementoEstarPresente(By element) {
        int tempo = 10;
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void digitarElemento(By element, String arg) {
        int tempo = 10;
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(arg);
    }

    public void clicarElemento(By element) {
        int tempo = 10;
        System.out.println("############################################");
        try {
            System.out.println("Clicar no elemento: " + element);
            WebDriverWait wait = new WebDriverWait(driver, tempo);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).click();
            System.out.println("Clicou com sucesso no elemento: " + element);
        }catch (Exception error){
            System.out.println("******** Falha ao clicar no elemento: " + element);
            new Exception(error);
        }
        System.out.println("############################################");
    }
    public void clicarJS(By element) {
        int tempo = 10;
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public void digitarDataAtual(By element, String arg) {
        int tempo = 10;
        if (arg.equals("")) {
            WebDriverWait wait = new WebDriverWait(driver, tempo);
            driver.findElement(element).clear();
            driver.findElement(element).sendKeys(Keys.TAB);
        } else {
            int result = Integer.valueOf(arg.trim());
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DATE, result);
            SimpleDateFormat dataPasta = new SimpleDateFormat("dd/MM/yyyy");
            WebDriverWait wait = new WebDriverWait(driver, tempo);
            driver.findElement(element).clear();
            driver.findElement(element).sendKeys(dataPasta.format(calendar.getTime()));
            driver.findElement(element).sendKeys(Keys.TAB);
        }
    }

    public String geraDDMMAAhhmmss() {
        String resp = null;
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
            resp = dataPasta + "_" + hms;
        } catch (Exception e) {
            System.out.println(e);
        }
        return resp;
    }

    public void selecionarElemento(By element, String arg) {
        int tempo = 10;
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        WebElement selecionarElemento = driver.findElement(element);
        Select select = new Select(selecionarElemento);
        select.selectByValue(arg);

    }

    public void aceitarAlerta() {
        int tempo = 10;
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        Alert alert = driver.switchTo().alert();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }

    public void recusarAlerta() {
        int tempo = 10;
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        Alert alert = driver.switchTo().alert();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }


    public String getEmailRandomico() {
        String email_init = "android_";
        String email_final = "@teste.com";

        Random random = new Random();
        int mínimo = 1;
        int máximo = 999;
        int resultado = random.nextInt(máximo - mínimo) + mínimo;
        return email_init + resultado + email_final;
    }

    public void validaTextoElemento(By element, String textoExperado){
        int tempo = 10;
        String validaTexto = "";
        System.out.println("############################################");
        System.out.println("Validar o texto:" + validaTexto);
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        validaTexto = driver.findElement(element).getText();
        Assert.assertEquals(textoExperado, validaTexto);
        System.out.println("Texto encontrado:" + validaTexto);
        System.out.println("############################################");
    }

    public static String geraCPF() {
        String iniciais = "";
        Integer numero;
        for (int i = 0; i < 9; i++) {
            numero = new Integer((int) (Math.random() * 10));
            iniciais += numero.toString();
        }
        return iniciais + calcDigVerif(iniciais);
    }

    private static String calcDigVerif(String num) {
        Integer primDig, segDig;
        int soma = 0, peso = 10;
        for (int i = 0; i < num.length(); i++)
            soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;

        if (soma % 11 == 0 | soma % 11 == 1)
            primDig = new Integer(0);
        else
            primDig = new Integer(11 - (soma % 11));

        soma = 0;
        peso = 11;
        for (int i = 0; i < num.length(); i++)
            soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;

        soma += primDig.intValue() * 2;
        if (soma % 11 == 0 | soma % 11 == 1)
            segDig = new Integer(0);
        else
            segDig = new Integer(11 - (soma % 11));

        return primDig.toString() + segDig.toString();
    }

}
