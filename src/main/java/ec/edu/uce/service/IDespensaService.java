package ec.edu.uce.service;

import ec.edu.uce.modelo.Despensa;

public interface IDespensaService {
	void insertarNuevoDespensa(Despensa despensa);
	Despensa buscarDespensaPorId(Integer id);
	void actualizarDespensa(Despensa despensa);
	void borrarDespensaPorId(Integer id);
}
