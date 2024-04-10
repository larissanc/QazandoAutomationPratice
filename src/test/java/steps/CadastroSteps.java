package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunBase;


public class CadastroSteps extends RunBase {

    CadastroPage cadastropage = new CadastroPage(driver);

    @Quando("^digitar o meu nome (.*)$")
    public void digitar_o_meu_nome(String arg)  {
        cadastropage = new CadastroPage(driver);
        cadastropage.digitarNome(arg);
    }

    @Quando("^digitar o meu e-mail$")
    public void digitar_o_meu_e_mail() {
        cadastropage = new CadastroPage(driver);
        cadastropage.digitarEmail();

    }

    @Quando("^digitar a minha senha (.*)$")
    public void digitar_a_minha_senha(String arg) {
        cadastropage = new CadastroPage(driver);
        cadastropage.digitarSenha(arg);
    }

    @Quando("^clicar no botao Cadastrar$")
    public void clicar_no_botao_Cadastrar() {
        cadastropage = new CadastroPage(driver);
        cadastropage.enviarDadosCadastro();
    }

    @Então("^vejo uma mensagem de confirmação do meu cadastro$")
    public void vejo_uma_mensagem_de_confirmação_do_meu_cadastro() {
        cadastropage = new CadastroPage(driver);
        cadastropage.validarMensagemCadastro();
    }
}
