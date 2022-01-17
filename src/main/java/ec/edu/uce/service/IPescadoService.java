package ec.edu.uce.service;

import ec.edu.uce.modelo.Pescado;

public interface IPescadoService {
	void insertarNuevoPescado(Pescado pescado);
	Pescado buscarPescadoPorId(Integer id);
	void actualizarPescado(Pescado pescado);
	void borrarPescadoPorId(Integer id);
}
