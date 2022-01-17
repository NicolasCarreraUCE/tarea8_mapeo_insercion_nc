package ec.edu.uce.repository;

import ec.edu.uce.modelo.Refrigerado;

public interface IRefrigeradoRepo {
	void insertarRefrigerado(Refrigerado refrigerado);
	Refrigerado buscarRefrigerado(Integer id);
	void actualizarRefrigerado(Refrigerado refrigerado);
	void borrarRefrigerado(Integer id);
}
