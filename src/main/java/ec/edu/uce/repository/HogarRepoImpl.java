package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

}
