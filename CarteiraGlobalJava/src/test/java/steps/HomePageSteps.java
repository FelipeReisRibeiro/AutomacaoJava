package steps;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import paginas.HomePagePagina;
import org.openqa.selenium.WebDriver;


public class HomePageSteps {
	
		private HomePagePagina home = new HomePagePagina();
		private WebDriver driver;
	
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
	    
	}

	@Então("o sistema apresenta a home page do Cateira Global - Compare")
	public void o_sistema_apresenta_a_home_page_do_cateira_global_compare() {
	    
	}

	@Então("o sistema apresenta a home page do Cateira Global - Controle")
	public void o_sistema_apresenta_a_home_page_do_cateira_global_controle() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Então("o sistema apresenta a home page do Cateira Global - Conquiste")
	public void o_sistema_apresenta_a_home_page_do_cateira_global_conquiste() {
	    
	}

	@Então("opto por selecionar Conheça localizado em experimente")
	public void opto_por_selecionar_conheça_localizado_em_experimente() {
	   
	}

	@Então("o sistema exibe as opções do componente Conheça")
	public void o_sistema_exibe_as_opções_do_componente_conheça() {
	    
	}
	@Dado("que opto por selecionar {string}")
	public void que_opto_por_selecionar(String string) {
	    
	}

	@Então("o sistema apresenta a view de Perfil de Ativos")
	public void o_sistema_apresenta_a_view_de_perfil_de_ativos() {
	    
	}

	@Então("o sistema apresenta a view de Trading")
	public void o_sistema_apresenta_a_view_de_trading() {
	    
	}

	@Então("o sistema apresenta a view de Eventos Corporativos")
	public void o_sistema_apresenta_a_view_de_eventos_corporativos() {
	    
	}

	@Então("o sistema apresenta a view de Contabilidade")
	public void o_sistema_apresenta_a_view_de_contabilidade() {
	   
	}

	@Então("o sistema apresenta a view de Portifólio de Fundos e FII's")
	public void o_sistema_apresenta_a_view_de_portifólio_de_fundos_e_fii_s() {
	    
	}

	@Então("o sistema apresenta a view de Lâmina de Fundos")
	public void o_sistema_apresenta_a_view_de_lâmina_de_fundos() {
	    
	}

	@Dado("que opto por clicar no botão Acessar Conheça")
	public void que_opto_por_clicar_no_botão_acessar_conheça() {
	    
	}

	@Então("o sistema direciona para a pagina do Carteira Global - Conheça")
	public void o_sistema_direciona_para_a_pagina_do_carteira_global_conheça() {
	    
	}
	
	
}
