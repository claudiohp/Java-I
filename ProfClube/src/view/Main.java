package view;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DAO.CursoDao;
import model.Curso;
import model.Pessoa;

public class Main {
	
	public static void main(String[] args) {
		
		CursoDao curso = new CursoDao();
//		curso.insert(new Curso(1,"Desenvolvimento de Sistemas","320 Horas",150.00,350.00,12,12750.00,"Curso para desenvolvimento de software","PRESENCIAL"));
//		curso.insert(new Curso(2,"Administração","240 Horas",150.00,420.00,26,15750.00,"Curso para administração","PRESENCIAL"));
		curso.insert(new Curso(3,"Web Design","350 Horas",180.00,250.00,15,10750.00,"Curso para Design","PRESENCIAL"));
//		curso.delete(new Curso("Desenvolvimento de Sistemas"));
//		curso.select(new Curso("Desenvolvimento de Sistemas"));
	}
}
