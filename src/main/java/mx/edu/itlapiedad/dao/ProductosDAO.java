package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.Productos;

public interface ProductosDAO {

	List<Productos> consultarProductos();

	Productos buscar(int id);

	Productos insertar(Productos productos);

	void actualizar(Productos productos);

}
