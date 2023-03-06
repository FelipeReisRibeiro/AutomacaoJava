package elementos;

import org.openqa.selenium.By;

public class HomePageElements {

	private By	Logo_CarteiraGlobal =   		By.xpath("//div//main[@class='l-app ']//div[@class='c-header']//img[contains(@alt,'Logo do Carteira Global')]");
	private By  pgCarteiraGlobal =				By.xpath("//form[@class='conheca-auto-complete']//img");
	private By	menu;
	private By  Info_Conheca =          		By.xpath("//div//div[@class='wrapper-autocomplete'][contains(.,'Conheça')][1]");
	private By	Info_Compare =          		By.xpath("//div//div[@class='wrapper-autocomplete'][contains(.,'Compare')][1]");
	private By	Info_Controle =         		By.xpath("//div//div[@class='wrapper-autocomplete'][contains(.,'Controle')][1]");
	private By	Info_Conquiste =        		By.xpath("//div//div[@class='wrapper-autocomplete'][contains(.,'Conquiste')][1]");
	private By	Tab_RankFundos =        		By.xpath("//div[@class='c-ranking-bg']");
	private By	pagComparador =					By.xpath("//section[@class='page-content']");
	private By  pagLogin =						By.xpath("//div//img[@class='mb-14']");
	private By	NomeFundo;
	private By	Select_Fundo =            		By.xpath("//div[@class='w-full'][contains(.,'BB AÇÕES BB SEGURIDADE')]|//*//input[contains(@type,'checkbox')][1]");
	private By  Btn_AceitarCookies = 			By.xpath("//button[@id='onetrust-accept-btn-handler']");
	private By	Btn_Proxima =                   By.xpath("//div[1]/div[1]/div[4]/div[1]/img[contains(@alt,'icone de navegação')]");
	private By	Btn_MenuHeader =                By.xpath("//button[@class='c-button c-button-link'][contains(.,'${menu}')]");
	private By	Btn_Entrar =                    By.xpath("//main[1]/div[1]/div[3]/div[1]/button[@class='c-button c-button-outline'][contains(.,'Entrar')]");
	private By	Btn_CriarConta =                By.xpath("//div//main[@class='l-app ']//div[@class='c-header']//button[contains(.,'Criar conta')][1]");
	private By	Btn_Comparar =                  By.xpath("//button[@class='c-button c-button-primary'][contains(.,'Comparar')]");
	private By	Btn_RankComp =                  By.xpath("//button[@class='c-button c-button-primary'][contains(.,'Ranking completo')]");
	private By	Experimente;
	private By	Btn_Experimente =               By.xpath("//span[contains(.,'${Experimente}')]");
	private By	Btn_ExperimenteConheca =        By.xpath("//span[contains(.,'Conheça')]");
	private By	Btn_ExperimenteCompare =        By.xpath("//span[contains(.,'compare')]");
	private By	Btn_ExperimenteControle =       By.xpath("//span[contains(.,'Controle')]");
	private By	Btn_ExperimenteConquiste =      By.xpath("//span[contains(.,'Conquiste')]");
	private By	Btn_AcessarConheca =            By.xpath("//button[contains(.,'Acessar Conheça')]");
	private By	Btn_AcessarControle =           By.xpath("//button[contains(.,'Acessar Controle')]");
	private By	Btn_AcessarCompare =            By.xpath("//button[contains(.,'Acessar Compare')]");
	private By	Btn_AcessarConquiste =          By.xpath("//button[contains(.,'Acessar Conquiste')]");
	private By  Btn_Submit =					By.xpath("//div//button[@type='submit']");
	private By  Cmp_BuscaAtivo =				By.xpath("//div[2]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/input[contains(@placeholder,'Qual ativo você deseja conhecer?')]");
	private By  Cmp_user =						By.id("user");
	private By  Cmp_password =					By.id("password");
	private By	Img_PerfilAtivos =              By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconheca%2F1.0a49ecf2ed444e966804409272caa39c.png&w=3840&q=75'])[2]");
	private By	Img_Trading =                   By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconheca%2F2.031f9a4aa71bc6df2a7905ec84fd02f7.png&w=3840&q=75'])[2]");
	private By	Img_EventosCorp =               By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconheca%2F3.91e3d6b319a6adfc10c167d78259937f.png&w=3840&q=75'])[2]");
	private By	Img_Contabilidade =             By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconheca%2F4.4a9b4b2e2acbafe3f866ebed8d48588f.png&w=3840&q=75'])[2]");
	private By	Img_ProtFundFII =               By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconheca%2F5.36a0f33d76e584f294979fc821b0374c.png&w=3840&q=75'])[2]");
	private By	Img_LaminaFundos =              By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconheca%2F6.5b6ab4ec86ccd0d435bfacffb813bb74.png&w=3840&q=75'])[2]");
	private By	Img_ComparaInvestimentos =      By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcompare%2F1.10c9ea6b9e9fa357ba32841086929d56.png&w=3840&q=75'])[2]");
	private By	Img_MatrizCorrelacao =          By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcompare%2F2.827e02d4ce40013cc933c6d36a1e3e52.png&w=3840&q=75'])[2]");
	private By	Img_ComparaRendaFixa =          By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcompare%2F3.f41e72ee1952c661fccf5e0a9f6ae8d3.png&w=3840&q=75'])[2]");
	private By	Img_Resumo =                    By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcontrole%2F1.b7d1056c7e35e3e043466a34b3298da8.png&w=3840&q=75'])[2]");
	private By	Img_Posição =                   By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcontrole%2F2.6c3862fb559aaa7f459a4f93c3492d13.png&w=3840&q=75'])[2]");
	private By	Img_Evolução =                  By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcontrole%2F3.dacf856b798ca2958418a59f4996eec5.png&w=3840&q=75'])[2]");
	private By	Img_Performance =               By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcontrole%2F4.d2acef71e9f4585c851f2fbb0107ceb3.png&w=3840&q=75'])[2]");
	private By	Img_Financeiro =                By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcontrole%2F5.4cca3e365fc841f49e3891dd9e40c181.png&w=3840&q=75'])[2]");
	private By	Img_Rico =                      By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fcontrole%2F6.f6e8af401b4b710b97af2c2b667697bb.png&w=3840&q=75'])[2]");
	private By	Img_SimuladorCarteiras =        By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconquiste%2F1.5dc0c39ee89d42135c9b5ba7a7a2a80a.png&w=3840&q=75'])[2]");
	private By	Img_EstudoInvestimento =        By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconquiste%2F2.460612d5fbf76eebf88561a408477ad2.png&w=3840&q=75'])[2]");
	private By	Img_ComparadorCarteiras =       By.xpath("(//img[@src='/_next/image?url=%2F_next%2Fstatic%2Fimage%2Fassets%2Fimages%2Fmodulos%2Fconquiste%2F3.3812d54503e9ebb78f7e87c40efe7c57.png&w=3840&q=75'])[2]");
	
		
	
