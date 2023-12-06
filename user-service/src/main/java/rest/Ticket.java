package rest;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Ticket {

	String id;
	String routeId;
	String email;

}
