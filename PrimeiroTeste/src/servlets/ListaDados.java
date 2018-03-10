package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cliente;

@WebServlet("/clientes")
public class ListaDados extends HttpServlet {

	ArrayList<Cliente> listcliente = new ArrayList<Cliente>();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.service(arg0, arg1);

		String menuopcao = req.getParameter("opcao");
		HttpSession secao = req.getSession();

		if (menuopcao.equals("cadastrar")) {
			String nameUser = req.getParameter("nome");
			String cpfUser = req.getParameter("cpf");
			Cliente cliente = new Cliente();
			cliente.setNome(nameUser);
			cliente.setCpf(cpfUser);
			listcliente.add(cliente);
			resp.sendRedirect("confirmacao.html");
			System.out.println(nameUser);

		} else if (menuopcao.equals("listar")) {
			
			secao.setAttribute("listaCli", listcliente);
			resp.sendRedirect("listacontatos.jsp");
			
			/*
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>");
			out.println("Lista Clientes");
			out.println("</title>");
			out.println("</head>");
			out.println("<body>");
			
			for (Cliente cliente : listcliente) {
				out.println(cliente.getNome() + "<br />");
			}
			out.println("</body>");
			out.println("</html>");	
			*/
		}
	}
}
