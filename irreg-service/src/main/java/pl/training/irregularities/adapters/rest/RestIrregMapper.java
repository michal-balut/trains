package pl.training.irregularities.adapters.rest;

import java.util.List;

import org.mapstruct.Mapper;

import pl.training.irregularities.domain.Irregularity;

@Mapper(componentModel = "spring")
public interface RestIrregMapper {

	Irregularity toDomain(IrregRequestDto irregRequestDto);

	IrregularityDto toDto(Irregularity irregularity);

	List<IrregularityDto> toDto(List<Irregularity> irregularities);

}
