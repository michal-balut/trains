package pl.training.routeservice.model;

import java.util.List;

import lombok.Builder;

@Builder
public class RouteDto {

	private final String id;
	private final String origin;
	private final String destination;
	private final List<String> classes;
	private final int capacity;

}
