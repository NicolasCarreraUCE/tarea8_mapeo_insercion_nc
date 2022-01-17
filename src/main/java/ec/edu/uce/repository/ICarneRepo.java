package ec.edu.uce.repository;

import ec.edu.uce.modelo.Carne;

public interface ICarneRepo {
	void insertarCarne(Carne carne);
	Carne buscarCarne(Integer id);
	void actualizarCarne(Carne carne);
	void borrarCarne(Integer id);
}
