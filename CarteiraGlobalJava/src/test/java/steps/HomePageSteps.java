package steps;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import core.BaseSelenium;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import paginas.HomePagePagina;


public class HomePageSteps {
	
		private HomePagePagina home = new HomePagePagina();
		
	
	@Dado("que opto por acessar a Home Page do Carteira Global")
	public void que_opto_por_acessar_a_home_page_do_carteira_global() {
		home.navegarParaUrl();
	}

	@Então("o sistema apresenta a home page do Cateira Global - Conheça")
	public void o_sistema_apresenta_a_home_page_do_cateira_global_conheça() {
		home.validaHomePage();
	}
	
	@Dado("que aceito os cookies")
	public void que_aceito_os_cookies() {
	    home.aceitarCookies();
	}

	@Então("opto por selecionar o fundo de investimento, {string} no Ranking de fundo de investimento")
	public void opto_por_selecionar_o_fundo_de_investimento_no_ranking_de_fundo_de_investimento(String fundo) {
		home.selecionaFundoRanking(fundo);
	}

	@Então("seleciono a opção Comparar")
	public void seleciono_a_opção_comparar() {
	   home.selecionaComparar();
	}

	@Então("o sistema apresenta a pagina do carteira global com a comparação dos investimentos")
	public void o_sistema_apresenta_a_pagina_do_carteira_global_com_a_comparação_dos_investimentos() {
	    home.validaComparacao();
	}
	
	@Então("opto por clicar em entrar para realizar o acesso ao carteira global")
	public void opto_por_clicar_em_entrar_para_realizar_o_acesso_ao_carteira_global() {
		home.selectEntrar();
	}

	@Então("o sistema exibe a tela de login em app.carteiraglobal.com")
	public void o_sistema_exibe_a_tela_de_login_em_app_carteiraglobal_com() {
		home.pageLogin();
	}

	@Dado("que opto por digitar meu email e senha de acesso e clico em entrar")
	public void que_opto_por_digitar_meu_email_e_senha_de_acesso_e_clico_em_entrar() {
	   home.realizaAcesso();
	}

	@Então("o sistema apresenta a tela de Controle no Carteira Global")
	public void o_sistema_apresenta_a_tela_de_controle_no_carteira_global() {
	    home.controleCG();
	}

	@Então("opto por realizar uma busca pelo ativo {string}")
	public void opto_por_realizar_uma_busca_pelo_ativo(String ativo) {
	    home.buscarAtivo(ativo);
	}

	@Então("o sistema exibe a pagina do conheça com as informações do ativo buscado {string}")
	public void o_sistema_exibe_a_pagina_do_conheça_com_as_informações_do_ativo_buscado(String string) {
	    home.validaConhecaAtivo();
	}
	
	@Dado("que opto por navegar para proxima pagina")
	public void que_opto_por_navegar_para_proxima_pagina() {
	    home.proximaPagina();
	}
	
	@Então("o sistema apresenta pagina inicial da home page do Cateira Global {string}")
	public void o_sistema_apresenta_pagina_inicial_da_home_page_do_cateira_global(String homepaginaInicial) {
	    home.paginaInicialEmExibicao(homepaginaInicial);
	}
	
	@Então("o sistema apresenta a home page do Cateira Global {string}")
	public void o_sistema_apresenta_a_home_page_do_cateira_global(String homepagina) {
	    home.paginaEmExibicao(homepagina);
	}
	
	@Então("o sistema apresenta a ultima pagina da home page do Cateira Global {string}")
	public void o_sistema_apresenta_a_ultima_pagina_da_home_page_do_cateira_global(String ultimaHomepagina) {
	    home.ultimaPaginaExibicao(ultimaHomepagina);
	}
	
	@Então("opto por selecionar {string} localizado em experimente")
	public void opto_por_selecionar_localizado_em_experimente(String experimente) {
		home.Experimente(experimente);
	}

	@Então("o sistema exibe as opções do componente Conheça")
	public void o_sistema_exibe_as_opções_do_componente_conheça() {
	    home.validaConhecaExperimente();
	}
	
