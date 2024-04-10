package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CadastroPage extends Utils {

    private By cadastro = By.linkText("Cadastro");
    private By nome = By.id("user");
    private By email = By.id("email");
    private By senha = By.id("password");
    private By btnCadastrar = By.id("btnRegister");
    private By ConfirmacaoCadastro = By.xpath("//*[@id=\"swal2-title\"]");

    WebDriver driver;

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void digitarNome(String arg) {
        clicarElemento(cadastro);
        digitarElemento(nome, arg);
    }

    public void digitarEmail() {
        esperarElementoEstarPresente(email);
        driver.findElement(email).sendKeys(getEmailRandomico());
    }

    public void digitarSenha(String arg) {
        digitarElemento(senha, arg);
    }

    public void enviarDadosCadastro() {
        clicarElemento(btnCadastrar);
    }

    public void validarMensagemCadastro() {
        String cadastroSucesso = driver.findElement(ConfirmacaoCadastro).getText();
        Assert.assertEquals("Cadastro realizado!", cadastroSucesso);

    }
}
