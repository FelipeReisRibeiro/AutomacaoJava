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
	Dado que aceito os cookies 
	E opto por clicar em entrar para realizar o acesso ao carteira global
	Então o sistema exibe a tela de login em app.carteiraglobal.com
	Dado que opto por digitar meu email e senha de acesso e clico em entrar
	Então o sistema apresenta a tela de Controle no Carteira Global


@ConheçaUmAtivo
Cenario: Acessar a home page e realizar uma busca para conhecer um ativo
	Dado que opto por acessar a Home Page do Carteira Global
	Então o sistema apresenta a home page do Cateira Global - Conheça
	Dado que aceito os cookies
	E opto por realizar uma busca pelo ativo "MGLU3"
	Então o sistema exibe a pagina do conheça com as informações do ativo buscado "MGLU3"
	
	
@NavegarComponentes
Cenario: Acessar a home page e navegar pela apresentação dos componentes
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta pagina inicial da home page do Cateira Global "Conheça"
  Dado que aceito os cookies
  Dado que opto por navegar para proxima pagina
  Então o sistema apresenta a home page do Cateira Global "Compare"
  Dado que opto por navegar para proxima pagina
  Então o sistema apresenta a home page do Cateira Global "Controle"
  Dado que opto por navegar para proxima pagina
  Então o sistema apresenta a ultima pagina da home page do Cateira Global "Conquiste"
 
 
@ExperimenteConheça
  Cenario: Acessar a home page e acessar os menus do conheça exibidos em experimente e visualizar o conheça do carteira global
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  E opto por selecionar "Conheça" localizado em experimente
  Então o sistema exibe as opções do componente Conheça
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
	
@ExperimenteCompare
  Cenario: Acessar a home page e acessar os menus do Compare exibidos em experimente e visualizar o comparador de investimentos
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  E opto por selecionar "Compare" localizado em experimente
  Então o sistema exibe as opções do componente Compare
  Dado que opto por selecionar "Comparador de Investimentos"
  Então o sistema apresenta a view do Comparador de Investimentos
  Dado que opto por selecionar "Matriz de Correlação"
  Então o sistema apresenta a view de Matriz de Correlação
  Dado que opto por selecionar "Comparador de Renda Fixa"
  Então o sistema apresenta a view do Comparador de Renda Fixa
  Dado que opto por clicar no botão Acessar Compare
  Então o sistema direciona para a pagina do Carteira Global - Comparador de Investimentos

@ExperimenteControle
  Cenario: Acessar a home page e acessar os menus do Controle exibidos em experimente 
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  E opto por selecionar "Controle" localizado em experimente
  Então o sistema exibe as opções do componente Controle
  Dado que opto por selecionar "Resumo"
  Então o sistema apresenta a view de Resumo
  Dado que opto por selecionar "Posição"
  Então o sistema apresenta a view de Posição
  Dado que opto por selecionar "Evolução"
  Então o sistema apresenta a view de Evolução
  Dado que opto por selecionar "Performance"
  Então o sistema apresenta a view de Performance
  Dado que opto por selecionar "Financeiro"
  Então o sistema apresenta a view de Financeiro
  Dado que opto por selecionar "Risco"
  Então o sistema apresenta a view de Risco
  Dado que opto por selecionar o botão Acessar Controle
  Então o sistema direciona para a pagina de login do Carteira Global
  
@ExperimenteConquiste
  Cenario: Acessar a home page e acessar os menus do Conquiste exibidos em experimente
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  E opto por selecionar "Conquiste" localizado em experimente
  Então o sistema exibe as opções do componente Conquiste
  Dado que opto por selecionar "Simulador de carteiras"
  Então o sistema apresenta a view de Simulador de carteiras
  Dado que opto por selecionar "Estudos de Investimento"
  Então o sistema apresenta a view de Estudos de Investimento 
  Dado que opto por selecionar "Comparador de Carteiras"
  Então o sistema apresenta a view de Comparador de Carteiras
  Dado que opto por selecionar o botão Acessar Conquiste
  Então o sistema direciona para a pagina de login do Carteira Global

@ConhecaTesouro
  Cenario: Como usuario quero acessar o conheça de tesouro direto localizado no menu superior Conheça
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  Dado que opto por selecionar a opção "Conheça" localizada no menu superior 
  Então sistema apresenta o menu do Conheça
  Dado que opto por selecionar a opção "Tesouro Direto"
  Então o sistema apresenta o conheça "Tesouro Direto" - Carteira Global

