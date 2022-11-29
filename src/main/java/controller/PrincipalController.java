package controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import service.PaginaInicioService;
import model.Foto;
import model.PaginaInicial;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
		
	
	@GetMapping(value="Prueba/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Optional<PaginaInicial> prueba(@PathVariable String id){
		return service.pruebaService(id);
		
	}
	@GetMapping(value="Integrantes",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> integrantes() {
		return service.getIntegrantesService();
	}
	
	  @RequestMapping( value = "AboutUs", method = RequestMethod.GET, produces = "application/json" ) 
	  public ResponseEntity<String> aboutUs() { 
		  final HttpHeaders httpHeaders = new HttpHeaders();
	  httpHeaders.setContentType(MediaType.APPLICATION_JSON); 
	  return new ResponseEntity<String>
	  ("{\"About Us\": \"Somos " + service.aboutUs() + " y estamos haciendo una aplicacion\"}",
	  httpHeaders,HttpStatus.OK); }
	  
	  @RequestMapping( value = "Contacto", method = RequestMethod.GET, produces =
	  "application/json" ) public ResponseEntity<String> Contacto() { 
		   String [] contacto = service.contacto();
		   contacto = contacto[0].split(",");
		  final HttpHeaders httpHeaders = new HttpHeaders();
	  httpHeaders.setContentType(MediaType.APPLICATION_JSON); return new
	  ResponseEntity<String>("{\"Email\": \""+ contacto[0] + "\"" +
	  "\n" + "\"Telefono\": \"" + contacto[1] +"\"}", httpHeaders,HttpStatus.OK); }
	 

}
