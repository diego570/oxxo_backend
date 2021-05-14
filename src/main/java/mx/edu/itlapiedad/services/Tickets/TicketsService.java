package mx.edu.itlapiedad.services.Tickets;

import java.util.List;

import mx.edu.itlapiedad.models.Tickets;

public interface TicketsService {

	Tickets buscar(int id);

	Tickets insertar(Tickets tickets);

	List<Tickets> consultarTickets();

	void actualizar(Tickets tickets);

	void eliminar(int id);

}
