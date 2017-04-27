package heranca;

public class Vendedor extends Funcionario {

	private float comissao;

	public Vendedor(String nome, float salario, float comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}

	public float getSalarioComissionado() {

		return super.getSalario() + comissao;
	}

	public static void main(String[] args) {

		Vendedor v1 = new Vendedor("Joao", 5000f, 500f);
		System.out.println(v1.getSalarioComissionado());
	
	}
}
