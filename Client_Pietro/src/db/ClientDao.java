package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controller.ClientTableModel;
import model.Client;

public class ClientDao {

//	public static void insert(Client client) {
//
//		Connection con = ConnectionFactory.getConnection();
//
//		try {
//			PreparedStatement command = con.prepareStatement("INSERT INTO client VALUES (?, ? )");
//			command.setString(1, client.getCpf());
//			command.setString(2, client.getName());
//			command.executeUpdate();
//			command.close();
//			con.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

//	public static void update(Client client) {
//
//		Connection con = ConnectionFactory.getConnection();
//
//		try {
//			PreparedStatement command = con.prepareStatement("UPDATE client SET nome = ? WHERE cpf = ?");
//			command.setString(1, client.getName());
//			command.setString(2, client.getCpf());
//			command.executeUpdate();
//			command.close();
//			con.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

//	public static void delete(Client client) {
//
//		Connection con = ConnectionFactory.getConnection();
//
//		try {
//
//			PreparedStatement command = con.prepareStatement("DELETE FROM client WHERE cpf = ?");
//			command.setString(1, client.getCpf());
//			command.executeUpdate();
//			command.close();
//			con.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	public static ArrayList<Client> select(Client client) {

		ArrayList<Client> clientList = new ArrayList<Client>();
		Connection con = ConnectionFactory.getConnection();

		try {

			PreparedStatement command = con.prepareStatement("SELECT * FROM client");
			ResultSet rs = command.executeQuery();

			while (rs.next()) {
				clientList.add(new Client("Cpf: " + client.getCpf(), "Nome: " + client.getName(), null));
			}
			rs.close();
			command.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return clientList;

	}

	public static void main(String[] args) {

//		insert(new Client("Claudio", "1111222333", null));
//		insert(new Client("Joao", "2224444333", null));
//		update(new Client("Joao", "1111222333", null));
//		delete(new Client(null, "22233344", null));
		select(new Client("Claudio", "1111222333", null));
	}
}
