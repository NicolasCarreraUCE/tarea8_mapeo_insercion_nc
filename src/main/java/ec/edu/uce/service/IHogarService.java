package ec.edu.uce.service;

import ec.edu.uce.modelo.Hogar;

public interface IHogarService {
	void insertarNuevoHogar(Hogar hogar);
	Hogar buscarHogarPorId(Integer id);
	void actualizarHogar(Hogar hogar);
	void borrarHogarPorId(Integer id);
}
