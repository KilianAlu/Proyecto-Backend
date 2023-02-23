package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Partido database table.
 * 
 */
@Entity
@NamedQuery(name="Partido.findAll", query="SELECT p FROM Partido p")
public class Partido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARTIDO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARTIDO_ID_GENERATOR")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String nombreEquipo1;

	private String nombreEquipo2;

	private int puntuacionEquipo1;

	private int puntuacionEquipo2;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="idEquipo")
	private Equipo equipo;

	public Partido() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreEquipo1() {
		return this.nombreEquipo1;
	}

	public void setNombreEquipo1(String nombreEquipo1) {
		this.nombreEquipo1 = nombreEquipo1;
	}

	public String getNombreEquipo2() {
		return this.nombreEquipo2;
	}

	public void setNombreEquipo2(String nombreEquipo2) {
		this.nombreEquipo2 = nombreEquipo2;
	}

	public int getPuntuacionEquipo1() {
		return this.puntuacionEquipo1;
	}

	public void setPuntuacionEquipo1(int puntuacionEquipo1) {
		this.puntuacionEquipo1 = puntuacionEquipo1;
	}

	public int getPuntuacionEquipo2() {
		return this.puntuacionEquipo2;
	}

	public void setPuntuacionEquipo2(int puntuacionEquipo2) {
		this.puntuacionEquipo2 = puntuacionEquipo2;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}