	@Dado("que opto por selecionar {string}")
	public void que_opto_por_selecionar(String opcExperimente) {
		home.selecionarComponentesExperimente(opcExperimente);
	}

	@Então("o sistema apresenta a view de Perfil de Ativos")
	public void o_sistema_apresenta_a_view_de_perfil_de_ativos() {
		home.validaViewPerfilAtivos();
	}

	@Então("o sistema apresenta a view de Trading")
	public void o_sistema_apresenta_a_view_de_trading() {
		home.validaViewTrading();
	}

	@Então("o sistema apresenta a view de Eventos Corporativos")
	public void o_sistema_apresenta_a_view_de_eventos_corporativos() {
		home.validaViewEventosCorporativos();
	}

	@Então("o sistema apresenta a view de Contabilidade")
	public void o_sistema_apresenta_a_view_de_contabilidade() {
		home.validaViewContabilidade();
	}

	@Então("o sistema apresenta a view de Portifólio de Fundos e FII's")
	public void o_sistema_apresenta_a_view_de_portifólio_de_fundos_e_fii_s() {
		home.validaViewPortifólioFundosFII();
	}

	@Então("o sistema apresenta a view de Lâmina de Fundos")
	public void o_sistema_apresenta_a_view_de_lâmina_de_fundos() {
		home.validaViewLâminaFundos();
	}

	@Dado("que opto por clicar no botão Acessar Conheça")
	public void que_opto_por_clicar_no_botão_acessar_conheça() {
	    home.acessarConheca();
	}

	@Então("o sistema direciona para a pagina do Carteira Global - Conheça")
	public void o_sistema_direciona_para_a_pagina_do_carteira_global_conheça() {
	    home.validaConhecaCarteiraGlobal();
	}
		
	@Então("o sistema exibe as opções do componente Compare")
	public void oSistemaExibeAsOpçõesDoComponenteCompare() {
		home.validaCompareExperimente();
	}
	
	@Então("o sistema apresenta a view do Comparador de Investimentos")
	public void oSistemaApresentaAViewDoComparadorDeInvestimentos() {
		home.validaViewComparador();
	}
	
	@Então("o sistema apresenta a view de Matriz de Correlação")
	public void oSistemaApresentaAViewDeMatrizDeCorrelação() {
		home.validaViewMatriz();
	}
	
	@Então("o sistema apresenta a view do Comparador de Renda Fixa")
	public void oSistemaApresentaAViewDoComparadorDeRendaFixa() {
		home.validaViewCompRendaFixa();
	}
	
	@Dado("que opto por clicar no botão Acessar Compare")
	public void queOptoPorClicarNoBotãoAcessarCompare() {
	   home.AcessarComparadorCG();
	}
	
	@Então("o sistema direciona para a pagina do Carteira Global - Comparador de Investimentos")
	public void oSistemaDirecionaParaAPaginaDoCarteiraGlobalComparadorDeInvestimentos() {
	    home.comparadorInvestimentoCG();
	}
		
	@Então("o sistema exibe as opções do componente Controle")
	public void oSistemaExibeAsOpçõesDoComponenteControle() {
		home.validaControleExperimente();
	}
	
	@Então("o sistema apresenta a view de Resumo")
	public void oSistemaApresentaAViewDeResumo() {
		home.validaViewResumo();
	}
	
	@Então("o sistema apresenta a view de Posição")
	public void oSistemaApresentaAViewDePosição() {
		home.validaViewPsicao();
	}
	
	@Então("o sistema apresenta a view de Evolução")
	public void oSistemaApresentaAViewDeEvolução() {
		home.validaViewEvolucao();
	}
	
	@Então("o sistema apresenta a view de Performance")
	public void oSistemaApresentaAViewDePerformance() {
		home.validaViewPerformance();
	}
	
	@Então("o sistema apresenta a view de Financeiro")
	public void oSistemaApresentaAViewDeFinanceiro() {
		home.validaViewFinanceiro();
	}
	
	@Então("o sistema apresenta a view de Risco")
	public void oSistemaApresentaAViewDeRisco() {
		home.validaViewRisco();
	}
	
