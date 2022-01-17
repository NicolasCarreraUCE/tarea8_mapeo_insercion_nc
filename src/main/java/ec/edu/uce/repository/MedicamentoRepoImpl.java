package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bebida;
import ec.edu.uce.modelo.Medicamentos;

@Repository
public class MedicamentoRepoImpl implements IMedicamentoRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarMedicamento(Medicamentos medicamentos) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				medicamentos.getId(),
				medicamentos.getNom_producto(),
				medicamentos.getFecha_elaboracion(),
				medicamentos.getFecha_caducidad(),
				medicamentos.getPeso_gramos()
		};
		this.jdbcTemplate.update("INSERT INTO public.medicamentos(\r\n"
				+ "	id_medicamento, nom_producto_medicamento, fecha_elaboracion_medicamaneto, fecha_caducidad_medicamento, peso_gramos_medicamento)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

	@Override
	public Medicamentos buscarMedicamento(Integer id) {
		// TODO Auto-generated method stub
		Object[] datosABuscar = new Object[] {
				id
		};
		return this.jdbcTemplate.queryForObject("SELECT * FROM public.medicamentos WHERE id_medicamento=?", datosABuscar, new BeanPropertyRowMapper<Medicamentos>(Medicamentos.class));
	}

	@Override
	public void actualizarMedicamento(Medicamentos medicamentos) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] {
				medicamentos.getId(),
				medicamentos.getNom_producto(),
				medicamentos.getFecha_elaboracion(),
				medicamentos.getFecha_caducidad(),
				medicamentos.getPeso_gramos(),
				medicamentos.getId()
		};
		this.jdbcTemplate.update("UPDATE public.medicamentos\r\n"
				+ "	SET id_medicamento=?, nom_producto_medicamento=?, fecha_elaboracion_medicamaneto=?, fecha_caducidad_medicamento=?, peso_gramos_medicamento=?\r\n"
				+ "	WHERE id_medicamento=?",datosAActualizar);
	}

	@Override
	public void borrarMedicamento(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] {
				id
		};
		this.jdbcTemplate.update("DELETE FROM public.medicamentos\r\n"
				+ "	WHERE id_medicamento=?", datoABorrar);
	}

}
