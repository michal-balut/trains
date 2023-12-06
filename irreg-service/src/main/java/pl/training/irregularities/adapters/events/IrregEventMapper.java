package pl.training.irregularities.adapters.events;

import org.mapstruct.Mapper;
import pl.training.irregularities.domain.IrregEvent;

@Mapper(componentModel = "spring")
public interface IrregEventMapper {

	IrregEventDto toDto(IrregEvent event);

}
