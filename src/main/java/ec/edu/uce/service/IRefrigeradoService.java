package ec.edu.uce.service;

import ec.edu.uce.modelo.Refrigerado;

public interface IRefrigeradoService {
	void insertarNuevoRefrigerado(Refrigerado refrigerado);
	Refrigerado buscarRefrigeradoPorId(Integer id);
	void actualizarRefrigerado(Refrigerado refrigerado);
	void borrarRefrigeradoPorId(Integer id);
}
