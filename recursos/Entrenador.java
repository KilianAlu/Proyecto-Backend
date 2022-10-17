package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="")
@NamedQuery(name="Contacto.findAll", query="SELECT * FROM Contacto c")
public class Entrenador implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEntrenador;
	
	private String usuario;
	
	private String apellidos;
	
	private String contraseña;
	
	private Jugador[] listaJugadores;
	
	private Equipo[] listaEquipos;
	
	private Jugada[] listaJugadas;
	
	private Anotacion[] listaAnotaciones;
	
	private Partido[] listaPartidos;

}
