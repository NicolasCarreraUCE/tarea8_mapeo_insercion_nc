package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Carne;

@Repository
public class CarneRepoImpl implements ICarneRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarCarne(Carne carne) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				carne.getId(),
				carne.getNom_producto(),
				carne.getFecha_caducidad(),
				carne.getPeso_kilogramos(),
				carne.getPocentaje_grasa(),
				carne.getPeso_kilogramos()
		};
		this.jdbcTemplate.update("INSERT INTO public.carne(\r\n"
				+ "	id_carne, nom_producto_carne, fecha_caducidad_carne, porcentaje_grasa_carne, peso_kilogramos_carne)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

}
