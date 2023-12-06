package pl.training.irregularities.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class Irregularity {

	private final String externalId;

	private final String origin;

	private final String destination;

	/**
	 * Departure local timestamp
	 */
	private final long departureTimestamp;

	//String timezoneCode;

	/**
	 * Delay in minutes
	 */
	private final long delay;

}
