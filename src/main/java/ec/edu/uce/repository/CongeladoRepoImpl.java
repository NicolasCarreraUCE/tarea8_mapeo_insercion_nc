package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bebida;
import ec.edu.uce.modelo.Congelado;

@Repository
public class CongeladoRepoImpl implements ICongeladoRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarCongelado(Congelado congelado) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				congelado.getId(),
				congelado.getNom_producto(),
				congelado.getFecha_caducidad(),
				congelado.getTemperatura_congelacion(),
				congelado.getTipo_producto()
		};
		this.jdbcTemplate.update("INSERT INTO public.congelados(\r\n"
				+ "	id_congelados, nom_producto_congelado, fecha_caducidad_congelado, temperatura_congelado, tipo_producto_congelado)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

	@Override
	public Congelado buscarCongelado(Integer id) {
		// TODO Auto-generated method stub
		Object[] datosABuscar = new Object[] {
				id
		};
		return this.jdbcTemplate.queryForObject("SELECT * FROM public.congelados WHERE id_congelados=?", datosABuscar, new BeanPropertyRowMapper<Congelado>(Congelado.class));
	}

	@Override
	public void actualizarCongelado(Congelado congelado) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] {
				congelado.getId(),
				congelado.getNom_producto(),
				congelado.getFecha_caducidad(),
				congelado.getTemperatura_congelacion(),
				congelado.getTipo_producto(),
				congelado.getId()
		};
		this.jdbcTemplate.update("UPDATE public.congelados\r\n"
				+ "	SET id_congelados=?, nom_producto_congelado=?, fecha_caducidad_congelado=?, temperatura_congelado=?, tipo_producto_congelado=?\r\n"
				+ "	WHERE id_congelados=?",datosAActualizar);
	}

	@Override
	public void borrarCongelado(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] {
				id
		};
		this.jdbcTemplate.update("DELETE FROM public.congelados\r\n"
				+ "	WHERE id_congelados=?", datoABorrar);
	}

}
