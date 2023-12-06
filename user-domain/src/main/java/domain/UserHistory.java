package domain;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UserHistory {

	List<DomainTicket> history;

}
