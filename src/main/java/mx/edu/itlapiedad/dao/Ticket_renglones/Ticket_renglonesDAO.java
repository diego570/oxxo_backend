package mx.edu.itlapiedad.dao.Ticket_renglones;

import java.util.List;

import mx.edu.itlapiedad.models.Ticket_renglones;
import mx.edu.itlapiedad.models.Ticket_renglones_importe;

public interface Ticket_renglonesDAO {

	Ticket_renglones buscar(int id);

	Ticket_renglones insertar(Ticket_renglones ticket_renglones);

	List<Ticket_renglones> consultarTicket_renglones();

	void actualizar(Ticket_renglones ticket_renglones);

	void eliminar(int id);

	List<Ticket_renglones_importe> buscar_importe_cajero(int id);

}
