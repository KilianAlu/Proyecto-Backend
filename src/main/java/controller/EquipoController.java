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

import model.Equipo;
import model.dto.EquipoDto;
import service.EquipoService;

@RestController
public class EquipoController {

	@Autowired
	EquipoService service;
	
	@PostMapping(value = "anadirEquipo", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> añadirEquipo(@RequestBody EquipoDto  aEquipo) {
		//return ajugador;
		service.anadirEquipo(aEquipo);
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Respuesta\": \"El Equipo Ha sido añadido\"}", httpHeaders,
				HttpStatus.OK);
		
	}
	
	@PutMapping(value = "cNombreEquipo", produces =  MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> cambiarEquipo(@RequestBody EquipoDto  aEquipo) {
		service.cNombre(aEquipo.getId(),aEquipo.getNombre());
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Respuesta\": \"El Nombre ha sido cambiado\"}", httpHeaders,
				HttpStatus.OK);
	}
	@GetMapping(value = "getEquipos/{idEntrenador}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Equipo> getEquipos(@PathVariable int idEntrenador){
		return service.getEquipos(idEntrenador);
	}
	
	
}
