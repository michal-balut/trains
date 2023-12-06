package pl.training.payments.domain;

import lombok.Value;

import java.util.List;

@Value
public class Order {

    Long id;
	String email;
	String status;
	String routeId;
	int value;

}
