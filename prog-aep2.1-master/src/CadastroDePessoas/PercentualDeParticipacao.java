package CadastroDePessoas;

public class PercentualDeParticipacao {
	
	private double percentualDeParticipacao;
	
	public double imprimePercentualDeParticipacao() {
		return percentualDeParticipacao;
	}
	
	public PercentualDeParticipacao(double percentualDeParticipacao) {
		
		if(percentualDeParticipacao > 0) {
			this.percentualDeParticipacao = percentualDeParticipacao;
		}else {
			throw new RuntimeException("participação deve ser maior que 0");
		}
	}

}