@ConhecaFundosInvest
  Cenario: Como usuario quero acessar o conheça de Fundos de Investimentos localizado no menu superior Conheça
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  Dado que opto por selecionar a opção "Conheça" localizada no menu superior 
  Então sistema apresenta o menu do Conheça
  Dado que opto por selecionar a opção "Fundos de Investimento"
  Então o sistema apresenta o conheça, Fundos de Investimento - Carteira Global

@ConhecaFundosImob
  Cenario:  Como usuario quero acessar o conheça de Fundos Imobiliários localizado no menu superior Conheça
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  Dado que opto por selecionar a opção "Conheça" localizada no menu superior 
  Então sistema apresenta o menu do Conheça
  Dado que opto por selecionar a opção "Fundos Imobiliários"
  Então o sistema apresenta o conheça "Fundos Imobiliários" - Carteira Global

@ConhecaETFs
  Cenario: Como usuario quero acessar o conheça de ETFs localizado no menu superior Conheça
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  Dado que opto por selecionar a opção "Conheça" localizada no menu superior 
  Então sistema apresenta o menu do Conheça
  Dado que opto por selecionar a opção "ETFs"
  Então o sistema apresenta o conheça "ETFs" - Carteira Global

@ConhecaAcoes
  Cenario: Como usuario quero acessar o conheça de Ações localizado no menu superior Conheça
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  Dado que opto por selecionar a opção "Conheça" localizada no menu superior 
  Então sistema apresenta o menu do Conheça
  Dado que opto por selecionar a opção "Ações"
  Então o sistema apresenta o conheça "Ações" - Carteira Global
 
@ConhecaBDR
  Cenario: Como usuario quero acessar o conheça de BDRs localizado no menu superior Conheça
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que aceito os cookies
  Dado que opto por selecionar a opção "Conheça" localizada no menu superior 
  Então sistema apresenta o menu do Conheça
  Dado que opto por selecionar a opção "BDRs"
  Então o sistema apresenta o conheça "BDRs" - Carteira Global
  
 @CompareComparador
  Cenario: Como usuario quero acessar o Comparador de Investimentos localizado no menu superior Compare
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que opto por selecionar a opção "Compare" localizada no menu superior 
  Então sistema apresenta o menu do Compare
  Dado que opto por selecionar a opção "Comparador de Investimentos"
  Então o sistema apresenta o "Comparador de Investimentos" - Carteira Global
  
@CompareMatriz
  Cenario: Como usuario quero acessar a Matriz de Correlação localizado no menu superior Compare  
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que opto por selecionar a opção "Compare" localizada no menu superior 
  Então sistema apresenta o menu do Compare
  Dado que opto por selecionar a opção "Matriz de Correlação"
  Então o sistema apresenta a "Matriz de Correlação" - Carteira Global
  
@CompareSimulador
  Cenario: Como usuario quero acessar o Simulador de Renda Fixa localizado no menu superior Compare
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que opto por selecionar a opção "Compare" localizada no menu superior 
  Então sistema apresenta o menu do Compare
  Dado que opto por selecionar a opção "Simulador de Renda Fixa"
  Então o sistema apresenta o "Simulador de Renda Fixa" - Carteira Global
  
@ControleGestao
  Cenario: Como usuario quero acessar a Gestão de Carteiras localizado no menu superior Controle
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que opto por selecionar a opção "Controle" localizada no menu superior 
  Então sistema apresenta o menu do Controle
  Dado que opto por selecionar a opção "Gestão de Carteiras"
  Então o sistema direciona para a pagina de login do Carteira Global
  
     
@ConquisteEstudo
  Cenario: Como usuario quero acessar a opção Estudo de investimentos localizado no menu superior Conquiste
  Dado que opto por acessar a Home Page do Carteira Global
  Então o sistema apresenta a home page do Cateira Global - Conheça
  Dado que opto por selecionar a opção "Conquiste" localizada no menu superior 
  Então sistema apresenta o menu do Conquiste
  Dado que opto por selecionar a opção "Estudo de Investimento"
  Então o sistema apresenta o Conquiste - Estudo de Investimento 
 
