package model.dao;

import model.Hospedagem;

public class HospedagemDAO extends DAOGenerico<Hospedagem> {

	private static HospedagemDAO instancia;

	private HospedagemDAO() {

	}

	public static HospedagemDAO getInstancia() {

		if (instancia == null) {
			instancia = new HospedagemDAO();
			return instancia;
		} else {
			return instancia;
		}

	}

}
