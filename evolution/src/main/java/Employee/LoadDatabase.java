package Employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


/*	Introducimos por consola de comandos los datos y después consultamos las URL con "localhost:8080/employees/2"
	siendo el 2 el id del registro
	Si introducimos un usuario alto, por ejemplo 90, vemos que devuelve el mensaje de que no se ha podido encontrar el usuario
	localhost:8080/employees/90
	*/
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {

		return args -> {
			// tag::new_constructor[]
			log.info("Preloading " + repository.save(new Employee("Miguel", "Acosta", "administrador", new Date(1980, 3, 22))));
			log.info("Preloading " + repository.save(new Employee("Ramon", "Gonzalez", "encargado", new Date(1990,05,12))));
			log.info("Preloading " + repository.save(new Employee("Juan", "Ramirez", "empleado", new Date(1995,05,12))));
			// end::new_constructor[]
		};
	}
}
