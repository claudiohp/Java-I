package Threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ManipulaArquivo {

	public static String lerArquivo(File arq) {

		String conteudo = "";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(arq));

			String linha = "";
			
			while (true) {
				if (linha != null) {
					conteudo += linha;
				} else {
					break;
				}

				linha = reader.readLine();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo ou diretório não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conteudo;
	}
}