package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bebida;
import ec.edu.uce.modelo.Pescado;

@Repository
public class PescadoRepoImpl implements IPescadoRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarPescado(Pescado pescado) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				pescado.getId(),
				pescado.getNom_producto(),
				pescado.getFecha_caducidad(),
				pescado.getPeso_kilogramos(),
				pescado.getTipo_agua()
		};
		this.jdbcTemplate.update("INSERT INTO public.pescado(\r\n"
				+ "	id_pescado, nom_producto_pescado, fecha_caducidad_pescado, peso_kilogramos_pescado, tipo_agua_pescado)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

	@Override
	public Pescado buscarPescado(Integer id) {
		// TODO Auto-generated method stub
		Object[] datosABuscar = new Object[] {
				id
		};
		return this.jdbcTemplate.queryForObject("SELECT * FROM public.pescado WHERE id_pescado=?", datosABuscar, new BeanPropertyRowMapper<Pescado>(Pescado.class));
	}

	@Override
	public void actualizarPescado(Pescado pescado) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] {
				pescado.getId(),
				pescado.getNom_producto(),
				pescado.getFecha_caducidad(),
				pescado.getPeso_kilogramos(),
				pescado.getTipo_agua(),
				pescado.getId()
		};
		this.jdbcTemplate.update("UPDATE public.pescado\r\n"
				+ "	SET id_pescado=?, nom_producto_pescado=?, fecha_caducidad_pescado=?, peso_kilogramos_pescado=?, tipo_agua_pescado=?\r\n"
				+ "	WHERE id_pescado=?",datosAActualizar);
	}

	@Override
	public void borrarPescado(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] {
				id
		};
		this.jdbcTemplate.update("DELETE FROM public.pescado\r\n"
				+ "	WHERE id_pescado=?", datoABorrar);
	}

}
