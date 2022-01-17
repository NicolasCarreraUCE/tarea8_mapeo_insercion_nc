package ec.edu.uce.service;

import ec.edu.uce.modelo.Verdura;

public interface IVerduraService {
	void insertarNuevoVerdura(Verdura verdura);
	Verdura buscarVerduraPorId(Integer id);
	void actualizarVerdura(Verdura verdura);
	void borraVerdurarPorId(Integer id);
}
