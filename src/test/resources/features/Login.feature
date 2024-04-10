#language: pt
#autor:larissanc96@hotmail.com
@Login
Funcionalidade: Como cliente vou navegar até a tela de login

  Contexto: Acessar o login
    Dado que abra o navegador e acesse o site <vURL>

  @Chrome @autenticacao-sucesso
  Esquema do Cenário: Como cliente vou me autenticar no site
    Quando digitar o meu email <vEmail>
    E digitar a minha senha <vSenha>
    E clicar no botao Conecte-se
    Então devo me autenticar com sucesso <validaTexto>, <vImg>

    Exemplos:

      | validaTexto     | vImg                      | vEmail               | vSenha   |
      | Login realizado | Case_Autenticacao_Sucesso | android_17@teste.com | 11102023 |