package ec.edu.uce.repository;

import ec.edu.uce.modelo.Congelado;

public interface ICongeladoRepo {
	void insertarCongelado(Congelado congelado);
	Congelado buscarCongelado(Integer id);
	void actualizarCongelado(Congelado congelado);
	void borrarCongelado(Integer id);
}
