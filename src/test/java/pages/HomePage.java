package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import runner.RunBase;
import support.Utils;

public class HomePage extends RunBase {

    private final By email = By.name("EMAIL");
    private final By enviarCorreio = By.name("subscribe");
    private final By validarConfirmacaoAssinatura = By.xpath("//*[@id=\"swal2-html-container\"]");
    private final By aproveitarPromocoesEspeciais = By.xpath("//*[@id=\"top_header\"]//a[text()='Aproveitar...']");
    private final By menuLogin = By.xpath("//*[@id=\"top_header\"]//a[text()=' Login']");
    private final By menuCadastro = By.xpath("//*[@id=\"top_header\"]//a[text()=' Cadastro']");
    private final By menuHome = By.xpath("//*[@id=\"menuHome\"][text()='Home']");
    private final By menuEletronicos = By.id("item0");
    private final By menuComprar = By.xpath("//*[@id=\"root\"]//a[text()='Shop']");
    private final By menuLojaQuadroGrande = By.xpath("//*[@id=\"root\"]//a[text()='Shop Four Grid']");
    private final By menuCompreTresGrades = By.xpath("//*[@id=\"root\"]//a[text()='Shop Three Grid']");
    private final By menuVisualizacaoListaLojas = By.xpath("//*[@id=\"root\"]//a[text()='Shop List View']");
    private final By menuBarraLateralEsquerdaLoja = By.xpath("//*[@id=\"root\"]//a[text()='Shop Left Sidebar']");
    private final By menuBarraLateralDireitaLoja = By.xpath("//*[@id=\"root\"]//a[text()='Shop Right Sidebar']");
    private final By menuProdutoUnico = By.xpath("//*[@id=\"root\"]//a[text()='Product Single']");
    private final By menuProdutoUnicoDois = By.xpath("//*[@id=\"root\"]//a[text()='Product Single Two']");
    private final By menuVistaCarrinhoDois = By.xpath("//*[@id=\"root\"]//a[text()='Cart View Two']");
    private final By menuConfiraVisualizacao = By.xpath("//*[@id=\"root\"]//a[text()='Checkout View One']");
    private final By menuListaDeDesejos = By.xpath("//*[@id=\"root\"]//a[text()='Wishlist']");
    private final By menuAcompanhamentoDePedidos = By.xpath("//*[@id=\"root\"]//a[text()='Order Tracking']");
    private final By menuPedidoCompleto = By.xpath("//*[@id=\"root\"]//a[text()='Order Complete']");
    private final By menuQazandoShop = By.xpath("//*[@id=\"root\"]//div/nav/ul/li[2]/div/ul/li[3]/div/a/img");

    Utils utils = new Utils();
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage PromocoesEspeciaisDisponiveis() {
        utils.clicarElemento(aproveitarPromocoesEspeciais);
        return new HomePage(driver);
    }

    public HomePage AcessoTelaLogin() {
        utils.clicarElemento(menuLogin);
        return new HomePage(driver);
    }

    public HomePage AcessoTelaCadastro() {
        utils.clicarElemento(menuCadastro);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuEletronicos() {
        utils.clicarElemento(menuHome);
        utils.clicarElemento(menuEletronicos);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuLojaQuadroGrande() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuLojaQuadroGrande);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuCompreTresGrades() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuCompreTresGrades);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuVisualizacaoListaLojas() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuVisualizacaoListaLojas);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuBarraLateralEsquerdaLoja() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuBarraLateralEsquerdaLoja);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuBarraLateralDireitaLoja() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuBarraLateralDireitaLoja);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuProdutoUnico() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuProdutoUnico);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuProdutoUnicoDois() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuProdutoUnicoDois);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuVistaCarrinhoDois() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuVistaCarrinhoDois);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuConfiraVisualizacao() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuConfiraVisualizacao);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuListaDeDesejos() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuListaDeDesejos);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuAcompanhamentoDePedidos() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuAcompanhamentoDePedidos);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuPedidoCompleto() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuPedidoCompleto);
        return new HomePage(driver);
    }

    public HomePage AcessoMenuQazandoShop() {
        utils.clicarElemento(menuComprar);
        utils.clicarElemento(menuQazandoShop);
        return new HomePage(driver);
    }


    public HomePage digitarEmail(String arg) {
        utils.digitarElemento(email, arg);
        return new HomePage(driver);
    }

    public HomePage enviarEmail() {
        driver.findElement(enviarCorreio).sendKeys(Keys.ENTER);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoPaginaPromocoes() {
        By procurarElemento = By.xpath("//*[@id=\"shop_main_area\"]//a[text()='Green Dress For Woman']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/shop", assinaturaSucesso);
        return new HomePage(driver);
    }


    public HomePage validaroRedirecionamentoPaginaLogin() {
        By procurarElemento = By.id("user");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/login", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoPaginaCadastro() {
        By procurarElemento = By.id("//*[@id=\"shop_main_area\"]//a[text()='Green Dress For Woman']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/register", assinaturaSucesso);
        return new HomePage(driver);

    }

    public HomePage validaroRedirecionamentoPaginaEletronicos() {
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/electronics", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoCompreTresGrades() {
        By procurarElemento = By.xpath("//*[@id=\"shop_main_area\"]//a[text()='Green Dress For Woman']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/shopTwo", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoListaDeLojas() {
        By procurarElemento = By.xpath("//*[@id=\"shop_main_area\"]//a[text()='T-Shirt For Men']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/shoplist", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoBarraLateralEsquerdaLoja() {
        By procurarElemento = By.xpath("//*[@id=\"shop_main_area\"]//H4[text()='Product Categories']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/shop-left-bar", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoBarraLateralDireitaLoja() {
        By procurarElemento = By.xpath("//*[@id=\"shop_main_area\"]//H4[text()='Product Categories']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/shop-right-bar", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoProdutoUnico() {
        By procurarElemento = By.xpath("//*[@id=\"product_single_one\"]//a[text()='Description']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/product-details-one/1", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoProdutoUnicoDois() {
        By procurarElemento = By.xpath("//*[@id=\"product_single_two\"]//a[text()='Description']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/product-details-two/1", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoVistaDoCarrinhoDois() {
        By procurarElemento = By.xpath("//*[@id=\"cart_area_two\"]//a[text()='Fit-Flare Dress']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/cartTwo", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoConfiraVisualizacaoUm() {
        By procurarElemento = By.xpath("//*[@id=\"checkout_one\"]//h3[text()='Your Orders']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/checkout-one", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoListaDeDesejos() {
        By procurarElemento = By.xpath("//*[@id=\"Wishlist_area\"]//a[text()='Boho Tops for Girls']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/wishlist", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoAcompanhamentoDePedidos() {
        By procurarElemento = By.id("order_ID");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/order-tracking", assinaturaSucesso);
        return new HomePage(driver);
    }

    public HomePage validaroRedirecionamentoPedidoCompleto() {
        By procurarElemento = By.xpath("//*[@id=\"order_complet_area\"]//h2[text()='Your order is completed!']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.getCurrentUrl();
        Assert.assertEquals("https://automationpratice.com.br/order-complete", assinaturaSucesso);
        return new HomePage(driver);
    }


    public HomePage validaroAssinaturaBoletimNoticias() {
        By procurarElemento = By.xpath("//*[@id=\"swal2-title\"][text()='Success']");
        utils.esperarElementoEstarPresente(procurarElemento);
        String assinaturaSucesso = driver.findElement(validarConfirmacaoAssinatura).getText();
        Assert.assertEquals("Thank you for your Subscribtion", assinaturaSucesso);
        return new HomePage(driver);
    }
}
