package CadastroDePessoas;

import java.util.HashSet;
import java.util.Set;

public class Juridica extends Pessoa {
	private Cnpj cnpj;
	private CapitalSocial capitalSocial;
	private Set<CotaSociedade> cotasSociedade = new HashSet<>();
	
	public Juridica(Nome nome, Cnpj cnpj, capitalSocial capitalSocial) {
		super(nome);
		this.capitalSocial = capitalSocial;
		this.cnpj = cnpj;
	}
	
	public Juridica(Id id, NOme nome, Cnpj cnpj, capitalSocial capitalSocial) {
		super(id, nome);
		this.capitalSocial = capitalSocial;
		this.cnpj = cnpj;
	}
	
	public void adicionarSocio(Pessoa socio, percentualDeParticipacao percentualDeParticipacao) {
		CotaSociedade novaCota = new CotaSociedade();
		novaCota.socio = socio;
		novaCota.percentualDeParticipacao = percentualDeParticipacao;
		
		double percentualAtual = somarPercentualAtual();
		if (percentualAtual + percentualDeParticipacao.imprimePercentualDeParticipacao()> 100.00) {
			throw new RuntimeException("A participação total não pode exceder 100%! Percentual atual: " + percentualAtual + ". Você tentou adicionar mais " + percentualDeParticipacao.imprimePercentualDeParticipacao());
		}
		
		this.cotasSociedade.add(novaCota);
	}
	private double somarPercentualAtual() {
		double percentualAtual = 0.00d;
		for (CotaSociedade cotaSociedade : cotasSociedade) {
			percentualAtual += cotaSociedade.percentualDeParticipacao.imprimePercentualDeParticipacao();
		}
		return percentualAtual;
	}
	
	public void removerSocio(Pessoa socioParaRemover) {
		Set<CotaSociedade> aux = new HashSet<>();
		for (CotaSociedade cota : cotasSociedade) {
			if (!cota.socio.equals(socioParaRemover)) {
				aux.add(cota);
			}
		}
		this.cotasSociedade = aux;
		
	}
	
	public double getCapitalSocial() {
		return capitalSocial.imprimeCapitalSocial();;
	}
	public String getCnpj() {
		return cnpj.imprimeCapitalSocial();
	}
	
	private class CotaSociedade{
		private PercentualDeParticipacao percentualDeParticipacao;
		private Pessoa socio;
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((socio == null) ? 0 : socio.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CotaSociedade other = (CotaSociedade) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (socio == null) {
				if (other.socio != null)
					return false;
			} else if (!socio.equals(other.socio))
				return false;
			return true;
		}
		private Juridica getOuterType() {
			return Juridica.this;
		}
		
	}
}
