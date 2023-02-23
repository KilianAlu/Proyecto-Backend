package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Equipo database table.
 * 
 */
@Entity
@NamedQuery(name="Equipo.findAll", query="SELECT e FROM Equipo e")
public class Equipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EQUIPO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EQUIPO_ID_GENERATOR")
	private int id;

	private String nombre;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idEntrenador")
	private Usuario usuario;

	//bi-directional many-to-one association to Jugador
	@OneToMany(mappedBy="equipo")
	private List<Jugador> jugadors;

	//bi-directional many-to-one association to Partido
	@OneToMany(mappedBy="equipo")
	private List<Partido> partidos;

	public Equipo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Jugador> getJugadors() {
		return this.jugadors;
	}

	public void setJugadors(List<Jugador> jugadors) {
		this.jugadors = jugadors;
	}

	public Jugador addJugador(Jugador jugador) {
		getJugadors().add(jugador);
		jugador.setEquipo(this);

		return jugador;
	}

	public Jugador removeJugador(Jugador jugador) {
		getJugadors().remove(jugador);
		jugador.setEquipo(null);

		return jugador;
	}

	public List<Partido> getPartidos() {
		return this.partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	public Partido addPartido(Partido partido) {
		getPartidos().add(partido);
		partido.setEquipo(this);

		return partido;
	}

	public Partido removePartido(Partido partido) {
		getPartidos().remove(partido);
		partido.setEquipo(null);

		return partido;
	}

}