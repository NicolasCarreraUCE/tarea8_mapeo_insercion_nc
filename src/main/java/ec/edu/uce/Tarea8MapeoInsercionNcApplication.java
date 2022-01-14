package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Verdura;
import ec.edu.uce.service.IVerduraService;

@SpringBootApplication
public class Tarea8MapeoInsercionNcApplication implements CommandLineRunner {

	@Autowired
	private IVerduraService verduraService;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea8MapeoInsercionNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Verdura verdura = new Verdura();
		verdura.setId(1);
		verdura.setNom_producto("Manzana");
		verdura.setFecha_elaboracion("14/01/2022");
		verdura.setFecha_elaboracion("14/02/2022");
		verdura.setPeso_kilogramos(0.25);
		
		this.verduraService.insertarNuevoVerdura(verdura);
	}

}
