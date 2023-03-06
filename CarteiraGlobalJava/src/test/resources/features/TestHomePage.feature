#language: pt
Funcionalidade: Testar as funcionalidades da home page do carteira global
	
	Como um usuario
	Desejo navegar pela home page do carteira global
	Para conhecer as funcionalidades

@ComparaçãoHomePage
Cenario: Como usuario opto por acessar a home page do carteira global e realizar uma comparação de investimentos
	Dado que opto por acessar a Home Page do Carteira Global
	Então o sistema apresenta a home page do Cateira Global - Conheça
	Dado que aceito os cookies 
	E opto por selecionar o fundo de investimento, "BB AÇÕES BB SEGURIDADE FIA" no Ranking de fundo de investimento
	E opto por selecionar o fundo de investimento, "CSHG VALOR VENTURE" no Ranking de fundo de investimento
	E opto por selecionar o fundo de investimento, "EXPLORITAS ALPHA AMERICA" no Ranking de fundo de investimento
	E seleciono a opção Comparar
	Então o sistema apresenta a pagina do carteira global com a comparação dos investimentos


@LoginHomePage
Cenario: Acessar a home page e efetuar um login
	Dado que opto por acessar a Home Page do Carteira Global
	Então o sistema apresenta a home page do Cateira Global - Conheça 
	E opto por clicar em entrar para realizar o acesso ao carteira global
	Então o sistema exibe a tela de login em app.carteiraglobal.com
	Dado que opto por digitar meu email e senha de acesso e clico em entrar
	Então o sistema apresenta a tela de Controle no Carteira Global


@ConheçaUmAtivo
Cenario: Acessar a home page e realizar uma busca para conhecer um ativo
	Dado que opto por acessar a Home Page do Carteira Global
	Então o sistema apresenta a home page do Cateira Global - Conheça 
	E opto por realizar uma busca pelo ativo "MGLU3"
	Então o sistema exibe a pagina do conheça com as informações do ativo buscado "MGLU3"
	
@NavegarComponentes
Cenario: Acessar a home page e navegar pela apresentação dos componentes
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça 
  Dado que opto por navegar para proxima pagina
  Entao o sistema apresenta a home page do Cateira Global - Compare
  Dado que opto por navegar para proxima pagina
  Entao o sistema apresenta a home page do Cateira Global - Controle
  Dado que opto por navegar para proxima pagina
  Entao o sistema apresenta a home page do Cateira Global - Conquiste
 
@ExperimenteConheça
  Cenario: Acessar a home page e acessar os menus do conheça exibidos em experimente e visualizar o conheça do carteira global
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  E opto por selecionar Conheça localizado em experimente
  Entao o sistema exibe as opções do componente Conheça
  Dado que opto por selecionar "Perfil de Ativos"
  Então o sistema apresenta a view de Perfil de Ativos
  Dado que opto por selecionar "Trading"
  Então o sistema apresenta a view de Trading 
  Dado que opto por selecionar "Eventos Corporativos"
  Então o sistema apresenta a view de Eventos Corporativos
  Dado que opto por selecionar "Contabilidade"
  Então o sistema apresenta a view de Contabilidade
  Dado que opto por selecionar "Portfólio de Fundos e FII"
  Então o sistema apresenta a view de Portifólio de Fundos e FII's
  Dado que opto por selecionar "Lâmina de Fundos"
  Então o sistema apresenta a view de Lâmina de Fundos
  Dado que opto por clicar no botão Acessar Conheça
  Então o sistema direciona para a pagina do Carteira Global - Conheça
	
	
