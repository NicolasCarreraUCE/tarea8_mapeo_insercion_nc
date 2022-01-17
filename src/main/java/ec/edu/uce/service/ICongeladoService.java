package ec.edu.uce.service;

import ec.edu.uce.modelo.Congelado;

public interface ICongeladoService {
	void insertarNuevoCongelado(Congelado congelado);
	Congelado buscarCongeladoPorId(Integer id);
	void actualizarCongelado(Congelado congelado);
	void borrarCongeladoPorId(Integer id);
}
