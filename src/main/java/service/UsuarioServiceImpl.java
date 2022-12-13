package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UsuarioDao;
import model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioDao Dao;
	@Override
	public void crearUsuario(Usuario usuario) {
		Dao.añadirUsuario(usuario);
	}
	@Override
	public void eliminarUsuario(String id) {
		if(Dao.BuscarUsuarioId(id) == 0) {
			
		}
		else {
			Dao.eliminarUsuario(id);
		}
		
		
	}

}
