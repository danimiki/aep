package CadastroDePessoas;

public class App {
	
	public static void main(String[] args) {
		
		Juridica Unicesumar = new Juridica(new Nome("Unicesumar Centro Univercitário Cesumar Ltda."), new Cnpj("02.004.713/0001-55"), 
									   new CapitalSocial(500_000d));
		
		Fisica Daniela = new Fisica(new Nome("Daniela Miki"),new Cpf("12345678909"), new Rg("987678905"));
		
		Fisica Lucas = new Fisica(new Nome("Lucas Hiroshi"), new Cpf("2255346789"), new Rg("1133446628"));
	
		Unicesumar.adicionarSocio(Lucas, new PercentualDeParticipacao(25));
		
		Unicesumar.removerSocio(Lucas);
		
		Unicesumar.adicionarSocio(Daniela, new PercentualDeParticipacao(80));
		
		
	}

}
