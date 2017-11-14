package br.com.curso.exercicio3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TipoLaco extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TipoLaco() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String numInicial = request.getParameter("Inicial");
		String numFinal = request.getParameter("Final");
		String parLaco = request.getParameter("tipoLaco");
		String tipo = "";
		
		ProcTipoLaco qsequencia = new ProcTipoLaco();
		
		tipo = qsequencia.selecioneLaco(numInicial, numFinal, parLaco);
		
		
		PrintWriter writer = response.getWriter();
		
		writer.write("<html><body>");
		writer.write(tipo);
		writer.write("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
