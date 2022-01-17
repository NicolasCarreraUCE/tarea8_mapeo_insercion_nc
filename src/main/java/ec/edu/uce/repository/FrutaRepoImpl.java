package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bebida;
import ec.edu.uce.modelo.Fruta;

@Repository
public class FrutaRepoImpl implements IFrutaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarFruta(Fruta fruta) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				fruta.getId(),
				fruta.getNom_producto(),
				fruta.getFecha_elaboracion(),
				fruta.getFecha_caducidad(),
				fruta.getPeso_kilogramos()
		};
		this.jdbcTemplate.update("INSERT INTO public.frutas(\r\n"
				+ "	id_fruta, nom_producto, fecha_elaboracion, fecha_caducidad, peso_kilogramos)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

	@Override
	public Fruta buscarFruta(Integer id) {
		// TODO Auto-generated method stub
		Object[] datosABuscar = new Object[] {
				id
		};
		return this.jdbcTemplate.queryForObject("SELECT * FROM public.frutas WHERE id_fruta=?", datosABuscar, new BeanPropertyRowMapper<Fruta>(Fruta.class));
	}

	@Override
	public void actualizarFruta(Fruta fruta) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] {
				fruta.getId(),
				fruta.getNom_producto(),
				fruta.getFecha_elaboracion(),
				fruta.getFecha_caducidad(),
				fruta.getPeso_kilogramos(),
				fruta.getId()
		};
		this.jdbcTemplate.update("UPDATE public.frutas\r\n"
				+ "	SET id_fruta=?, nom_producto=?, fecha_elaboracion=?, fecha_caducidad=?, peso_kilogramos=?\r\n"
				+ "	WHERE id_fruta=?",datosAActualizar);
	}

	@Override
	public void borrarFruta(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] {
				id
		};
		this.jdbcTemplate.update("DELETE FROM public.frutas\r\n"
				+ "	WHERE id_fruta=?", datoABorrar);
	}

}
