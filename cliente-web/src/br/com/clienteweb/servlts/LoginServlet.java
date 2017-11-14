package br.com.clienteweb.servlts;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cliente.dao.UsuarioDao;
import br.com.cliente.model.Usuario;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 String campUsuario = request.getParameter("usuario");
	 String campSenha = request.getParameter("senha");
	 
	Usuario user = new Usuario(campUsuario, campSenha);
	List<Usuario> usuario = usuarioDao.select();
	
		
	 
	 
	 
	}

}
