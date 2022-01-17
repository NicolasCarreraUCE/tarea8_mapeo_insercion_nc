package ec.edu.uce.repository;

import ec.edu.uce.modelo.Bebida;

public interface IBebidaRepo {
	void insertarBebida(Bebida bebida);
	Bebida buscarBebida(Integer id);
	void actualizarBebida(Bebida bebida);
	void borrarBebida(Integer id);
}
