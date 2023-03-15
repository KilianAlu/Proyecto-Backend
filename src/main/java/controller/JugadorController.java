package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Jugador;
import service.jugador.JugadorService;

@RestController
public class JugadorController {

	@Autowired
	JugadorService service;
	
	@GetMapping (value = "getJugadores/{idEquipo}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Jugador> jugadores(@PathVariable int idEquipo){
		return service.getJugadores(idEquipo);	
		}
	@PostMapping(value = "anadirJugador", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> añadirJugador(@RequestBody Jugador ajugador) {
		//return ajugador;
		service.añadirJugador(ajugador);
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Respuesta\": \"El Jugador Ha sido añadido\"}", httpHeaders,
				HttpStatus.OK);
	}
	
	
	@GetMapping(value = "buscarJugador/{nombre}/{idEquipo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Jugador> buscarJugador(@PathVariable String nombre, @PathVariable int idEquipo){
		return service.buscarJugador(idEquipo,nombre);
				}
	
	@PutMapping(value = "cNombreJugador",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<String> cNombreJugador(@RequestBody Jugador jugador) {
		//return ajugador;
		service.cNombreJugador(jugador.getId(),jugador.getNombre());
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Respuesta\": \"El nombre del Jugador ha sido cambiado\"}", httpHeaders,
				HttpStatus.OK);
	}
	

	@PutMapping(value = "cApellidoJugador",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<String> cApellidoJugador(@RequestBody Jugador jugador) {
		//return ajugador;
		service.cApellidoJugador(jugador.getId(),jugador.getApellido());
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Respuesta\": \"El apellido del Jugador ha sido cambiado\"}", httpHeaders,
				HttpStatus.OK);
	}
	
	@PutMapping(value = "cSaludJugador",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<String> cSaludJugador(@RequestBody Jugador jugador) {
		//return ajugador;
		service.cApellidoJugador(jugador.getId(),jugador.getSalud());
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Respuesta\": \"La Salud del Jugador ha sido cambiado\"}", httpHeaders,
				HttpStatus.OK);
	}
	
	
	
	

}
