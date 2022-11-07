package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import service.PaginaInicioService;
import model.PaginaInicial;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "*") //permite recibir peticiones desde cualquier origen
@RestController
public class PrincipalController {
	@Autowired
	PaginaInicioService service;
	/*
	 * @GetMapping(value="AboutUs",produces=MediaType.APPLICATION_JSON_VALUE) public
	 * String aboutUs() { return service.aboutUs();
	 */
		
	
	@GetMapping(value="Prueba",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PaginaInicial> prueba() {
		return service.pruebaService();
		
	}
	
	  @RequestMapping( value = "AboutUs", method = RequestMethod.GET, produces =
	  "application/json" ) public ResponseEntity<String> aboutUs() { 
		  final HttpHeaders httpHeaders = new HttpHeaders();
	  httpHeaders.setContentType(MediaType.APPLICATION_JSON); 
	  return new ResponseEntity<String>
	  ("{\"About Us\": \"Somos " + service.aboutUs() + " y estamos haciendo una aplicacion\"}",
	  httpHeaders,HttpStatus.OK); }
	  
	  @RequestMapping( value = "Contacto", method = RequestMethod.GET, produces =
	  "application/json" ) public ResponseEntity<String> Contacto() { 
		  // String [] contacto = service.contacto();
		  final HttpHeaders httpHeaders = new HttpHeaders();
	  httpHeaders.setContentType(MediaType.APPLICATION_JSON); return new
	  ResponseEntity<String>("{\"Test\": \""+ "contacto[0]" + service.contacto()+ " \"" +
	  "\n" + "\"Test\": \"" + "contacto[1]" +"\"}", httpHeaders,HttpStatus.OK); }
	 

}
