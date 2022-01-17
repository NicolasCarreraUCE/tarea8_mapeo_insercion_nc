package ec.edu.uce.service;

import ec.edu.uce.modelo.Bebida;

public interface IBebidaService {
	void insertarNuevoBebida(Bebida bebida);
	Bebida buscarBebidaPorId(Integer id);
	void actualizarBebida(Bebida bebida);
	void borrarBebidaPorId(Integer id);
}
