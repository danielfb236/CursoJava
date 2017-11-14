package br.com.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cliente.model.Usuario;

public class UsuarioDao implements IDefautDao{

	private List<Usuario> mockUsuarios;
	
	public UsuarioDao() {
		
		mockUsuarios =  new ArrayList<Usuario>();
		mockUsuarios.add(new Usuario("Jan", "123456"));
		mockUsuarios.add(new Usuario("Ismael", "1239999"));
	}
		
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<?> select() {
			return this.mockUsuarios;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
