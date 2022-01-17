package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger LOG = LoggerFactory.getLogger(Tarea8MapeoInsercionNcApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea8MapeoInsercionNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// INSERTAR
		Fruta fruta = new Fruta();
		fruta.setId(10);
		fruta.setNom_producto("Manzana");
		fruta.setFecha_elaboracion("14/01/2022");
		fruta.setFecha_caducidad("14/02/2022");
		fruta.setPeso_kilogramos(0.35);

		this.frutaService.insertarNuevoFruta(fruta);
		
		Verdura verdura = new Verdura();
		verdura.setId(10);
		verdura.setNom_producto("Manzana");
		verdura.setFecha_elaboracion("15/01/2022");
		verdura.setFecha_elaboracion("15/02/2022");
		verdura.setPeso_kilogramos(0.25);
		
		this.verduraService.insertarNuevoVerdura(verdura);
	
		Refrigerado refrigerado = new Refrigerado();
		refrigerado.setId(10);
		refrigerado.setNom_producto("Leche");
		refrigerado.setFecha_caducidad("16/03/2022");
		refrigerado.setTemperatura_refrigeracion(10.0);
		refrigerado.setTipo_producto("Lacteo");
		
		this.refrigeradoService.insertarNuevoRefrigerado(refrigerado);
		
		Congelado congelado = new Congelado();
		congelado.setId(10);
		congelado.setNom_producto("Pollo congelado");
		congelado.setFecha_caducidad("17/03/2022");
		congelado.setTemperatura_congelacion(-10.0);
		congelado.setTipo_producto("Carne");
		
		this.congeladoService.insertarNuevoCongelado(congelado);
	
		Carne carne = new Carne();
		carne.setId(10);
		carne.setNom_producto("Chuleta de cerdo");
		carne.setFecha_caducidad("18/03/2022");
		carne.setPocentaje_grasa(0.30);
		carne.setPeso_kilogramos(10.0);
		
		this.carneService.insertarNuevoCarne(carne);
		
		Pescado pescado = new Pescado();
		pescado.setId(10);
		pescado.setNom_producto("Tilapia");
		pescado.setFecha_caducidad("19/03/2022");
		pescado.setPeso_kilogramos(5.0);
		pescado.setTipo_agua("Agua Dulce");
		
		this.pescadoService.insertarNuevoPescado(pescado);
		
		Despensa despensa = new Despensa();
		despensa.setId(10);
		despensa.setNom_producto("Avena");
		despensa.setFecha_elaboracion("15/01/2022");
		despensa.setFecha_caducidad("20/03/2022");
		despensa.setPeso_kilogramos(1.0);
		
		this.despensaService.insertarNuevoDespensa(despensa);
		
		Hogar hogar = new Hogar();
		hogar.setId(10);
		hogar.setNom_producto("Papel de baño");
		hogar.setFecha_elaboracion("15/01/2022");
		hogar.setPeso_kilogramos(0.5);
		hogar.setNumero_unidades(12);
		
		this.hogarService.insertarNuevoHogar(hogar);
		
		Bebida bebida = new Bebida();
		bebida.setId(10);
		bebida.setNom_producto("Coca-Cola");
		bebida.setFecha_elaboracion("15/01/2022");
		bebida.setFecha_caducidad("21/03/2022");
		bebida.setPorcentaje_alcohol(0.0);
		
		this.bebidaService.insertarNuevoBebida(bebida);
		
		Medicamentos medicamentos = new Medicamentos();
		medicamentos.setId(10);
		medicamentos.setNom_producto("Parecetamol");
		medicamentos.setFecha_elaboracion("15/01/2022");
		medicamentos.setFecha_caducidad("22/03/2022");
		medicamentos.setPeso_gramos(500.0);
		
		this.medicamentoService.insertarNuevoMedicamento(medicamentos);
		
		
		// CONSULTAS
		Fruta fr2 = this.frutaService.buscarFrutaPorId(10);
		LOG.info(fr2.toString());
		
		Verdura vr2 = this.verduraService.buscarVerduraPorId(10);
		LOG.info(vr2.toString());
		
		Refrigerado rf2 = this.refrigeradoService.buscarRefrigeradoPorId(10);
		LOG.info(rf2.toString());
		
		Congelado cn2 = this.congeladoService.buscarCongeladoPorId(10);
		LOG.info(cn2.toString());
		
		Carne cr2 = this.carneService.buscarCarnePorId(10);
		LOG.info(cr2.toString());
		
		Pescado ps2 = this.pescadoService.buscarPescadoPorId(10);
		LOG.info(ps2.toString());
		
		Despensa ds2 = this.despensaService.buscarDespensaPorId(10);
		LOG.info(ds2.toString());
		
		Hogar hg2 = this.hogarService.buscarHogarPorId(10);
		LOG.info(hg2.toString());
		
		Bebida bb2 = this.bebidaService.buscarBebidaPorId(10);
		LOG.info(bb2.toString());
		
		Medicamentos md2 = this.medicamentoService.buscarMedicamentoPorId(10);
		LOG.info(md2.toString());
		
		// ACTUALIZAR
		Fruta fr3 = new Fruta();
		fr3.setId(10);
		fr3.setNom_producto("Manzana");
		fr3.setFecha_elaboracion("14/01/2022");
		fr3.setFecha_caducidad("14/02/2023");
		fr3.setPeso_kilogramos(0.35);
		
		this.frutaService.actualizarFruta(fr3);
		
		Verdura vr3 = new Verdura();
		vr3.setId(10);
		vr3.setNom_producto("Manzana");
		vr2.setFecha_elaboracion("15/01/2022");
		vr3.setFecha_elaboracion("15/02/2023");
		vr3.setPeso_kilogramos(0.25);
		
		this.verduraService.actualizarVerdura(vr3);
		
		Refrigerado rf3 = new Refrigerado();
		rf3.setId(10);
		rf3.setNom_producto("Leche");
		rf3.setFecha_caducidad("16/03/2023");
		rf3.setTemperatura_refrigeracion(10.0);
		rf3.setTipo_producto("Lacteo");
		
		this.refrigeradoService.actualizarRefrigerado(rf3);
		
		Congelado cn3 = new Congelado();
		cn3.setId(10);
		cn3.setNom_producto("Pollo congelado");
		cn3.setFecha_caducidad("17/03/2023");
		cn3.setTemperatura_congelacion(-10.0);
		cn3.setTipo_producto("Carne");
		
		this.congeladoService.actualizarCongelado(cn3);
	
		Carne cr3 = new Carne();
		cr3.setId(10);
		cr3.setNom_producto("Chuleta de cerdo");
		cr3.setFecha_caducidad("18/03/2023");
		cr3.setPocentaje_grasa(0.30);
		cr3.setPeso_kilogramos(10.0);
		
		this.carneService.actualizarCarne(cr3);
		
		Pescado ps3 = new Pescado();
		ps3.setId(10);
		ps3.setNom_producto("Tilapia");
		ps3.setFecha_caducidad("19/03/2023");
		ps3.setPeso_kilogramos(5.0);
		ps3.setTipo_agua("Agua Dulce");
		
		this.pescadoService.actualizarPescado(ps3);
		
		Despensa ds3 = new Despensa();
		ds3.setId(10);
		ds3.setNom_producto("Avena");
		ds3.setFecha_elaboracion("15/01/2022");
		ds3.setFecha_caducidad("20/03/2023");
		ds3.setPeso_kilogramos(1.0);
		
		this.despensaService.actualizarDespensa(ds3);
		
		Hogar hg3 = new Hogar();
		hg3.setId(10);
		hg3.setNom_producto("Papel de baño");
		hg3.setFecha_elaboracion("15/01/2022");
		hg3.setPeso_kilogramos(0.75);
		hg3.setNumero_unidades(12);
		
		this.hogarService.actualizarHogar(hg3);
		
		Bebida bb3 = new Bebida();
		bb3.setId(10);
		bb3.setNom_producto("Coca-Cola");
		bb3.setFecha_elaboracion("15/01/2022");
		bb3.setFecha_caducidad("21/03/2023");
		bb3.setPorcentaje_alcohol(0.0);
		
		this.bebidaService.actualizarBebida(bb3);
		
		Medicamentos md3 = new Medicamentos();
		md3.setId(10);
		md3.setNom_producto("Parecetamol");
		md3.setFecha_elaboracion("15/01/2022");
		md3.setFecha_caducidad("22/03/2023");
		md3.setPeso_gramos(500.0);
		
		this.medicamentoService.actualizarMedicamento(md3);
		
		// BORRAR
		this.frutaService.borrarFrutaPorId(10);
		
		this.verduraService.borraVerdurarPorId(10);
		
		this.refrigeradoService.borrarRefrigeradoPorId(10);
		
		this.congeladoService.borrarCongeladoPorId(10);
		
		this.carneService.borrarCarnePorId(10);
		
		this.pescadoService.borrarPescadoPorId(10);

		this.despensaService.borrarDespensaPorId(10);
		
		this.hogarService.borrarHogarPorId(10);
		
		this.bebidaService.borrarBebidaPorId(10);
		
		this.medicamentoService.borrarMedicamentoPorId(10);
		
		System.out.println();
	}

}
