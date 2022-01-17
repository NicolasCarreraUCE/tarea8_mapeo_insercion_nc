package ec.edu.uce.service;

import ec.edu.uce.modelo.Carne;

public interface ICarneService {
	void insertarNuevoCarne(Carne carne);
	Carne buscarCarnePorId(Integer id);
	void actualizarCarne(Carne carne);
	void borrarCarnePorId(Integer id);
}
