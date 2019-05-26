package CadastroDePessoas;

import java.util.UUID;

public class Fisica extends Pessoa {
	
	private String cpf;
	private String rg;
	
	
	public Fisica(Nome nome, Cpf cpf, Rg rg) {
		super(nome);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public Fisica(Id id, Nome nome, Cpf cpf, Rg rg) {
		super(id, nome);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	public String getCpf() {
		return cpf.imprimeCpf();
	}
	public String getRg() {
		return rg.imprimeRg();
	}
}
