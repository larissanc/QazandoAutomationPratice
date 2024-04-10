#language: pt
#autor:larissanc96@hotmail.com
@Cadastro
Funcionalidade: Como cliente vou navegar até a tela de cadastros

  @CadastroNovoCliente
  Esquema do Cenário: Como cliente vou realizar um novo cadastro
    Dado que abra o navegador e acesse o site
    Quando digitar o meu nome <vNome>
    Quando digitar o meu e-mail
    Quando digitar a minha senha <vSenha>
    E clicar no botao Cadastrar
    Então vejo uma mensagem de confirmação do meu cadastro

    Exemplos:

      | vNome     | vSenha   |
      | Android17 | 11102023 |