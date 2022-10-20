package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import model.PaginaInicial;

@Service
public interface PaginaInicioJpaSpring extends JpaRepository<PaginaInicial,Integer>{

}
