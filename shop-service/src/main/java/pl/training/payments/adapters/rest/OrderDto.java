package pl.training.payments.adapters.rest;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {

	Long id;
	String email;
	String status;
	String routeId;
	int value;

}
