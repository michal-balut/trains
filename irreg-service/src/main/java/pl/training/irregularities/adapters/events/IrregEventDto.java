package pl.training.irregularities.adapters.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IrregEventDto {

	private String origin;

	private String destination;

	/**
	 * Departure local timestamp
	 */
	private long departureTimestamp;

	/**
	 * Delay in minutes
	 */
	private long delay;

}
