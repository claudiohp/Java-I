package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Curso;
import model.Pessoa;

public class ControllerCurso {
	
	public double valortotalCurso(Curso curso){
		return curso.getTaxaMatricula() + (curso.getValorCurso() * curso.getParcelas());
	}
	
	public void adicionaCurso(Curso[] cursos){
		
		ArrayList<Curso> curso = new ArrayList<Curso>();
		
		int opcao = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - DIGITE PARA CADASTRO DO CURSO: ");
		System.out.println("2 - DIGITE : ");
		
		switch (opcao) {
		case 1:
			
			break;
		
		case 2:	
			
			break;
		default:
			break;
		}
		
	}
}
