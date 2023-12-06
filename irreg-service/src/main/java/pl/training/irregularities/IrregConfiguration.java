package pl.training.irregularities;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import pl.training.irregularities.domain.IrregProcessor;
import pl.training.irregularities.ports.EventEmitter;
import pl.training.irregularities.ports.IrregService;

@EnableFeignClients
@Configuration
public class IrregConfiguration {

	@Bean
	public IrregService irregService(final EventEmitter eventEmitter) {
		return new IrregProcessor(eventEmitter);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
