package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import service.PaginaInicioService;
import service.UsuarioService;
import model.Foto;
import model.PaginaInicial;
import model.Usuario;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = "*") // permite recibir peticiones desde cualquier origen
@RestController
public class PrincipalController {
	@Autowired
	PaginaInicioService service;
	@Autowired
	UsuarioService usuarios;
	/*
	 * @GetMapping(value="AboutUs",produces=MediaType.APPLICATION_JSON_VALUE) public
	 * String aboutUs() { return service.aboutUs();
	 */

	@GetMapping(value = "Prueba/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Optional<PaginaInicial> prueba(@PathVariable String id) {
		return service.pruebaService(id);

	}

	@GetMapping(value = "Integrantes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Foto> integrantes() {
		return service.getIntegrantesService();
	}

//	@PostMapping(value="CrearUsuario", consumes=MediaType.APPLICATION_JSON_VALUE)
//	public String crearUsuario(@RequestBody Usuario usuario) {
//		usuarios.crearUsuario(usuario);
//		return "El usuario ha sido Añadido";
//	}

	@PostMapping(value = "CrearUsuario", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> crearUsuario(@RequestBody Usuario usuario) {
		usuarios.crearUsuario(usuario);
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Respuesta\": \"El usuario Ha sido añadido\"}", httpHeaders,
				HttpStatus.OK);
	}
	@PutMapping(value = "actuPerfil")
	
	
	@GetMapping(value = "perfil/{idUsuario}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Optional<Usuario> verPerfilUsuario(@PathVariable String idUsuario) {
		return usuarios.verPerfilUsuario(idUsuario);
	}

	@DeleteMapping(value = "EliminarUsuario/{id}")
	public String eliminarUsuario(@PathVariable String id) {
		return usuarios.eliminarUsuario(id);
	}

	@PostMapping(value = "Login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Usuario login(@RequestBody Usuario login) {
		return usuarios.login(login.getNombre(), login.getContraseña());

	}
	
	@PostMapping(value = "exNombre",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> exNombre(@RequestBody Usuario nombreUsuario) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		  httpHeaders.setContentType(MediaType.APPLICATION_JSON); 
		  return new ResponseEntity<Boolean>(usuarios.exNombre(nombreUsuario.getNombre()),HttpStatus.OK);
		
	}
	
	@PostMapping(value = "exEmail",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> exEmail(@RequestBody Usuario email) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		  httpHeaders.setContentType(MediaType.APPLICATION_JSON); 
		  return new ResponseEntity<Boolean>(usuarios.exEmail(email.getCorreo()),HttpStatus.OK);
		
	}

	@PostMapping(value="cLogin",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> cLogin(@RequestBody Usuario login) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		  httpHeaders.setContentType(MediaType.APPLICATION_JSON); 
		  return new ResponseEntity<Boolean>(usuarios.cLogin(login.getNombre(), login.getContraseña()),HttpStatus.OK);
		
	}

	@GetMapping(value = "Integrantes/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Foto> integrantesNombre(@PathVariable String nombre) {
		return service.getIntegrantesNombreService(nombre);
	}

	@RequestMapping(value = "AboutUs", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> aboutUs() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>(
				"{\"About Us\": \"Somos " + service.aboutUs() + " y estamos haciendo una aplicacion\"}", httpHeaders,
				HttpStatus.OK);
	}

	@RequestMapping(value = "Contacto", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> Contacto() {
		String[] contacto = service.contacto();
		contacto = contacto[0].split(",");
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>(
				"{\"Email\": \"" + contacto[0] + "\"" + "\n" + "\"Telefono\": \"" + contacto[1] + "\"}", httpHeaders,
				HttpStatus.OK);
	}
	
	
}
