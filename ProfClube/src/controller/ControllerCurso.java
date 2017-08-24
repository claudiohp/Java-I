package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.Object;

import db.DAO.CursoDao;
import model.Curso;
import model.Pessoa;

public class ControllerCurso {

	public double valortotalCurso(Curso curso) {
		return curso.getTaxaMatricula() + (curso.getValorCurso() * curso.getParcelas());
	}

	public void adicionaCurso() {

		Scanner scanner = new Scanner(System.in);
		CursoDao cursoDao = new CursoDao();
		Curso curso = new Curso();

		System.out.print("DIGITE O CÓDIGO DO CURSO: ");
		curso.setCodigo(Integer.parseInt(scanner.nextLine()));
		System.out.print("DIGITE O NOME DO CURSO: ");
		curso.setNome(scanner.nextLine());
		System.out.print("DIGITE A CARGA HORÁRIA DO CURSO: ");
		curso.setCargaHoraria(scanner.nextLine());
		System.out.print("DIGITE O VALOR DA TAXA DE MATRÍCULA: ");
		curso.setTaxaMatricula(Double.parseDouble(scanner.nextLine()));
		System.out.print("DIGITE O VALOR DO CURSO: ");
		curso.setValorCurso(Double.parseDouble(scanner.nextLine()));
		System.out.print("DIGITE AS PARCELAS DO CURSO: ");
		curso.setParcelas(Integer.parseInt(scanner.nextLine()));
		curso.setValorTotal(valortotalCurso(curso));
		System.out.print("DESEJA ANOTAR ALGUMA OBSERVAÇÃO: ");
		curso.setObservacoes(scanner.nextLine());
		System.out.print("QUAL O TIPO DE CURSO EAD OU PRESENCIAL: ");
		curso.setTipo(scanner.nextLine());
		cursoDao.insert(curso);

	}

	public void deletaCurso() {

		Scanner scanner = new Scanner(System.in);
		CursoDao cursoDao = new CursoDao();
		Curso curso = new Curso();

		System.out.println("DIGITE O CÓDIGO DO CURSO PARA DELETAR: ");
		curso.setCodigo(scanner.nextInt());
		cursoDao.delete(curso);

	}
	
}
	

