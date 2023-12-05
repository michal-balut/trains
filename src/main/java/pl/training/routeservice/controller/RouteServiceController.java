package pl.training.routeservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.training.routeservice.model.RouteDto;

@RestController
public class RouteServiceController {

	private final RouteDto MOCKED_ROUTE = createMockedRouteDto();

	@GetMapping("routes")
	public ResponseEntity<RouteDto> getRoutes() {
		return ResponseEntity.ok(MOCKED_ROUTE);
	}

	private RouteDto createMockedRouteDto() {
		return RouteDto.builder()
				.id("123")
				.origin("GDA")
				.destination("ZAK")
				.capacity(100)
				.classes(List.of("FIRST", "SECOND"))
				.build();
	}

}
