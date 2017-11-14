package br.com.cliente.dao;

import java.util.List;

public interface IDefautDao {

	public void insert();
	
	public boolean update();
	
	public List<?> select();
	
	public boolean delete();
	
	
	
}
