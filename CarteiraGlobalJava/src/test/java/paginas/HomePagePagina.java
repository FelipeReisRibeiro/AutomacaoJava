package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;

import core.BaseSelenium;
import elementos.HomePageElements;

public class HomePagePagina extends BaseSelenium {
	
		private HomePageElements home = new HomePageElements();
		
		
		public void validaHomePage() {
			esperarPadrao(10);
			esperarElementoExistir(home.getLogo_CarteiraGlobal());
			
			
			
			
		}
		
		public void aceitarCookies() {
			esperarElementoExistir(home.getBtn_AceitarCookies());
			clicar(home.getBtn_AceitarCookies());
			esperarPadrao(10);
			
		}


		public void selecionaFundoRanking(String fundo) {
			esperarElementoExistir(home.getTab_RankFundos());
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
			escreveNoCampo(home.getCmp_user(), "userautomacaogit@gmail.com");
			escreveNoCampo(home.getCmp_password(), "User@123");
			esperarSerClicavel(home.getBtn_Submit());
			clicar(home.getBtn_Submit());
			
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


		
		
		

		
}
