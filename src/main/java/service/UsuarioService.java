package service;

import org.springframework.stereotype.Service;

import model.Usuario;
@Service
public interface UsuarioService {
	void crearUsuario(Usuario usuario);
	void eliminarUsuario(String id);
}
