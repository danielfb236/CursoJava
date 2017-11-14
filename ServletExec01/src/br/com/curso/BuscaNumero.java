package br.com.curso;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuscaNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BuscaNumero() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String total = null;

		String num1 = request.getParameter("numero1");

		String num2 = request.getParameter("numero2");

		ProcBusca proc = new ProcBusca();

		total = proc.verificaMaior(num1, num2);

		PrintWriter writer = response.getWriter();

		writer.write("<html><body>");
		writer.write(total);
		writer.write("</html></body>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
