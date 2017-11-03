package view;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import controller.TelaPrincipal;
import model.Hospedagem;

public class MainApp {

	public static void main(String[] args) {

		/**
		 * Conexão com tela
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new TelaPrincipal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		/**
		 * Testar Hibernate
		 */
		
	}
}
