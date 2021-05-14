package mx.edu.itlapiedad.services.Tickets_renglones;

import java.util.List;

import mx.edu.itlapiedad.models.Ticket_renglones;

public interface Ticket_renglonesService {

	Ticket_renglones buscar(int id);

	Ticket_renglones insertar(Ticket_renglones ticket_renglones);

	List<Ticket_renglones> consultarTicket_renglones();

	void actualizar(Ticket_renglones ticket_renglones);

	void eliminar(int id);

	

}
