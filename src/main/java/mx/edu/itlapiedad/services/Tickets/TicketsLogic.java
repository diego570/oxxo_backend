package mx.edu.itlapiedad.services.Tickets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mx.edu.itlapiedad.dao.Tickets.TicketsDAO;
import mx.edu.itlapiedad.models.Tickets;

@Service


public class TicketsLogic implements TicketsService{
	@Autowired
	TicketsDAO repositorios;
	
	
	@Override
	public Tickets buscar(int id) {
		return repositorios.buscar(id);
	}

	@Override
	public Tickets insertar(Tickets tickets) {
		return repositorios.insertar(tickets);
	}

	@Override
	public List<Tickets> consultarTickets() {
		return repositorios.consultarTickets();
	}

	@Override
	public void actualizar(Tickets tickets) {
		 repositorios.actualizar(tickets);
		
	}

	@Override
	public void eliminar(int id) {
		repositorios.eliminar(id);
		
	}

}
