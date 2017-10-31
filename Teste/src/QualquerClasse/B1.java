package QualquerClasse;

public class B1 extends Banco{
	
	private ContaCorrente saldoAtual;
	
	@Override
	public void verficarTaxa() {
		if(saldoAtual.getSaldoAtual() > 50.000){
			System.out.println("Não existe taxa para esse saldo.");
		}
	}

}
