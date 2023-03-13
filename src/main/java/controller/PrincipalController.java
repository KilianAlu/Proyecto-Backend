package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import model.dto.EquipoDto;
import service.AboutUsService;
import service.EquipoService;
import service.UsuarioService;
import service.jugador.JugadorService;
import model.Equipo;
import model.Foto;
import model.Jugador;
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
	AboutUsService service;
	@Autowired
	UsuarioService usuarios;
	@Autowired
	JugadorService jugador;
	@Autowired
	EquipoService equipo;
	/*
	 * @GetMapping(value="AboutUs",produces=MediaType.APPLICATION_JSON_VALUE) public
	 * String aboutUs() { return service.aboutUs();
	 */


	@GetMapping(value = "Integrantes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Foto> integrantes() {
		return service.getIntegrantesService();
	}
	
	@GetMapping(value = "Integrantes/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Foto> integrantesNombre(@PathVariable String nombre) {
		return service.getIntegrantesNombreService(nombre);
	}
	
	@GetMapping (value = "getJugadores/{idEquipo}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Jugador> jugadores(@PathVariable int idEquipo){
		return jugador.getJugadores(idEquipo);	
		}
	@PostMapping(value = "anadirJugador", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> añadirJugador(@RequestBody Jugador ajugador) {
		//return ajugador;
		jugador.añadirJugador(ajugador);
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Respuesta\": \"El Jugador Ha sido añadido\"}", httpHeaders,
				HttpStatus.OK);
	}
	

@PostMapping(value = "anadirEquipo", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<String> añadirEquipo(@RequestBody EquipoDto  aEquipo) {
	//return ajugador;
	equipo.anadirEquipo(aEquipo);
	final HttpHeaders httpHeaders = new HttpHeaders();
	httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity<String>("{\"Respuesta\": \"El Equipo Ha sido añadido\"}", httpHeaders,
			HttpStatus.OK);
}
	
	@GetMapping(value = "buscarJugador/{nombre}/{idEquipo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Jugador> buscarJugador(@PathVariable String nombre, @PathVariable int idEquipo){
		return jugador.buscarJugador(idEquipo,nombre);
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

	@PostMapping(value = "exNombre", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> exNombre(@RequestBody Usuario nombreUsuario) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<Boolean>(usuarios.exNombre(nombreUsuario.getNombre()), HttpStatus.OK);

	}

	@PostMapping(value = "exEmail", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> exEmail(@RequestBody Usuario email) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<Boolean>(usuarios.exEmail(email.getEmail()), HttpStatus.OK);

	}

	@PostMapping(value = "exUsuario", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> exUsuario(@RequestBody Usuario login) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<Boolean>(usuarios.exUsuario(login.getNombre(), login.getContraseña()), HttpStatus.OK);

	}
	@PutMapping(value = "cNombre" , produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>cNombre(@RequestBody Usuario usuario){
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>(
				"{\"Respuesta\": \" " + usuarios.cNombre(usuario.getId(), usuario.getNombre()) + "\"}", httpHeaders,
				HttpStatus.OK);
	}
	@PutMapping(value = "cEmail" , produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>cEmail(@RequestBody Usuario usuario){
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>(
				"{\"Respuesta\": \" " + usuarios.cEmail(usuario.getId(), usuario.getEmail()) + "\"}", httpHeaders,
				HttpStatus.OK);
	}
	
	@PutMapping(value = "cFechaNacimiento" , produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>cFechaNacimiento(@RequestBody Usuario usuario){
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>(
				"{\"Respuesta\": \" " + usuarios.cFechaNacimiento(usuario.getId(), usuario.getFechaNacimiento()) + "\"}", httpHeaders,
				HttpStatus.OK);
	}
	
	@PutMapping(value = "cContrasena" , produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>cContrasena(@RequestBody Usuario usuario){
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>(
				"{\"Respuesta\": \" " + usuarios.cContrasena(usuario.getId(), usuario.getContraseña()) + "\"}", httpHeaders,
				HttpStatus.OK);
	}
	@PutMapping(value = "cFoto" , produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>cFoto(@RequestBody Usuario usuario){
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>(
				"{\"Respuesta\": \" " + usuarios.cFoto(usuario.getId(), usuario.getFoto()) + "\"}", httpHeaders,
				HttpStatus.OK);
	}
	
	
	@PostMapping(value = "compContrasena",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> compContraseña(@RequestBody Usuario usuario) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<Boolean>(usuarios.compContrasena(usuario.getId(),usuario.getContraseña()), HttpStatus.OK);

	}
	
//	@PutMapping(value="cAlturaJugador",consumes = MediaType.APPLICATION_JSON_VALUE)
//		public ResponseEntity<String> cAlturaJugador(@RequestBody Jugador juagdor){
//		final HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//		return new "{\"Respuesta\": \" la Altura ha sido cambiada \"}", httpHeaders,
//				HttpStatus.OK);
//		}
//	}

	
	/*
	 * @RequestMapping(value = "AboutUs", method = RequestMethod.GET, produces =
	 * "application/json") public ResponseEntity<String> aboutUs() { final
	 * HttpHeaders httpHeaders = new HttpHeaders();
	 * httpHeaders.setContentType(MediaType.APPLICATION_JSON); return new
	 * ResponseEntity<String>( "{\"About Us\": \"Somos " + service.aboutUs() +
	 * " y estamos haciendo una aplicacion\"}", httpHeaders, HttpStatus.OK); }
	 * 
	 * @RequestMapping(value = "Contacto", method = RequestMethod.GET, produces =
	 * "application/json") public ResponseEntity<String> Contacto() { String[]
	 * contacto = service.contacto(); contacto = contacto[0].split(","); final
	 * HttpHeaders httpHeaders = new HttpHeaders();
	 * httpHeaders.setContentType(MediaType.APPLICATION_JSON); return new
	 * ResponseEntity<String>( "{\"Email\": \"" + contacto[0] + "\"" + "\n" +
	 * "\"Telefono\": \"" + contacto[1] + "\"}", httpHeaders, HttpStatus.OK); }
	 */
}
