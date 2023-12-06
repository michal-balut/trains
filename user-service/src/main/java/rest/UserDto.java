package rest;

import java.util.List;

import lombok.Data;

@Data
public class UserDto {

	List<Ticket> tickets;

}
