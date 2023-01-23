package dao;

import java.util.Optional;

import org.springframework.stereotype.Service;

import model.Usuario;
@Service
public interface UsuarioDao {
	void añadirUsuario(Usuario usuario);
	void eliminarUsuario(String id);
	int BuscarUsuarioId(String id);
	Optional<Usuario> infoUsuarioId(String id);
	Usuario login(String nombre,String contrasena); 
	int cLogin(String nombre,String contrasena);
}
