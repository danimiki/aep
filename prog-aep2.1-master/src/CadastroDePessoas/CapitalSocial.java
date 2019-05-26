package CadastroDePessoas;

public class CapitalSocial {
	
	private double capitalSocial;
	
	public double imprimeCapitalSocial() {
		return capitalSocial;
	}
	
	public CapitalSocial(double capitalSocial) {
		if (capitalSocial > 0) {
			this.capitalSocial = capitalSocial;
		}else {
			throw new RuntimeException("capital social deve ser maior que 0!");
		}
	}

}