package ec.edu.uce.repository;

import ec.edu.uce.modelo.Pescado;

public interface IPescadoRepo {
	void insertarPescado(Pescado pescado);
	Pescado buscarPescado(Integer id);
	void actualizarPescado(Pescado pescado);
	void borrarPescado(Integer id);
}
