package pl.training.irregularities.ports;

import java.util.List;
import java.util.Optional;

import pl.training.irregularities.domain.Irregularity;

public interface IrregService {

	Irregularity process(Irregularity irregularity);

	List<Irregularity> findAll();

}
