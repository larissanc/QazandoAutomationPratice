package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import runner.RunBase;
import support.ScreenshotUtils;
import support.Utils;

public class HomeSteps extends RunBase {

    pages.HomePage homepage = new pages.HomePage(driver);
    Utils utils = new Utils();

    @Before("@Chrome")
    public void beforeScenarioC(){
        getDriver(1);

    }

    @Before("@Firefox")
    public void beforeScenarioF(){
        getDriver(2);

    }

    @Dado("^que abra o navegador e acesse o site (.*)$")
    public void que_eu_abra_meu_navegador_e_acesse_o_site(String arg) {
        utils.acessarAplicacao(arg);
    }

    @Quando("^na pagina home o usuario clicar nas promocoes disponiveis especiais$")
    public void na_pagina_home_o_usuario_clicar_nas_promocoes_disponiveis_especiais() {
        homepage = new pages.HomePage(driver);
        homepage.PromocoesEspeciaisDisponiveis();
    }

    @Quando("^ser redirecionado para a pagina de promocoes$")
    public void devo_ser_redirecionado_para_a_pagina_de_promocoes() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoPaginaPromocoes();
    }

    @Quando("^na pagina home o usuario clicar no menu Conecte-se$")
    public void na_pagina_home_o_usuario_clicar_no_menu_Conecte_se() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoTelaLogin();
    }

    @Quando("^ser redirecionado para a pagina de Conecte-se$")
    public void ser_redirecionado_para_a_pagina_de_Conecte_se() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoPaginaLogin();
    }

    @Quando("^na pagina home o usuario clicar no menu Cadastro$")
    public void na_pagina_home_o_usuario_clicar_no_menu_Cadastro() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoTelaCadastro();
    }

    @Quando("^na pagina home o usuario clicar no submenu Eletronicos$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Eletronicos() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuEletronicos();
    }

    @Quando("^ser redirecionado para a pagina de Eletrônicos$")
    public void ser_redirecionado_para_a_pagina_de_Eletrônicos() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoPaginaEletronicos();
    }

    @Quando("^ser redirecionado para a pagina de Cadastro$")
    public void ser_redirecionado_para_a_pagina_de_Cadastro() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoPaginaCadastro();
    }

    @Quando("^na pagina home o usuario clicar no submenu Loja Quadro Grande$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Loja_Quadro_Grande() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuLojaQuadroGrande();
    }

    @Quando("^na pagina home o usuario clicar no submenu Compre Tres Grades$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Compre_Tres_Grades() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuCompreTresGrades();
    }

    @Quando("^ser redirecionado para a pagina Compre Tres Grades$")
    public void ser_redirecionado_para_a_pagina_Compre_Tres_Grades() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoCompreTresGrades();
    }

    @Quando("^na pagina home o usuario clicar no submenu Visualizacao de Lista de Lojas$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Visualizacao_de_Lista_de_Lojas() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuVisualizacaoListaLojas();
    }

    @Quando("^ser redirecionado para a pagina Visualizacao de Lista de Lojas$")
    public void ser_redirecionado_para_a_pagina_Visualizacao_de_Lista_de_Lojas() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoListaDeLojas();
    }

    @Quando("^na pagina home o usuario clicar no submenu Barra Lateral Esquerda da Loja$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Barra_Lateral_Esquerda_da_Loja() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuBarraLateralEsquerdaLoja();
    }

    @Quando("^ser redirecionado para a pagina Barra Lateral Esquerda da Loja$")
    public void ser_redirecionado_para_a_pagina_Barra_Lateral_Esquerda_da_Loja() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoBarraLateralEsquerdaLoja();
    }

    @Quando("^na pagina home o usuario clicar no submenu Comprar Barra Lateral Direita$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Comprar_Barra_Lateral_Direita() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuBarraLateralDireitaLoja();
    }

    @Quando("^ser redirecionado para a pagina Comprar Barra Lateral Direita$")
    public void ser_redirecionado_para_a_pagina_Comprar_Barra_Lateral_Direita() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoBarraLateralDireitaLoja();
    }

    @Quando("^na pagina home o usuario clicar no submenu Produto Unico$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Produto_Unico() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuProdutoUnico();
    }

    @Quando("^ser redirecionado para a pagina Produto Unico$")
    public void ser_redirecionado_para_a_pagina_Produto_Unico() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoProdutoUnico();
    }

    @Quando("^na pagina home o usuario clicar no submenu Produto Unico Dois$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Produto_Unico_Dois() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuProdutoUnicoDois();
    }

    @Quando("^ser redirecionado para a pagina Produto Unico Dois$")
    public void ser_redirecionado_para_a_pagina_Produto_Unico_Dois() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoProdutoUnicoDois();
    }

    @Quando("^na pagina home o usuario clicar no submenu Vista Do Carrinho Dois$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Vista_Do_Carrinho_Dois() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuVistaCarrinhoDois();
    }

    @Quando("^ser redirecionado para a pagina Vista Do Carrinho Dois$")
    public void ser_redirecionado_para_a_pagina_Vista_Do_Carrinho_Dois() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoVistaDoCarrinhoDois();
    }

    @Quando("^na pagina home o usuario clicar no submenu Confira A Visualizacao$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Confira_A_Visualizacao() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuConfiraVisualizacao();
    }

    @Quando("^ser redirecionado para a pagina Confira A Visualizacao Um$")
    public void ser_redirecionado_para_a_pagina_Confira_A_Visualizacao_Um() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoConfiraVisualizacaoUm();
    }

    @Quando("^na pagina home o usuario clicar no submenu Lista De Desejos$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Lista_De_Desejos() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuListaDeDesejos();
    }

    @Quando("^ser redirecionado para a pagina Lista De Desejos$")
    public void ser_redirecionado_para_a_pagina_Lista_De_Desejos() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoListaDeDesejos();
    }

    @Quando("^na pagina home o usuario clicar no submenu Acompanhamento De Pedidos$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Acompanhamento_De_Pedidos() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuAcompanhamentoDePedidos();
    }

    @Quando("^ser redirecionado para a pagina Acompanhamento De Pedidos$")
    public void ser_redirecionado_para_a_pagina_Acompanhamento_De_Pedidos() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoAcompanhamentoDePedidos();
    }

    @Quando("^na pagina home o usuario clicar no submenu Pedido Completo$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_Pedido_Completo() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuPedidoCompleto();
    }

    @Quando("^ser redirecionado para a pagina Pedido Completo$")
    public void ser_redirecionado_para_a_pagina_Pedido_Completo() {
        homepage = new pages.HomePage(driver);
        homepage.validaroRedirecionamentoPedidoCompleto();
    }

    @Quando("^na pagina home o usuario clicar no submenu QazandoShop$")
    public void na_pagina_home_o_usuario_clicar_no_submenu_QazandoShop() {
        homepage = new pages.HomePage(driver);
        homepage.AcessoMenuQazandoShop();
    }


    @Quando("^preencho o meu e-mail (.*)$")
    public void preencho_o_meu_e_mail(String arg1) {
        homepage = new pages.HomePage(driver);
        homepage.digitarEmail(arg1);
    }

    @Quando("^clico no botao Enviar Correio$")
    public void clico_no_botao_Enviar_Correio() {
        homepage = new pages.HomePage(driver);
        homepage.enviarEmail();
    }

    @Então("^vejo uma mensagem de confirmação da minha assinatura$")
    public void vejo_uma_mensagem_de_confirmação_da_minha_assinatura() {
        homepage = new pages.HomePage(driver);
        homepage.validaroAssinaturaBoletimNoticias();

    }

    @After
    public static void takeScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            ScreenshotUtils.addScreenshotOnScenarioFailed(scenario);
        } else {
            ScreenshotUtils.addScreenshotOnScenarioSucess(scenario);
        }

        driver.quit();
    }
}
