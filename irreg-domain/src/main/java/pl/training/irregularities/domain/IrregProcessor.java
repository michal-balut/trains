package pl.training.irregularities.domain;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import pl.training.irregularities.commons.Atomic;
import pl.training.irregularities.ports.EventEmitter;
import pl.training.irregularities.ports.IrregService;

@Atomic
@Log
@RequiredArgsConstructor
public class IrregProcessor implements IrregService {

	private static final String ID = "1";

	private final Map<String, Irregularity> inMemoryDB = Collections.singletonMap(ID,
			new Irregularity("1", "GDA", "WAW", LocalDateTime.of(2023, 12, 7, 12, 0).toEpochSecond(ZoneOffset.UTC), 10));

	private final EventEmitter eventEmitter;

	@Override
	public Irregularity process(final Irregularity irregularity) {
		final Irregularity savedIrreg = inMemoryDB.get(ID);
		log.info("Irregularity saved " + savedIrreg);
		eventEmitter.emit(mapToEvent(savedIrreg));
		return savedIrreg;
	}

	@Override
	public List<Irregularity> findAll() {
		return inMemoryDB.values().stream().toList();
	}

	private static IrregEvent mapToEvent(final Irregularity irregularity) {
		return new IrregEvent(irregularity.getOrigin(), irregularity.getDestination(), irregularity.getDepartureTimestamp(), irregularity.getDelay());
	}
}
