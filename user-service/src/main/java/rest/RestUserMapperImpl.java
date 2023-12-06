package rest;

import java.util.ArrayList;
import java.util.List;

import domain.DomainTicket;
import domain.UserHistory;

public class RestUserMapperImpl implements RestUserMapper{

	@Override
	public UserDto toDto(final UserHistory userHistory) {
		if ( userHistory == null ) {
			return null;
		}

		UserDto userDto = new UserDto();
		List<Ticket> tickets = new ArrayList<>();

		for(DomainTicket domainTicket : userHistory.getHistory()) {
			Ticket ticket = new Ticket(domainTicket.getId(), domainTicket.getRouteId(), domainTicket.getEmail());
			tickets.add(ticket);
		}

		userDto.setTickets(tickets);
		return userDto;
	}
}
