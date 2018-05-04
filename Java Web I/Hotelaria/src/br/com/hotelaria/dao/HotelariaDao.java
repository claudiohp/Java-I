package br.com.hotelaria.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.hotelaria.dao.Conexao;
import br.com.hotelaria.model.Hospede;
import br.com.hotelaria.model.Quarto;
import br.com.hotelaria.model.Reserva;

public class HotelariaDao{
	
	private Connection connection;
	private PreparedStatement ps;
	
	public HotelariaDao() throws SQLException{
		this.connection = Conexao.getConnection();
	}
	
	public void insert (Hospede hospede, Quarto quarto, Reserva reserva){
			
			try {
			
			String sql = "INSERT INTO Hospede(nome) VALUES (?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, hospede.getNome());
			
			ps.executeUpdate();
			ps.close();

			String sql2 = "INSERT INTO Quarto(numeroquarto) VALUES (?)";
			PreparedStatement ps2 = connection.prepareStatement(sql2);
			ps2.setInt(1, quarto.getNumeroQuarto());
			
			ps2.executeUpdate();
			ps2.close();
			
			String sql3 = "INSERT INTO Reserva(Hospede_idHospede, Quarto_idQuarto, dataentrada, datasaida) VALUES (?,?,?,?)";
			PreparedStatement ps3 = connection.prepareStatement(sql3);
			ps3.setInt(1, hospede.getIdhospede());
			ps3.setInt(2, quarto.getIdquarto());
			ps3.setString(3, reserva.getDataEntrada());
			ps3.setString(4, reserva.getDataSaida());
			
			ps3.executeUpdate();
			ps3.close();
			
			System.out.println("Cadastro realizado com sucesso.");		
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
