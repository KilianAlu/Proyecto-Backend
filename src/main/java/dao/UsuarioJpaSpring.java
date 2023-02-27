package dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Usuario;

public interface UsuarioJpaSpring extends JpaRepository<Usuario, Integer> {
	@Modifying
	@Query(value = "DELETE FROM `usuario` WHERE id = :id", nativeQuery = true)
	void deleteUsuario(@Param("id") String id);

	@Query(value = "SELECT * FROM `usuario` WHERE nombre = :nombre AND contraseña = :contrasena", nativeQuery = true)
	Usuario login(@Param("nombre") String nombre, @Param("contrasena") String contrasena);
	
	@Query(value = "SELECT EXISTS(SELECT * FROM `usuario` WHERE nombre = :nombre AND contraseña = :contrasena)", nativeQuery = true)
	int existeUsuario(@Param("nombre") String nombre, @Param("contrasena") String contrasena);
	
	@Query(value = "SELECT EXISTS(SELECT * FROM `usuario` WHERE correo = :correo)", nativeQuery = true)
	int existeEmail(@Param("correo") String email);
	@Query(value = "SELECT EXISTS(SELECT * FROM `usuario` WHERE nombre = :nombre)", nativeQuery = true)
	int existNombre(@Param("nombre") String nombre);
	
	@Modifying
	@Query(value = "Update usuario set nombre = :nombre where id = :id", nativeQuery = true)
	void cambiarNombre(@Param("id") int id,@Param("nombre") String nNombre);
	@Modifying
	@Query(value = "Update usuario set correo = :email where id = :id", nativeQuery = true)
	void cambiarEmail(@Param("id") int id,@Param("email") String nEmail );
	@Modifying
	@Query(value = "Update usuario set fechaNacimiento = :fechaNacimiento where id = :id", nativeQuery = true)
	void cambiarFechaNacimiento(@Param("id") int id,@Param("fechaNacimiento") Date nFecha);
	@Modifying
	@Query(value = "Update usuario set contraseña = :contrasena where id = :id", nativeQuery = true)
	void cambiarContrasena(@Param("id") int id,@Param("contrasena") String nContrasena);
	
	@Query(value = "SELECT EXISTS(SELECT * FROM `usuario` WHERE contraseña = :contrasena AND id = :id)", nativeQuery = true)
	int comprobarContrasena(@Param("contrasena") String contrasena,@Param("id") int id );
	
	@Modifying
	@Query(value = "Update usuario set Foto = :Foto where id = :id", nativeQuery = true)
	String cambiarFoto(@Param("id")int id, @Param("Foto")String nFoto);
}
