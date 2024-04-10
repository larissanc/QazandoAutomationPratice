package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    private By login = By.linkText("Login");
    private By email = By.id("user");
    private By senha = By.id("password");
    private By btnConectese = By.id("btnLogin");
    private By validarLogin = By.xpath("//*[@id=\"swal2-title\"]");

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void redirecionarLogin() {
        clicarElemento(login);
        String validaRedirecionamento = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/login",validaRedirecionamento);
    }

    public void digitarEmail(String arg) {
        digitarElemento(email, arg);
    }

    public void digitarSenha(String arg) {
        digitarElemento(senha, arg);
    }

    public void realizarLogin() {
        clicarElemento(btnConectese);
    }

    public void validarLogin(String arg) {
        String validaRedirecionamento = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/my-account",validaRedirecionamento);
        validaTextoElemento(validarLogin, arg);
    }
}
