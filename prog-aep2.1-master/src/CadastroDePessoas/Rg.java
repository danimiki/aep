package CadastroDePessoas;

public class Rg {
	
	private String rg;
	
	public Rg (String rg) {
		rg = rg.replace('.',' ');
	    rg = rg.replace('-',' ');
	    rg = rg.replaceAll(" ","");
	    this.rg = rg;
	}
	
	public String imprimeRg() {
		return rg;
	}

}