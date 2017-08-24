package view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import controller.ControllerCurso;
import db.DAO.CursoDao;
import model.Curso;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {

		cadastroCurso();
	}

	private static int PainelCadastroCurso() {

		System.out.println("****MENU CADASTRO DE CURSO.****");
		System.out.println("");
		System.out.println("1 - CADASTRAR CURSO.");
		System.out.println("2 - DELETAR CURSO.");
		System.out.println("3 - SAIR.");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		return opcao;
	}

	public static void cadastroCurso() {

		ControllerCurso curso = new ControllerCurso();

		int opcao;

		do {
			opcao = PainelCadastroCurso();

			switch (opcao) {

			case 1:
				curso.adicionaCurso();
				System.out.println("Curso adicionado com sucesso.");
				break;

			case 2:
				curso.deletaCurso();
				System.out.println("Curso deletado com sucesso.");

			case 3:
				System.exit(0);
			}
		} while (opcao < 4);

	}
}
