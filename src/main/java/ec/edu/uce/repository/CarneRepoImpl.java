package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bebida;
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
				carne.getPocentaje_grasa(),
				carne.getPeso_kilogramos()
		};
		this.jdbcTemplate.update("INSERT INTO public.carne(\r\n"
				+ "	id_carne, nom_producto_carne, fecha_caducidad_carne, porcentaje_grasa_carne, peso_kilogramos_carne)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

	@Override
	public Carne buscarCarne(Integer id) {
		// TODO Auto-generated method stub
		Object[] datosABuscar = new Object[] {
				id
		};
		return this.jdbcTemplate.queryForObject("SELECT * FROM public.carne WHERE id_carne=?", datosABuscar, new BeanPropertyRowMapper<Carne>(Carne.class));
	}

	@Override
	public void actualizarCarne(Carne carne) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] {
				carne.getId(),
				carne.getNom_producto(),
				carne.getFecha_caducidad(),
				carne.getPocentaje_grasa(),
				carne.getPeso_kilogramos(),
				carne.getId()
		};
		this.jdbcTemplate.update("UPDATE public.carne\r\n"
				+ "	SET id_carne=?, nom_producto_carne=?, fecha_caducidad_carne=?, porcentaje_grasa_carne=?, peso_kilogramos_carne=?\r\n"
				+ "	WHERE id_carne=?",datosAActualizar);
	}

	@Override
	public void borrarCarne(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] {
				id
		};
		this.jdbcTemplate.update("DELETE FROM public.carne\r\n"
				+ "	WHERE id_carne=?", datoABorrar);
	}

}
