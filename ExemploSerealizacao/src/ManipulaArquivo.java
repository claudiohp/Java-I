import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManipulaArquivo {

	public static void serealizarObjeto(Object obj, String caminho) {

		ObjectOutputStream saida;

		try {
			saida = new ObjectOutputStream(new FileOutputStream(caminho));

			saida.writeObject(obj);
			saida.flush();
			saida.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo ou diretório não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problemas ao manipular o arquivo.");
			e.printStackTrace();
		}
	}

	public static Object deserializarObjeto(String caminho) {

		Object obj = null;
		ObjectInputStream entrada;

		try {
			entrada = new ObjectInputStream(new FileInputStream(caminho));

			obj = entrada.readObject();
			entrada.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo ou diretório não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problemas ao manipular o arquivo.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossivel deserializar objeto.");
			e.printStackTrace();
		}

		return obj;

	}

}
