package pl.training.irregularities.adapters.rest;

import lombok.Data;

@Data
public class IrregRequestDto {

	private String externalId;

    private String origin;

	private String destination;

	/**
	 * Departure local time in format YYYY-MM-DD_HH:mm
	 */
	private String departureLocalDateTime;

	/**
	 * Delay in minutes
	 */
	private long delay;

}