	public By getLogo_CarteiraGlobal() {
		return Logo_CarteiraGlobal;
	}
	public void setLogo_CarteiraGlobal(By logo_CarteiraGlobal) {
		Logo_CarteiraGlobal = logo_CarteiraGlobal;
	}
	public By getMenu() {
		return menu;
	}
	public void setMenu(By menu) {
		this.menu = menu;
	}
	public By getInfo_Conheca() {
		return Info_Conheca;
	}
	public void setInfo_Conheca(By info_Conheca) {
		Info_Conheca = info_Conheca;
	}
	public By getInfo_Compare() {
		return Info_Compare;
	}
	public void setInfo_Compare(By info_Compare) {
		Info_Compare = info_Compare;
	}
	public By getInfo_Controle() {
		return Info_Controle;
	}
	public void setInfo_Controle(By info_Controle) {
		Info_Controle = info_Controle;
	}
	public By getInfo_Conquiste() {
		return Info_Conquiste;
	}
	public void setInfo_Conquiste(By info_Conquiste) {
		Info_Conquiste = info_Conquiste;
	}
	public By getTab_RankFundos() {
		return Tab_RankFundos;
	}
	public void setTab_RankFundos(By tab_RankFundos) {
		Tab_RankFundos = tab_RankFundos;
	}
	public By getNomeFundo() {
		return NomeFundo;
	}
	public void setNomeFundo(By nomeFundo) {
		NomeFundo = nomeFundo;
	}
	public By getSelect_Fundo() {
		return Select_Fundo;
	}
	public void setSelect_Fundo(By select_Fundo) {
		Select_Fundo = select_Fundo;
	}
	public By getBtn_Proxima() {
		return Btn_Proxima;
	}
	public void setBtn_Proxima(By btn_Proxima) {
		Btn_Proxima = btn_Proxima;
	}
	public By getBtn_MenuHeader() {
		return Btn_MenuHeader;
	}
	public void setBtn_MenuHeader(By btn_MenuHeader) {
		Btn_MenuHeader = btn_MenuHeader;
	}
	public By getBtn_Entrar() {
		return Btn_Entrar;
	}
	public void setBtn_Entrar(By btn_Entrar) {
		Btn_Entrar = btn_Entrar;
	}
	public By getBtn_CriarConta() {
		return Btn_CriarConta;
	}
	public void setBtn_CriarConta(By btn_CriarConta) {
		Btn_CriarConta = btn_CriarConta;
	}
	public By getBtn_Comparar() {
		return Btn_Comparar;
	}
	public void setBtn_Comparar(By btn_Comparar) {
		Btn_Comparar = btn_Comparar;
	}
	public By getBtn_RankComp() {
		return Btn_RankComp;
	}
	public void setBtn_RankComp(By btn_RankComp) {
		Btn_RankComp = btn_RankComp;
	}
	public By getExperimente() {
		return Experimente;
	}
	public void setExperimente(By experimente) {
		Experimente = experimente;
	}
	public By getBtn_Experimente() {
		return Btn_Experimente;
	}
	public void setBtn_Experimente(By btn_Experimente) {
		Btn_Experimente = btn_Experimente;
	}
	public By getBtn_ExperimenteConheca() {
		return Btn_ExperimenteConheca;
	}
	public void setBtn_ExperimenteConheca(By btn_ExperimenteConheca) {
		Btn_ExperimenteConheca = btn_ExperimenteConheca;
	}
	public By getBtn_ExperimenteCompare() {
		return Btn_ExperimenteCompare;
	}
	public void setBtn_ExperimenteCompare(By btn_ExperimenteCompare) {
		Btn_ExperimenteCompare = btn_ExperimenteCompare;
	}
	public By getBtn_ExperimenteControle() {
		return Btn_ExperimenteControle;
	}
	public void setBtn_ExperimenteControle(By btn_ExperimenteControle) {
		Btn_ExperimenteControle = btn_ExperimenteControle;
	}
	public By getBtn_ExperimenteConquiste() {
		return Btn_ExperimenteConquiste;
	}
	public void setBtn_ExperimenteConquiste(By btn_ExperimenteConquiste) {
		Btn_ExperimenteConquiste = btn_ExperimenteConquiste;
	}
	public By getBtn_AcessarConheca() {
		return Btn_AcessarConheca;
	}
	public void setBtn_AcessarConheca(By btn_AcessarConheca) {
		Btn_AcessarConheca = btn_AcessarConheca;
	}
	public By getBtn_AcessarControle() {
		return Btn_AcessarControle;
	}
	public void setBtn_AcessarControle(By btn_AcessarControle) {
		Btn_AcessarControle = btn_AcessarControle;
	}
	public By getBtn_AcessarCompare() {
		return Btn_AcessarCompare;
	}
	public void setBtn_AcessarCompare(By btn_AcessarCompare) {
		Btn_AcessarCompare = btn_AcessarCompare;
	}
	public By getBtn_AcessarConquiste() {
		return Btn_AcessarConquiste;
	}
	public void setBtn_AcessarConquiste(By btn_AcessarConquiste) {
		Btn_AcessarConquiste = btn_AcessarConquiste;
	}
	public By getImg_PerfilAtivos() {
		return Img_PerfilAtivos;
	}
	public void setImg_PerfilAtivos(By img_PerfilAtivos) {
		Img_PerfilAtivos = img_PerfilAtivos;
	}
	public By getImg_Trading() {
		return Img_Trading;
	}
	public void setImg_Trading(By img_Trading) {
		Img_Trading = img_Trading;
	}
	public By getImg_EventosCorp() {
		return Img_EventosCorp;
	}
	public void setImg_EventosCorp(By img_EventosCorp) {
		Img_EventosCorp = img_EventosCorp;
	}
	public By getImg_Contabilidade() {
		return Img_Contabilidade;
	}
	public void setImg_Contabilidade(By img_Contabilidade) {
		Img_Contabilidade = img_Contabilidade;
	}
	public By getImg_ProtFundFII() {
		return Img_ProtFundFII;
	}
	public void setImg_ProtFundFII(By img_ProtFundFII) {
		Img_ProtFundFII = img_ProtFundFII;
	}
	public By getImg_LaminaFundos() {
		return Img_LaminaFundos;
	}
	public void setImg_LaminaFundos(By img_LaminaFundos) {
		Img_LaminaFundos = img_LaminaFundos;
	}
	public By getImg_ComparaInvestimentos() {
		return Img_ComparaInvestimentos;
	}
	public void setImg_ComparaInvestimentos(By img_ComparaInvestimentos) {
		Img_ComparaInvestimentos = img_ComparaInvestimentos;
	}
	public By getImg_MatrizCorrelacao() {
		return Img_MatrizCorrelacao;
	}
	public void setImg_MatrizCorrelacao(By img_MatrizCorrelacao) {
		Img_MatrizCorrelacao = img_MatrizCorrelacao;
	}
	public By getImg_ComparaRendaFixa() {
		return Img_ComparaRendaFixa;
	}
	public void setImg_ComparaRendaFixa(By img_ComparaRendaFixa) {
		Img_ComparaRendaFixa = img_ComparaRendaFixa;
	}
	public By getImg_Resumo() {
		return Img_Resumo;
	}
	public void setImg_Resumo(By img_Resumo) {
		Img_Resumo = img_Resumo;
	}
	public By getImg_Posição() {
		return Img_Posição;
	}
	public void setImg_Posição(By img_Posição) {
		Img_Posição = img_Posição;
	}
	public By getImg_Evolução() {
		return Img_Evolução;
	}
	public void setImg_Evolução(By img_Evolução) {
		Img_Evolução = img_Evolução;
	}
	public By getImg_Performance() {
		return Img_Performance;
	}
	public void setImg_Performance(By img_Performance) {
		Img_Performance = img_Performance;
	}
	public By getImg_Financeiro() {
		return Img_Financeiro;
	}
	public void setImg_Financeiro(By img_Financeiro) {
		Img_Financeiro = img_Financeiro;
	}
	public By getImg_Rico() {
		return Img_Rico;
	}
	public void setImg_Rico(By img_Rico) {
		Img_Rico = img_Rico;
	}
	public By getImg_SimuladorCarteiras() {
		return Img_SimuladorCarteiras;
	}
	public void setImg_SimuladorCarteiras(By img_SimuladorCarteiras) {
		Img_SimuladorCarteiras = img_SimuladorCarteiras;
	}
	public By getImg_EstudoInvestimento() {
		return Img_EstudoInvestimento;
	}
	public void setImg_EstudoInvestimento(By img_EstudoInvestimento) {
		Img_EstudoInvestimento = img_EstudoInvestimento;
	}
	public By getImg_ComparadorCarteiras() {
		return Img_ComparadorCarteiras;
	}
	public void setImg_ComparadorCarteiras(By img_ComparadorCarteiras) {
		Img_ComparadorCarteiras = img_ComparadorCarteiras;
	}
	public By getPagComparador() {
		return pagComparador;
	}
	public void setPagComparador(By pagComparador) {
		this.pagComparador = pagComparador;
	}
	public By getBtn_AceitarCookies() {
		return Btn_AceitarCookies;
	}
	public void setBtn_AceitarCookies(By btn_AceitarCookies) {
		Btn_AceitarCookies = btn_AceitarCookies;
	}
	public By getPagLogin() {
		return pagLogin;
	}
	public void setPagLogin(By pagLogin) {
		this.pagLogin = pagLogin;
	}
	public By getCmp_user() {
		return Cmp_user;
	}
	public void setCmp_user(By cmp_user) {
		Cmp_user = cmp_user;
	}
	public By getCmp_password() {
		return Cmp_password;
	}
	public void setCmp_password(By cmp_password) {
		Cmp_password = cmp_password;
	}
	public By getBtn_Submit() {
		return Btn_Submit;
	}
	public void setBtn_Submit(By btn_Submit) {
		Btn_Submit = btn_Submit;
	}
	public By getPgCarteiraGlobal() {
		return pgCarteiraGlobal;
	}
	public void setPgCarteiraGlobal(By pgCarteiraGlobal) {
		this.pgCarteiraGlobal = pgCarteiraGlobal;
	}
	public By getCmp_BuscaAtivo() {
		return Cmp_BuscaAtivo;
	}
	public void setCmp_BuscaAtivo(By cmp_BuscaAtivo) {
		Cmp_BuscaAtivo = cmp_BuscaAtivo;
	}
	
	
}
