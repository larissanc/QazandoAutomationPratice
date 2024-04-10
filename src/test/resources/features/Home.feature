#language: pt
#autor:larissanc96@homail.com
@Home
Funcionalidade: Como usuario vou navegar pela QAZANDO SHOP

  @HomePromocoesEspeciais
  Cenário: Como usuário do Qazando Shop vou navegar pelas promoções especiais disponíveis
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar nas promocoes disponiveis especiais
    E ser redirecionado para a pagina de promocoes

  @HomeConectese
  Cenário: Como usuário do Qazando Shop vou acessar a tela Conecte-se
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no menu Conecte-se
    E ser redirecionado para a pagina de Conecte-se

  @HomeCadastro
  Cenário: Como usuário do Qazando Shop vou acessar a tela de Cadastro
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no menu Cadastro
    E ser redirecionado para a pagina de Cadastro

  @HomeMenuEletronicos
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Eletrônicos
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Eletronicos
    E ser redirecionado para a pagina de Eletrônicos

  @HomeMenuLojaQuadroGrande
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Loja Quadro Grande
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Loja Quadro Grande
    E ser redirecionado para a pagina de promocoes

  @HomeMenuCompreTresGrades
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Compre Tres Grades
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Compre Tres Grades
    E ser redirecionado para a pagina Compre Tres Grades

  @HomeMenuVisualizacaoListaLojas
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Visualizacao de Lista de Lojas
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Visualizacao de Lista de Lojas
    E ser redirecionado para a pagina Visualizacao de Lista de Lojas

  @HomeMenuBarraLateralEsquerdaLoja
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Visualizacao de Lista de Lojas
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Barra Lateral Esquerda da Loja
    E ser redirecionado para a pagina Barra Lateral Esquerda da Loja

  @HomeMenuBarraLateralDireitaLoja
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Comprar Barra Lateral Direita
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Comprar Barra Lateral Direita
    E ser redirecionado para a pagina Comprar Barra Lateral Direita

  @HomeMenuProdutoUnico
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Produto Unico
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Produto Unico
    E ser redirecionado para a pagina Produto Unico

  @HomeMenuProdutoUnicoDois
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Produto Unico Dois
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Produto Unico Dois
    E ser redirecionado para a pagina Produto Unico Dois

  @HomeMenuVistaCarrinhoDois
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Vista Do Carrinho Dois
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Vista Do Carrinho Dois
    E ser redirecionado para a pagina Vista Do Carrinho Dois

  @HomeMenuConfiraVisualizacao
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Confira A Visualizacao
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Confira A Visualizacao
    E ser redirecionado para a pagina Confira A Visualizacao Um

  @HomeMenuListaDeDesejos
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Lista De Desejos
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Lista De Desejos
    E ser redirecionado para a pagina Lista De Desejos

  @HomeMenuAcompanhamentoDePedidos
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Acompanhamento De Pedidos
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Acompanhamento De Pedidos
    E ser redirecionado para a pagina Acompanhamento De Pedidos

  @HomeMenuPedidoCompleto
  Cenário: Como usuário do Qazando Shop vou acessar o submenu Pedido Completo
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu Pedido Completo
    E ser redirecionado para a pagina Pedido Completo

  @HomeMenuQazandoShop
  Cenário: Como usuário do Qazando Shop vou acessar o submenu QazandoShop
    Dado que abra o navegador e acesse o site
    Quando na pagina home o usuario clicar no submenu QazandoShop
    E ser redirecionado para a pagina de promocoes

  @HomeCadastrarEmailBoletimNoticias
  Esquema do Cenário: Como usuário do Qazando Shop vou me cadastrar para receber o boletim de notícias
    Dado que abra o navegador e acesse o site
    Quando preencho o meu e-mail <vEmail>
    E clico no botao Enviar Correio
    Então vejo uma mensagem de confirmação da minha assinatura

    Exemplos:

      | vEmail               |
      | android_17@teste.com |
