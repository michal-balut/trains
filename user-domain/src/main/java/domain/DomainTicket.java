package domain;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class DomainTicket {

	String id;
	String routeId;
	String email;

}
