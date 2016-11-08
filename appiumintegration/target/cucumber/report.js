$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Meu primeiro teste",
  "description": "",
  "id": "meu-primeiro-teste",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Meu primeiro cenário",
  "description": "",
  "id": "meu-primeiro-teste;meu-primeiro-cenário",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "meu given teste",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "meu then teste",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "meu when teste",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "MyFirstSteps.meu_then_teste()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyFirstSteps.meu_when_teste()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("MySecondFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Meu segundo teste",
  "description": "",
  "id": "meu-segundo-teste",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Meu primeiro cenário",
  "description": "",
  "id": "meu-segundo-teste;meu-primeiro-cenário",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "meu segundo given teste",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "meu segundo then teste",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "meu segundo when teste",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});