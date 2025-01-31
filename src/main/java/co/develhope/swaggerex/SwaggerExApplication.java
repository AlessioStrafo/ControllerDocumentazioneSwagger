//scrivi una applicazione web Spring Boot con:
//NameController dove si mappa il parametro name per:
//restituire il nome alla chiamata GET
//restuiture il nome al contrario (es. da John a nhoJ, usando StringBuilder) alla chiamata POST
//aggungi tutto il necessario per avere una documentazione completa delle endpoint create sopra
// (nome della chiamata, parametri ecc)
//testare le chiamate del API endpoint usando Postman
package co.develhope.swaggerex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerExApplication.class, args);
	}

}
