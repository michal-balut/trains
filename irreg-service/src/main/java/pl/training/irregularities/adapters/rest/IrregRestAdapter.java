package pl.training.irregularities.adapters.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import pl.training.irregularities.commons.web.LocationUri;
import pl.training.irregularities.ports.IrregService;

@RequestMapping("irregularities")
@RestController
@RequiredArgsConstructor
public class IrregRestAdapter {

	private final IrregService irregService;

	private final RestIrregMapper mapper;

	@PostMapping
	public ResponseEntity<IrregularityDto> process(@RequestBody @Valid final IrregRequestDto irregRequestDto) {
		final var irregularity = mapper.toDomain(irregRequestDto);
		final var savedIrreg = irregService.process(irregularity);
		final var irregDto = mapper.toDto(savedIrreg);
		final var locationUri = LocationUri.fromRequest(irregDto.getExternalId());
		return ResponseEntity.created(locationUri)
				.body(irregDto);
	}

	@GetMapping
	public ResponseEntity<List<IrregularityDto>> getAll() {
		var irregularities = irregService.findAll();
		var irregularityDtos = mapper.toDto(irregularities);
		return ResponseEntity.ok(irregularityDtos);
	}

}
