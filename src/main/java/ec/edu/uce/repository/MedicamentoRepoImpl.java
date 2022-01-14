package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

}
