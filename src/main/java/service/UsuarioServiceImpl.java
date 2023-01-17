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
	public String eliminarUsuario(String id) {
		if(Dao.BuscarUsuarioId(id) == 0) {
			return "Este usuario no existe";
					
		}
		else {
			Dao.eliminarUsuario(id);
			return "El usuario Ha sido eliminado";
		}
		
		
	}
	@Override
	public Usuario login(String nombre, String contrasena) {
		return Dao.login(nombre, contrasena);
	}
	@Override
	public boolean cLogin(String nombre, String contrasena) {
		// TODO Auto-generated method stub
		if(Dao.cLogin(nombre, contrasena) == 1) {
			return true;
		}
		else {
			return false;
		}
			}

}