	@Dado("que opto por selecionar o botão Acessar Controle")
	public void queOptoPorSelecionarOBotãoAcessarControle() {
		home.AcessarControleCG();
	}
	
	@Então("o sistema direciona para a pagina de login do Carteira Global")
	public void oSistemaDirecionaParaAPaginaDeLoginDoCarteiraGlobal() {
		 home.pageloginCG();
	}

	@Então("o sistema exibe as opções do componente Conquiste")
	public void oSistemaExibeAsOpçõesDoComponenteConquiste() {
		home.validaConquisteExperimente();
	}
	
	@Então("o sistema apresenta a view de Simulador de carteiras")
	public void oSistemaApresentaAViewDeSimuladorDeCarteiras() {
		home.validaViewSimuladorCart();
	}
	
	@Então("o sistema apresenta a view de Estudos de Investimento")
	public void oSistemaApresentaAViewDeEstudosDeInvestimento() {
		home.validaViewEstudoInvest();
	}
	
	@Então("o sistema apresenta a view de Comparador de Carteiras")
	public void oSistemaApresentaAViewDeComparadorDeCarteiras() {
		home.validaViewComparadorCart();
	}
	
	@Dado("que opto por selecionar o botão Acessar Conquiste")
	public void queOptoPorSelecionarOBotãoAcessarConquiste() {
		home.AcessarConquiste();
	}

	@Dado("que opto por selecionar a opção {string} localizada no menu superior")
	public void queOptoPorSelecionarAOpçãoLocalizadaNoMenuSuperior(String opcaoMenuSup) {
	   home.selecionaMenusuperior(opcaoMenuSup);
	}
	
	@Então("sistema apresenta o menu do Conheça")
	public void sistemaApresentaOMenuDoConheça() {
	    home.menuSupConheca();
	}
	
	@Dado("que opto por selecionar a opção {string}")
	public void queOptoPorSelecionarAOpção(String opcaosubMenu) {
		home.selecionaOpcaoSubMenu(opcaosubMenu);
	}
	
	@Então("o sistema apresenta o conheça {string} - Carteira Global")
	public void oSistemaApresentaOConheçaCarteiraGlobal(String opcaoConheca) {
	    home.validaOpcaoEscolhidaConheca(opcaoConheca);
	}
	
	@Então("o sistema apresenta o conheça, Fundos de Investimento - Carteira Global")
	public void oSistemaApresentaOConheçaFundosDeInvestimentoCarteiraGlobal() {
	    home.validaOpcaoFundoInvestConheca();
	}
	
	@Então("sistema apresenta o menu do Compare")
	public void sistemaApresentaOMenuDoCompare() {
		home.menuSupCompare();
	}
	
	@Então("o sistema apresenta o {string} - Carteira Global")
	public void oSistemaApresentaOCarteiraGlobal(String opcaoCompare) {
		 home.validaOpcaoEscolhidaCompare(opcaoCompare);
	}
	
	@Então("o sistema apresenta a {string} - Carteira Global")
	public void oSistemaApresentaACarteiraGlobal(String opcaoMatriz) {
		home.validaOpcaoEscolhidaMatriz(opcaoMatriz);
	}

	@Então("sistema apresenta o menu do Controle")
	public void sistemaApresentaOMenuDoControle() {
		home.menuSupControle();
	}
	
	@Então("sistema apresenta o menu do Conquiste")
	public void sistemaApresentaOMenuDoConquiste() {
		home.menuSupConquiste();
	}
	
	@Então("o sistema apresenta o Conquiste - Estudo de Investimento")
	public void oSistemaApresentaOConquisteEstudoDeInvestimento() {
	   home.validaConquisteEstudoInvest();
	}
	@After
	public void screenshot(Scenario cenario) throws IOException {
		File print = ((TakesScreenshot) BaseSelenium.driver).getScreenshotAs(OutputType.FILE);
		File destino = new File( System.getProperty("user.dir") + File.separator +"target" + File.separator
				+ "screnshot" + File.separator + "PrintsConcluido" + File.separator + cenario.getName() + ".png");
		FileUtils.copyFile(print, destino);
	}
	}