$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#autor:larissanc96@hotmail.com"
    }
  ],
  "line": 4,
  "name": "Como cliente vou navegar até a tela de login",
  "description": "",
  "id": "como-cliente-vou-navegar-até-a-tela-de-login",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Como cliente vou me autenticar no site",
  "description": "",
  "id": "como-cliente-vou-navegar-até-a-tela-de-login;como-cliente-vou-me-autenticar-no-site",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 9,
      "name": "@Chrome"
    },
    {
      "line": 9,
      "name": "@autenticacao-sucesso"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "digitar o meu email \u003cvEmail\u003e",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "digitar a minha senha \u003cvSenha\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao Conecte-se",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "devo me autenticar com sucesso \u003cvalidaTexto\u003e, \u003cvImg\u003e",
  "keyword": "Então "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "como-cliente-vou-navegar-até-a-tela-de-login;como-cliente-vou-me-autenticar-no-site;",
  "rows": [
    {
      "cells": [
        "validaTexto",
        "vImg",
        "vEmail",
        "vSenha"
      ],
      "line": 18,
      "id": "como-cliente-vou-navegar-até-a-tela-de-login;como-cliente-vou-me-autenticar-no-site;;1"
    },
    {
      "cells": [
        "Login realizado",
        "Case_Autenticacao_Sucesso",
        "android_17@teste.com",
        "11102023"
      ],
      "line": 19,
      "id": "como-cliente-vou-navegar-até-a-tela-de-login;como-cliente-vou-me-autenticar-no-site;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 2440005300,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Acessar o login",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que abra o navegador e acesse o site \u003cvURL\u003e",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cvURL\u003e",
      "offset": 37
    }
  ],
  "location": "HomeSteps.que_eu_abra_meu_navegador_e_acesse_o_site(String)"
});
formatter.result({
  "duration": 998719900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Como cliente vou me autenticar no site",
  "description": "",
  "id": "como-cliente-vou-navegar-até-a-tela-de-login;como-cliente-vou-me-autenticar-no-site;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 9,
      "name": "@autenticacao-sucesso"
    },
    {
      "line": 9,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "digitar o meu email android_17@teste.com",
  "matchedColumns": [
    2
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "digitar a minha senha 11102023",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao Conecte-se",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "devo me autenticar com sucesso Login realizado, Case_Autenticacao_Sucesso",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "android_17@teste.com",
      "offset": 20
    }
  ],
  "location": "LoginSteps.digitar_o_meu_email(String)"
});
formatter.result({
  "duration": 1123234300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11102023",
      "offset": 22
    }
  ],
  "location": "CadastroSteps.digitar_a_minha_senha(String)"
});
formatter.result({
  "duration": 173393400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clicar_no_botao_Conecte_se()"
});
formatter.result({
  "duration": 145437400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login realizado",
      "offset": 31
    },
    {
      "val": "Case_Autenticacao_Sucesso",
      "offset": 48
    }
  ],
  "location": "LoginSteps.devo_me_autenticar_com_sucesso(String,String)"
});
formatter.result({
  "duration": 1347322000,
  "status": "passed"
});
formatter.write("SUCESS_Como cliente vou me autenticar no site_passed");
formatter.after({
  "duration": 963725300,
  "status": "passed"
});
});