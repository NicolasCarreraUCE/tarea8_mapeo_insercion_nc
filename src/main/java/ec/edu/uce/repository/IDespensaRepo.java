package ec.edu.uce.repository;

import ec.edu.uce.modelo.Despensa;

public interface IDespensaRepo {
	void insertarDespensa(Despensa despensa);
	Despensa buscarDespensa(Integer id);
	void actualizarDespensa(Despensa despensa);
	void borrarDespensa(Integer id);
}
