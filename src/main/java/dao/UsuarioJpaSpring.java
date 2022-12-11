package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.PaginaInicial;
import model.Usuario;

public interface UsuarioJpaSpring  extends JpaRepository<Usuario,Integer>{

}
