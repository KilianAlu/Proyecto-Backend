package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the paginaInicial database table.
 * 
 */
@Entity
@NamedQuery(name="PaginaInicial.findAll", query="SELECT p FROM PaginaInicial p")
public class PaginaInicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAGINAINICIAL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAGINAINICIAL_ID_GENERATOR")
	private int id;

	private String email;

	private String integrantes;

	private BigInteger telefono;

	public PaginaInicial() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIntegrantes() {
		return this.integrantes;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}

	public BigInteger getTelefono() {
		return this.telefono;
	}

	public void setTelefono(BigInteger telefono) {
		this.telefono = telefono;
	}

}