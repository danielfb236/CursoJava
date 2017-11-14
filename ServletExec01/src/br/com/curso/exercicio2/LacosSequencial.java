package br.com.curso.exercicio2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LacosSequencial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LacosSequencial() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String numInicial1 = request.getParameter("Inicial");
		String mumFinal1 = request.getParameter("Final");
		String sequencia = null;

		ProcLacos resultado = new ProcLacos();

		sequencia = resultado.imprimeSequencia(numInicial1, mumFinal1);

		System.out.println(sequencia);
		PrintWriter writer = response.getWriter();

		writer.write("<html><body>");
		writer.write(sequencia);
		writer.write("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
