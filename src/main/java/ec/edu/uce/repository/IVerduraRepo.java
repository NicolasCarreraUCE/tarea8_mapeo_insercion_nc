package ec.edu.uce.repository;

import ec.edu.uce.modelo.Verdura;

public interface IVerduraRepo {
	void insertarVerdura(Verdura verdura);
	Verdura buscarVerdura(Integer id);
	void actualizarVerdura(Verdura verdura);
	void borrarVerdura(Integer id);
}
