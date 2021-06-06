package mx.edu.itlapiedad.services.Tickets_renglones;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.itlapiedad.dao.Ticket_renglones.Ticket_renglonesDAO;
import mx.edu.itlapiedad.models.Ticket_renglones;
import mx.edu.itlapiedad.models.Ticket_renglones_importe;

@Service
public class Ticket_renglonesLogic implements Ticket_renglonesService {
	@Autowired
	Ticket_renglonesDAO repositorio;

	@Override
	public Ticket_renglones buscar(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscar(id);
	}

	@Override
	public Ticket_renglones insertar(Ticket_renglones ticket_renglones) {
		// TODO Auto-generated method stub
		return repositorio.insertar(ticket_renglones);
	}

	@Override
	public List<Ticket_renglones> consultarTicket_renglones() {
		// TODO Auto-generated method stub
		return repositorio.consultarTicket_renglones();
	}

	@Override
	public void actualizar(Ticket_renglones ticket_renglones) {
		// TODO Auto-generated method stub
repositorio.actualizar(ticket_renglones);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
repositorio.eliminar(id);
	}

	@Override
	public List<Ticket_renglones_importe> buscar_importe_cajero(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscar_importe_cajero(id);
	}

	@Override
	public List<Ticket_renglones_importe> buscar_importe_cajero_fecha(int id, Timestamp fecha_hora) {
		// TODO Auto-generated method stub
		return repositorio.buscar_importe_cajero_fecha(id,fecha_hora);
	}

	

	
}
