package ec.edu.uce.service;

import ec.edu.uce.modelo.Fruta;

public interface IFrutaService {
	void insertarNuevoFruta(Fruta fruta);
	Fruta buscarFrutaPorId(Integer id);
	void actualizarFruta(Fruta fruta);
	void borrarFrutaPorId(Integer id);
}
