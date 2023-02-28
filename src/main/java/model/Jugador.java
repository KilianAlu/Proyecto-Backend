package model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the Jugador database table.
 * 
 */
@Entity
@NamedQuery(name="Jugador.findAll", query="SELECT j FROM Jugador j")
public class Jugador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="JUGADOR_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="JUGADOR_ID_GENERATOR")
	private int id;

	private int altura;

	private String apellido;

	private int dorsal;

	@Lob
	private String foto;

	private String manoDominante;

	private String nombre;

	private String posicion;

	private String rol;

	private String salud;
	
	@ManyToOne
	@JoinColumn(name="idEquipo")
	//@JsonBackReference
	private Equipo equipo;

	public Jugador() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDorsal() {
		return this.dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getManoDominante() {
		return this.manoDominante;
	}

	public void setManoDominante(String manoDominante) {
		this.manoDominante = manoDominante;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getSalud() {
		return this.salud;
	}

	public void setSalud(String salud) {
		this.salud = salud;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}