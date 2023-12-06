package pl.training.irregularities.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IrregEvent {

	private String origin;

	private String destination;

	/**
	 * Departure local timestamp
	 */
	private long departureTimestamp;

	//String timezoneCode;

	/**
	 * Delay in minutes
	 */
	private long delay;

}
