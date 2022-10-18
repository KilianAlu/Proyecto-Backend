package controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@CrossOrigin(origins = "*") //permite recibir peticiones desde cualquier origen
@RestController
public class PrincipalController {
	@RequestMapping(
			value = "/AboutUs",
			method = RequestMethod.GET,
			produces = "application/json"
			)
	public ResponseEntity<String> aboutUs() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Test\": \"Somos 3 estudiantes montando un proyecto\"}",
				httpHeaders,HttpStatus.OK);
	}
	@RequestMapping(
			value = "/Contacto",
			method = RequestMethod.GET,
			produces = "application/json"
			)
	public ResponseEntity<String> Contacto() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"Test\": \"Email: Alu2019068@365.stucom.com \"" + "\n"
				+ "\"Test\": \"Telefono: 63224576\"}",
				httpHeaders,HttpStatus.OK);
	}


}
