package dao;

import java.util.Date;
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
	int existeUsuario(String nombre,String contrasena);
	int existeNombre(String nombre);
	int existeEmail(String email);
	String cambiarNombre(int id,String nNombre);
	String cambiarEmail(int id,String nEmail);
	String cambiarFechaNacimiento(int id,Date nFecha);
	String cambiarContrasena(int id,String nContrasena);
	String cambiarFoto(int id, String nFoto);
	int comprobarContrasena(int id,String contrasena);
	String getFoto(int id);
	
}
