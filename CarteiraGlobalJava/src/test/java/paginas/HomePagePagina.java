package paginas;

import org.openqa.selenium.By;
import core.BaseSelenium;
import elementos.HomePageElements;

public class HomePagePagina extends BaseSelenium {
	
		private HomePageElements home = new HomePageElements();
		
		
		public void validaHomePage() {
			esperarPadrao(3);
			esperarElementoExistir(home.getLogo_CarteiraGlobal());
		}
		
		public void aceitarCookies() {
			esperarPadrao(3);
			
			if (existe(home.getBtn_AceitarCookies()) == true) {
				clicar(home.getBtn_AceitarCookies());
			}
		}

		public void selecionaFundoRanking(String fundo) {
			esperarElementoExistir(home.getTab_RankFundos());
			moverParaElemento(By.xpath("//h1[@class='title hidden lg:block'][contains(.,'Ranking • Fundos de Investimento')]"));
			clicar(By.xpath("//html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/table[1]/tbody[1]/tr[contains(.,'"+fundo+"')]/td[1]/input[1]"));
			
		}

		public void selecionaComparar() {
			clicar(home.getBtn_Comparar());
		}

		public void validaComparacao() {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			esperarSerVisivel(home.getPagComparador());
			esperarElementoExistir(home.getPagComparador());
		}
		
		public void selectEntrar() {
			esperarSerClicavel(home.getBtn_Entrar());
			clicar(home.getBtn_Entrar());
		}

		public void pageLogin() {
			esperarPadrao(5);
			esperarElementoExistir(home.getPagLogin());
		}

		public void realizaAcesso() {
			realizaLoginCG();
		}

		public void controleCG() {
			esperarPadrao(10);
			esperarElementoExistir(home.getPgCarteiraGlobal());
		}

		public void buscarAtivo(String ativo) {
			escreveNoCampo(home.getCmp_BuscaAtivo(),ativo);
			esperarPadrao(5);
			moverParaElemento(By.xpath("//strong[contains(.,'"+ativo+"')]"));
			clicar(By.xpath("//strong[contains(.,'"+ativo+"')]"));
		}

		public void validaConhecaAtivo() {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			esperarElementoExistir(By.xpath("//a[@class='h-full flex items-center text-step-description'][contains(.,'Conheça')]"));
		}
		
		public void proximaPagina(){
			clicar(home.getBtn_Proxima());
		}

		public void paginaEmExibicao(String homepagina) {
			esperarPadrao(2);
			esperarElementoExistir(By.xpath("(//p[@class='subtitle-slide'][normalize-space()='"+homepagina+"'])[1]"));
		}
		
		public void Experimente(String experimente) {
			esperarElementoExistir(By.xpath("//span[contains(.,'"+experimente+"')]"));
			moverParaElemento(By.xpath("//span[contains(.,'"+experimente+"')]"));
			clicar(By.xpath("//span[contains(.,'"+experimente+"')]"));
		}

		public void validaConhecaExperimente() {
			esperarElementoExistir(By.xpath("//p[normalize-space()='Perfil de Ativos']"));
		}

		public void selecionarComponentesExperimente(String opcExperimente) {
			esperarPadrao(3);
			esperarElementoExistir(By.xpath("//p[@class='title'][contains(.,'"+opcExperimente+"')]"));
			clicar(By.xpath("//p[@class='title'][contains(.,'"+opcExperimente+"')]"));
		}

		public void validaViewPerfilAtivos() {
			esperarElementoExistir(home.getImg_PerfilAtivos());
		}

		public void validaViewTrading() {
			esperarElementoExistir(home.getImg_Trading());
		}

		public void validaViewEventosCorporativos() {
			esperarElementoExistir(home.getImg_EventosCorp());
		}

		public void validaViewContabilidade() {
			esperarElementoExistir(home.getImg_Contabilidade());
		}

		public void validaViewPortifólioFundosFII() {
			esperarElementoExistir(home.getImg_ProtFundFII());
		}

		public void validaViewLâminaFundos() {
			esperarElementoExistir(home.getImg_LaminaFundos());
		}

		public void acessarConheca() {
			esperarElementoExistir(home.getBtn_AcessarConheca());
			clicar(home.getBtn_AcessarConheca());
		}

		public void validaConhecaCarteiraGlobal() {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			esperarElementoExistir(By.xpath("//a[@class='h-full flex items-center font-medium text-primary'][contains(.,'Conheça')]"));
		}

		public void paginaInicialEmExibicao(String homepaginaInicial) {
			esperarElementoExistir(By.xpath("//div[@class='swiper-pagination swiper-pagination-clickable swiper-pagination-bullets c-pagination']//span[1]"));
			clicar(By.xpath("//div[@class='swiper-pagination swiper-pagination-clickable swiper-pagination-bullets c-pagination']//span[1]"));
		}

		public void ultimaPaginaExibicao(String ultimaHomepagina) {
			esperarElementoExistir(By.xpath("//div[@class='swiper-slide swiper-slide-active']//p[@class='subtitle-slide'][normalize-space()='Conquiste']"));
		}

		public void validaCompareExperimente() {
			esperarElementoExistir(By.xpath("//p[normalize-space()='Comparador de Investimentos']"));
		}

		public void validaViewComparador() {
			esperarElementoExistir(home.getImg_ComparaInvestimentos());
		}

		public void validaViewMatriz() {
			esperarElementoExistir(home.getImg_MatrizCorrelacao());
		}

