package br.com.curso.cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {

		String filtro = request.getParameter("filtro");
		String nome2 = request.getParameter("sobrenome");
		List<String> resultado = filtrarClientes(filtro);

		PrintWriter writer = reponse.getWriter();

		writer.write("<html><body>");
		writer.write("<ul>");

		for (String item : resultado) {
			writer.write("<li>" + item + "</li>");
		}

		writer.write("</ul>");
		writer.write("</body></html>");

	}

	private List<String> filtrarClientes(String filtro) {

		List<String> clientes = new ArrayList<String>();
		List<String> listaFiltrada = new ArrayList<String>();

		clientes.add("Allan");
		clientes.add("Daniel");
		clientes.add("Catia");
		clientes.add("Marcos");
		clientes.add("Ismael");

		if (filtro != null && !filtro.equals("")) {
			for (String cliente : clientes) {
				if (cliente.toUpperCase().contains(filtro.toUpperCase()))
					listaFiltrada.add(cliente);
			}
		}

		else {
			listaFiltrada = clientes;
		}

		return listaFiltrada;
	}

}
