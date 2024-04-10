package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunBase;
import support.ScreenshotUtils;

public class LoginSteps extends RunBase {

    LoginPage loginPage = new LoginPage(driver);

    @Quando("^digitar o meu email (.*)$")
    public void digitar_o_meu_email(String arg) {
        loginPage = new LoginPage(driver);
        loginPage.redirecionarLogin();
        loginPage.digitarEmail(arg);
    }

    @Quando("^clicar no botao Conecte-se$")
    public void clicar_no_botao_Conecte_se() {
        loginPage = new LoginPage(driver);
        loginPage.realizarLogin();

    }

    @Então("^devo visualizar o texto (.*)$")
    public void devo_visualizar_o_texto(String arg) {
        loginPage = new LoginPage(driver);
        loginPage.validarLogin(arg);
    }

    @Então("^devo me autenticar com sucesso (.*), (.*)$")
    public void devo_me_autenticar_com_sucesso(String arg, String img) {
        loginPage = new LoginPage(driver);
        ScreenshotUtils.addScreenshotPg(img);
        loginPage.validarLogin(arg);
    }
}
