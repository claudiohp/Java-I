import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApp {
	
	static final Logger logger = LogManager.getLogger(MainApp.class.getName());
	
	public static void main(String[] args) {
		
		logger.info("Iniciando a aplicação.");
		
		String caminho = "c:/serializacao/teste.myobj";
		// Cliente c1 = new Cliente();
		// c1.setNome("Claudio");
		// c1.setCpf("12056292700");
		// c1.setEmail("claudio@hotmail.com");
		// c1.setId(20);

		// ManipulaArquivo.serealizarObjeto(c1, caminho);
		
		logger.trace("chamando o método deserializa.");
		Cliente recuperacliente = (Cliente) ManipulaArquivo.deserializarObjeto(caminho);
		System.out.println("Nome: " + recuperacliente.getNome() + " | " + " Email: " + recuperacliente.getEmail());
	
		
	}

}
