package br.com.hotelaria.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.hotelaria.dao.Conexao;
import br.com.hotelaria.dao.HotelariaDao;
import br.com.hotelaria.model.Hospede;
import br.com.hotelaria.model.Quarto;
import br.com.hotelaria.model.Reserva;


/**
 * Servlet implementation class HotelariaServlet
 */
@WebServlet("/HotelariaServlet")
public class HotelariaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String nome = req.getParameter("txtnome");
		int nquarto = (Integer.parseInt(req.getParameter("txtquarto")));
		String dtentrada = req.getParameter("txtdtentrada");
		String dtsaida = req.getParameter("txtdtsaida");
		
			try {
				Hospede hospedes = new Hospede(nome);
				Quarto quartos = new Quarto(nquarto);
				Reserva reservas = new Reserva(dtentrada, dtsaida);
				HotelariaDao hdao = new HotelariaDao();
				hdao.insert(hospedes, quartos, reservas);
				String url = "/cadastro.jsp";
				ServletContext sc = getServletContext();
				RequestDispatcher rd = sc.getRequestDispatcher(url);
				rd.forward(req, res);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}



