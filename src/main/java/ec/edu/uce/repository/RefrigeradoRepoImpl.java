package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bebida;
import ec.edu.uce.modelo.Refrigerado;

@Repository
public class RefrigeradoRepoImpl implements IRefrigeradoRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarRefrigerado(Refrigerado refrigerado) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				refrigerado.getId(),
				refrigerado.getNom_producto(),
				refrigerado.getFecha_caducidad(),
				refrigerado.getTemperatura_refrigeracion(),
				refrigerado.getTipo_producto()
		};
		this.jdbcTemplate.update("INSERT INTO public.refrigerados(\r\n"
				+ "	id_refrigerados, nom_productos_refrigerados, fecha_caducidad_refrigerados, temperatura_refrigerados, tipo_producto_refrigerado)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

	@Override
	public Refrigerado buscarRefrigerado(Integer id) {
		// TODO Auto-generated method stub
		Object[] datosABuscar = new Object[] {
				id
		};
		return this.jdbcTemplate.queryForObject("SELECT * FROM public.refrigerados WHERE id_refrigerados=?", datosABuscar, new BeanPropertyRowMapper<Refrigerado>(Refrigerado.class));
	}

	@Override
	public void actualizarRefrigerado(Refrigerado refrigerado) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] {
				refrigerado.getId(),
				refrigerado.getNom_producto(),
				refrigerado.getFecha_caducidad(),
				refrigerado.getTemperatura_refrigeracion(),
				refrigerado.getTipo_producto(),
				refrigerado.getId()
		};
		this.jdbcTemplate.update("UPDATE public.refrigerados\r\n"
				+ "	SET id_refrigerados=?, nom_productos_refrigerados=?, fecha_caducidad_refrigerados=?, temperatura_refrigerados=?, tipo_producto_refrigerado=?\r\n"
				+ "	WHERE id_refrigerados=?",datosAActualizar);
	}

	@Override
	public void borrarRefrigerado(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] {
				id
		};
		this.jdbcTemplate.update("DELETE FROM public.refrigerados\r\n"
				+ "	WHERE id_refrigerados=?", datoABorrar);
	}

}
