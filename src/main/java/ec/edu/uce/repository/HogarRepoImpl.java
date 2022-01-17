package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bebida;
import ec.edu.uce.modelo.Hogar;

@Repository
public class HogarRepoImpl implements IHogarRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarHogar(Hogar hogar) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				hogar.getId(),
				hogar.getNom_producto(),
				hogar.getFecha_elaboracion(),
				hogar.getPeso_kilogramos(),
				hogar.getNumero_unidades()
		};
		this.jdbcTemplate.update("INSERT INTO public.hogar(\r\n"
				+ "	id_hogar, nom_producto_hogar, fecha_elaboracion_hogar, peso_kilogramos_hogar, num_unidades_hogar)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

	@Override
	public Hogar buscarHogar(Integer id) {
		// TODO Auto-generated method stub
		Object[] datosABuscar = new Object[] {
				id
		};
		return this.jdbcTemplate.queryForObject("SELECT * FROM public.hogar WHERE id_hogar=?", datosABuscar, new BeanPropertyRowMapper<Hogar>(Hogar.class));
	}

	@Override
	public void actualizarHogar(Hogar hogar) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] {
				hogar.getId(),
				hogar.getNom_producto(),
				hogar.getFecha_elaboracion(),
				hogar.getPeso_kilogramos(),
				hogar.getNumero_unidades(),
				hogar.getId()
		};
		this.jdbcTemplate.update("UPDATE public.hogar\r\n"
				+ "	SET id_hogar=?, nom_producto_hogar=?, fecha_elaboracion_hogar=?, peso_kilogramos_hogar=?, num_unidades_hogar=?\r\n"
				+ "	WHERE id_hogar=?",datosAActualizar);
	}

	@Override
	public void borrarHogar(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] {
				id
		};
		this.jdbcTemplate.update("DELETE FROM public.hogar\r\n"
				+ "	WHERE id_hogar=?;", datoABorrar);
	}

}
