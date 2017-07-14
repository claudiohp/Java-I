package view;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import controller.ControllerPessoa;
import db.DAO.CursoDao;
import model.Curso;
import model.Pessoa;

public class Main {
	
	public static void main(String[] args) {
		
		CursoDao curso = new CursoDao();
		curso.insert(new Curso(1,"Desenvolvimento de Sistemas","320 Horas",150.00,350.00,12,12750.00,"Curso para desenvolvimento de software","PRESENCIAL"));
	}
}
