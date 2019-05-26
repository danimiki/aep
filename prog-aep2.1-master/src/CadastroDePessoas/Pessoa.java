package CadastroDePessoas;

import java.util.UUID;

public abstract class Pessoa {
	
	protected Nome nome;
	protected Id id;
	
	
	public Pessoa(Nome nome) {
		this.nome = nome;
		this.id = new Id(UUID.randomUUID());
	}
	
	public Pessoa(Id id, Nome nome) {
		this.nome = nome;
		this.id = id;
	}
	
	
	public String getNome() {
		return nome.ImprimeNome();
	}
	
	public UUID getId() {
		return id.ImprimeId();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
