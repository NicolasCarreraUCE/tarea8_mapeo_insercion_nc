package ec.edu.uce.repository;

import ec.edu.uce.modelo.Fruta;

public interface IFrutaRepo {
	void insertarFruta(Fruta fruta);
	Fruta buscarFruta(Integer id);
	void actualizarFruta(Fruta fruta);
	void borrarFruta(Integer id);
}
