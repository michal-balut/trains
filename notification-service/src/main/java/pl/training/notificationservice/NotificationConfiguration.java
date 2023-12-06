package pl.training.notificationservice;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.java.Log;
import pl.training.notificationservice.adapters.events.PaymentEventDto;

@Configuration
@Log
public class NotificationConfiguration {

	@Bean
	public Consumer<PaymentEventDto> paymentEventsConsumer() {
		return event -> log.info("payment proceeded with id: %s and status: %s".formatted(event.getPaymentId(), event.getType()));
	}

}
