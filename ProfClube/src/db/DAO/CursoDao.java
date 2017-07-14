package db.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DAO.ConnectionFactory;
import model.Curso;
import model.Pessoa;

public class CursoDao {
	
	public static void insert(Curso curso) {

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement command = con.prepareStatement("INSERT INTO cursos VALUES (?, ?, ?, ?, ?, ?, ?, ? , ?)");
			command.setInt(1, curso.getCodigo());
			command.setString(2, curso.getNome());
			command.setString(3, curso.getCargaHoraria());
			command.setDouble(4, curso.getTaxaMatricula());
			command.setDouble(5, curso.getValorCurso());
			command.setDouble(6, curso.getParcelas());
			command.setDouble(7, curso.getValorTotal());
			command.setString(8, curso.getObservacoes());
			command.setString(9, curso.getTipo());
			
			command.executeUpdate();
			command.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(Curso curso) {

		Connection con = ConnectionFactory.getConnection();

		try {

			PreparedStatement command = con.prepareStatement("DELETE FROM cursos WHERE nome = ?");
			command.setString(1, curso.getNome());
			command.executeUpdate();
			command.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public static ArrayList<Curso> select(Curso curso) {
//
//		ArrayList<Curso> cursoList = new ArrayList<Curso>();
//		Connection con = ConnectionFactory.getConnection();
//
//		try {
//
//			PreparedStatement command = con.prepareStatement("SELECT * FROM cursos");
//			ResultSet rs = command.executeQuery();
//
//			while (rs.next()) {
//				cursoList.add(new Curso("Nome: " +curso.getNome()));
//			}
//			rs.close();
//			command.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		return cursoList;
//
//	}

	
}
