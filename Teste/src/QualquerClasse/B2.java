package QualquerClasse;

public class B2 extends Banco{
	
	private ContaCorrente saldoAtual;
	private double taxa;
	
	@Override
	public void verficarTaxa() {
		if(saldoAtual.getSaldoAtual() <= 50.000){
			taxa = 5.50;
		}
	}

}
