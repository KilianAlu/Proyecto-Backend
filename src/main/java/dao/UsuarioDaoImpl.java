package dao;

import java.util.Date;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Usuario;
@Repository
public class UsuarioDaoImpl implements UsuarioDao{
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	UsuarioJpaSpring Jpa;

	@Transactional
	@Override
	public void añadirUsuario(Usuario usuario) {
		 entityManager.createNativeQuery("INSERT INTO `usuario`(`nombre`, `contraseña`, `email`, `fechaNacimiento`,`foto`) VALUES (?,?,?,?,?)")
	      .setParameter(1, usuario.getNombre())
	      .setParameter(2, DigestUtils.md5Hex(usuario.getContraseña()))
	      .setParameter(3, usuario.getEmail())
	      .setParameter(4, usuario.getFechaNacimiento())
	      .setParameter(5, "10.0.2.2/php/usuario.png")
	      .executeUpdate();
	} 

	@Transactional
	@Override
	public void eliminarUsuario(String id) {
		Jpa.deleteById(Integer.parseInt(id));
	}
	@Override
	public int BuscarUsuarioId(String id) {
		if((Jpa.findById(Integer.parseInt(id))) != null){
			return 1;
		};
		return 0;
	}
	

	@Override
	public Usuario login(String nombre, String contrasena) {
			return Jpa.login(nombre,contrasena);
	}

	@Override
	public int  existeUsuario(String nombre, String contrasena) {
		// TODO Auto-generated method stub
		return Jpa.existeUsuario(nombre, contrasena);
	}

	@Override
	public Optional<Usuario> infoUsuarioId(String id) {
		// TODO Auto-generated method stub
		return Jpa.findById(Integer.parseInt(id));
	}

	@Override
	public int existeNombre(String nombre) {
		// TODO Auto-generated method stub
		return Jpa.existNombre(nombre);
	}

	@Override
	public int existeEmail(String email) {
		// TODO Auto-generated method stub
		return Jpa.existeEmail(email);
	}

	@Transactional
	@Override
	public String cambiarNombre(int id, String nNombre) {
		// TODO Auto-generated method stub
		Jpa.cambiarNombre(id, nNombre);
		return "El nombre Ha sido cambiado";
	}
	@Transactional
	@Override
	public String cambiarEmail(int id, String nEmail) {
		// TODO Auto-generated method stub
		Jpa.cambiarEmail(id, nEmail);
		return "El Correo ha sido cambiado";
	}
	
	@Transactional
	@Override
	public String cambiarFechaNacimiento(int id, Date nFecha) {
		// TODO Auto-generated method stub
		Jpa.cambiarFechaNacimiento(id, nFecha);
		return "la fecha ha sido cambiado";
	}
	
	@Transactional
	@Override
	public String cambiarContrasena(int id, String nContrasena) {
		// TODO Auto-generated method stub
		Jpa.cambiarContrasena(id, nContrasena);
		return "La Contraseña ha sido cambiada";
	}
	@Transactional
	@Override
	public String cambiarFoto(int id, String nFoto) {
		// TODO Auto-generated method stub
	    Jpa.cambiarFoto(id,nFoto);
		return "La foto ha sido cambiada";
	}
	
	@Override
	public int comprobarContrasena(int id, String contrasena) {
		// TODO Auto-generated method stub
		return Jpa.comprobarContrasena(contrasena,id);
	}

	

}
