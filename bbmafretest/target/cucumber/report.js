$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SocorroPane.feature");
formatter.feature({
  "line": 1,
  "name": "Testes para a funcionalidade \"Socorro para Pane\"",
  "description": "",
  "id": "testes-para-a-funcionalidade-\"socorro-para-pane\"",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Socorro para pane sem estar logado",
  "description": "",
  "id": "testes-para-a-funcionalidade-\"socorro-para-pane\";socorro-para-pane-sem-estar-logado",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "não estou logado no aplicativo",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "desejo solicitar socorro",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "eu clicar no menu \"Socorro para Pane\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "a tela de login deve ser exibida",
  "keyword": "Then "
});
formatter.match({
  "location": "SocorroParaPaneTest.não_estou_logado_no_aplicativo()"
});
formatter.result({
  "duration": 47987853313,
  "status": "passed"
});
formatter.match({
  "location": "SocorroParaPaneTest.desejo_solicitar_socorro()"
});
formatter.result({
  "duration": 6137294,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.entelgy.bbmafre.bbmafretest.SocorroParaPaneTest.desejo_solicitar_socorro(SocorroParaPaneTest.java:74)\r\n\tat ✽.And desejo solicitar socorro(SocorroPane.feature:5)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "Socorro para Pane",
      "offset": 19
    }
  ],
  "location": "SocorroParaPaneTest.eu_clicar_no_menu(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SocorroParaPaneTest.a_tela_de_login_deve_ser_exibida()"
});
formatter.result({
  "status": "skipped"
});
});