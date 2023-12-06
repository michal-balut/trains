package pl.training.irregularities.domain;

import lombok.Data;

@Data
public class IrregRequest {

	private String externalId;

	private String origin;

	private String destination;

	/**
	 * Departure local timestamp
	 */
	private long departureTimestamp;

	//String timezoneCode;

	/**
	 * Delay in miliseconds
	 */
	private long milisDelay;

}
