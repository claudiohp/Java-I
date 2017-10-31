package QualquerClasse;

import java.util.ArrayList;
import java.util.List;

public abstract class Banco {
	
	private List listaagencia = new ArrayList<ContaCorrente>();
	
	public void cobrarConta (B1 staxa, B2 ctaxa){
		
			staxa.verficarTaxa();
			ctaxa.verficarTaxa();
		
	};
	
	public abstract void verficarTaxa();

}