		public void validaViewCompRendaFixa() {
			esperarElementoExistir(home.getImg_ComparaRendaFixa());
		}

		public void AcessarComparadorCG() {
			clicar(home.getBtn_AcessarCompare());
		}

		public void comparadorInvestimentoCG() {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			esperarElementoExistir(By.xpath("//a[@class='h-full flex items-center text-step-description'][contains(.,'Compare')]"));
		}

		public void validaControleExperimente() {
			esperarElementoExistir(By.xpath("/html[1]/body[1]/div[1]/div[3]/main[1]/div[2]/div[3]/span[contains(.,'Controle')]"));
		}

		public void validaViewResumo() {
			esperarElementoExistir(home.getImg_Resumo());
		}

		public void validaViewPsicao() {
			esperarElementoExistir(home.getImg_Posição());
		}

		public void validaViewEvolucao() {
			esperarElementoExistir(home.getImg_Evolução());
		}

		public void validaViewPerformance() {
			esperarElementoExistir(home.getImg_Performance());
		}

		public void validaViewFinanceiro() {
			esperarElementoExistir(home.getImg_Financeiro());
		}

		public void validaViewRisco() {
			esperarElementoExistir(home.getImg_Risco());
		}

		public void AcessarControleCG() {
			clicar(home.getBtn_AcessarControle());
		}
					
		public void pageloginCG() {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			if (existe(By.xpath("//img[contains(@class,'mb-14')]")) == true){
				realizaLoginCG();
			}else {
				esperarElementoExistir(By.xpath("//div[1]/div[1]/header[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/article[1]/section[contains(.,'Controle')]"));
			}
		}

		public void validaConquisteExperimente() {
			esperarPadrao(2);
			esperarElementoExistir(By.xpath("//p[@class='title'][contains(.,'Simulador de carteiras')]"));
		}

		public void validaViewSimuladorCart() {
			esperarElementoExistir(home.getImg_SimuladorCarteiras());
		}

		public void validaViewEstudoInvest() {
			esperarElementoExistir(home.getImg_EstudoInvestimento());
		}

		public void validaViewComparadorCart() {
			esperarElementoExistir(home.getImg_ComparadorCarteiras());
		}

		public void AcessarConquiste() {
			clicar(home.getBtn_AcessarConquiste());
		}

		public void selecionaMenusuperior(String opcaoMenuSup) {
			esperarElementoExistir(By.xpath("//button[@class='c-button c-button-link'][contains(.,'"+opcaoMenuSup+"')]"));
			clicar(By.xpath("//button[@class='c-button c-button-link'][contains(.,'"+opcaoMenuSup+"')]"));
		}

		public void menuSupConheca() {
			esperarElementoExistir(By.xpath("//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/ul[1]/li[1]/ul[1]"));
		}

		public void selecionaOpcaoSubMenu(String opcaosubMenu) {
			esperarElementoExistir(By.xpath("//header[contains(.,'"+opcaosubMenu+"')]"));
			clicar(By.xpath("//header[contains(.,'"+opcaosubMenu+"')]"));
		}

		public void validaOpcaoEscolhidaConheca(String opcaoConheca) {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			if (existe(By.xpath("//img[contains(@class,'mb-14')]")) == true){
				realizaLoginCG();
			}else {
				esperarElementoExistir(By.xpath("//span[@class='text-step-description'][contains(.,'"+opcaoConheca+"')]"));
			}
		}

		public void validaOpcaoFundoInvestConheca() {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			if (existe(By.xpath("//img[contains(@class,'mb-14')]")) == true){
				realizaLoginCG();
			}else {
			esperarElementoExistir(By.xpath("//div[1]/main[1]/section[1]/div[1]/nav[1]/ul[1]/div[2]/li[2]/a[contains(.,'Fundos de Investimento')]"));
			}
		}

		public void menuSupCompare() {
			esperarElementoExistir(By.xpath("//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/ul[1]/li[2]/ul[1]"));
		}

		public void validaOpcaoEscolhidaCompare(String opcaoCompare) {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			if (existe(By.xpath("//img[contains(@class,'mb-14')]")) == true){
				realizaLoginCG();
			}else {
				esperarElementoExistir(By.xpath("//a[@class='h-full flex items-center text-step-description'][contains(.,'Compare')]"));
			}
		}

		public void validaOpcaoEscolhidaMatriz(String opcaoMatriz) {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			if (existe(By.xpath("//img[contains(@class,'mb-14')]")) == true){
				realizaLoginCG();
			}else {
				esperarElementoExistir(By.xpath("//span[@class='font-medium text-primary'][contains(.,'Matriz de Correlação')]"));
			}
		}

		public void menuSupControle() {
			esperarElementoExistir(By.xpath("//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/ul[1]/li[3]/ul[1]"));
		}

		public void menuSupConquiste() {
			esperarElementoExistir(By.xpath("//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/ul[1]/li[4]/ul[1]"));
		}

		public void validaConquisteEstudoInvest() {
			BaseSelenium.driver.close();
			esperarPadrao(5);
			trocarJanela(0);
			if (existe(By.xpath("//img[contains(@class,'mb-14')]")) == true){
				realizaLoginCG();
				esperarPadrao(3);
				esperarElementoExistir(By.xpath("//span[@class][contains(.,'Estudo de Investimento')]"));
			}else {
				esperarElementoExistir(By.xpath("//span[@class][contains(.,'Estudo de Investimento')]"));
			}
			
		}
		
		
			
}