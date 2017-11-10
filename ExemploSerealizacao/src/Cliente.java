import java.io.Serializable;

public class Cliente implements Serializable {

	/**
	 * Deixar os ID'S iguais. Identificação para o tipo de objeto = SERIALUID.
	 * 
	 * @author senac.fatec
	 *
	 */
	private static final long serialVersionUID = 16353108060252570L;

	private int id;
	private String nome;
	private String cpf;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
