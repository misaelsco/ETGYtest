Feature: Testes para a funcionalidade "Socorro para Pane"
	
	Scenario: Socorro para pane sem estar logado
		Given não estou logado no aplicativo
		And desejo solicitar socorro
		When eu clicar no menu "Socorro para Pane"
		Then a tela de login deve ser exibida
		
		