package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Bebida;
import ec.edu.uce.modelo.Carne;
import ec.edu.uce.modelo.Congelado;
import ec.edu.uce.modelo.Despensa;
import ec.edu.uce.modelo.Fruta;
import ec.edu.uce.modelo.Hogar;
import ec.edu.uce.modelo.Medicamentos;
import ec.edu.uce.modelo.Pescado;
import ec.edu.uce.modelo.Refrigerado;
import ec.edu.uce.modelo.Verdura;
import ec.edu.uce.repository.IBebidaRepo;
import ec.edu.uce.repository.IDespensaRepo;
import ec.edu.uce.repository.IMedicamentoRepo;
import ec.edu.uce.repository.IRefrigeradoRepo;
import ec.edu.uce.service.IBebidaService;
import ec.edu.uce.service.ICarneService;
import ec.edu.uce.service.ICongeladoService;
import ec.edu.uce.service.IDespensaService;
import ec.edu.uce.service.IFrutaService;
import ec.edu.uce.service.IHogarService;
import ec.edu.uce.service.IMedicamentoService;
import ec.edu.uce.service.IPescadoService;
import ec.edu.uce.service.IRefrigeradoService;
import ec.edu.uce.service.IVerduraService;

@SpringBootApplication
public class Tarea8MapeoInsercionNcApplication implements CommandLineRunner {

	@Autowired
	private IFrutaService frutaService;
	@Autowired
	private IVerduraService verduraService;
	@Autowired
	private IRefrigeradoService refrigeradoService;
	@Autowired
	private ICongeladoService congeladoService;
	@Autowired
	private ICarneService carneService;
	@Autowired
	private IPescadoService pescadoService;
	@Autowired
	private IDespensaService despensaService;
	@Autowired
	private IHogarService hogarService;
	@Autowired
	private IBebidaService bebidaService;
	@Autowired
	private IMedicamentoService medicamentoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea8MapeoInsercionNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Fruta fruta = new Fruta();
		fruta.setId(1);
		fruta.setNom_producto("Manzana");
		fruta.setFecha_elaboracion("14/01/2022");
		fruta.setFecha_elaboracion("14/02/2022");
		fruta.setPeso_kilogramos(0.35);
		
		this.frutaService.insertarNuevoFruta(fruta);
		
		Verdura verdura = new Verdura();
		verdura.setId(2);
		verdura.setNom_producto("Manzana");
		verdura.setFecha_elaboracion("15/01/2022");
		verdura.setFecha_elaboracion("15/02/2022");
		verdura.setPeso_kilogramos(0.25);
		
		this.verduraService.insertarNuevoVerdura(verdura);
	
		Refrigerado refrigerado = new Refrigerado();
		refrigerado.setId(3);
		refrigerado.setNom_producto("Leche");
		refrigerado.setFecha_caducidad("16/03/2022");
		refrigerado.setTemperatura_refrigeracion(10.0);
		refrigerado.setTipo_producto("Lacteo");
		this.refrigeradoService.insertarNuevoRefrigerado(refrigerado);
		
		Congelado congelado = new Congelado();
		this.congeladoService.insertarNuevoCongelado(congelado);
	
		Carne carne = new Carne();
		this.carneService.insertarNuevoCarne(carne);
		
		Pescado pescado = new Pescado();
		this.pescadoService.insertarNuevoPescado(pescado);
		
		Despensa despensa = new Despensa();
		this.despensaService.insertarNuevoDespensa(despensa);
		
		Hogar hogar = new Hogar();
		this.hogarService.insertarNuevoHogar(hogar);
		
		Bebida bebida = new Bebida();
		this.bebidaService.insertarNuevoBebida(bebida);
		
		Medicamentos medicamentos = new Medicamentos();
		this.medicamentoService.insertarNuevoMedicamento(medicamentos);
	}

}
