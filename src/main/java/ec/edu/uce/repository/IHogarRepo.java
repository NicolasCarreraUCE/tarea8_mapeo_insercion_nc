package ec.edu.uce.repository;

import ec.edu.uce.modelo.Hogar;

public interface IHogarRepo {
	void insertarHogar(Hogar hogar);
	Hogar buscarHogar(Integer id);
	void actualizarHogar(Hogar hogar);
	void borrarHogar(Integer id);
}
