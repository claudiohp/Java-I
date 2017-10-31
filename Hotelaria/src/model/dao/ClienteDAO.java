package model.dao;

import model.Cliente;

public class ClienteDAO extends DAOGenerico<Cliente> {

	private static ClienteDAO instancia;

	private ClienteDAO() {

	}

	public static ClienteDAO getInstancia() {
		if (instancia == null) {
			instancia = new ClienteDAO();
			return instancia;

		} else {
			return instancia;

		}
	}

}
