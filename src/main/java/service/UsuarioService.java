package service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import model.Usuario;
@Service
public interface UsuarioService {
	void crearUsuario(Usuario usuario);
	String eliminarUsuario(String id);
	Usuario login(String nombre, String contrasena);
	boolean exUsuario(String nombre,String contrasena);
	Optional<Usuario> verPerfilUsuario(String id);
	boolean exNombre(String nombre);
	boolean exEmail(String nombre);
	String cNombre(int id,String nNombre);
}
