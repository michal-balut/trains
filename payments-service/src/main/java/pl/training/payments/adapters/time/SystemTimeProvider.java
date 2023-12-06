package pl.training.payments.adapters.time;

import java.time.Instant;

import org.springframework.stereotype.Component;

import pl.training.payments.ports.TimeProvider;

@Component
public class SystemTimeProvider implements TimeProvider {

    @Override
    public Instant getTimestamp() {
        return Instant.now();
    }

}
