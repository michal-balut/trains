package pl.training.payments.domain;

import java.time.Instant;

import org.javamoney.moneta.Money;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Payment {

    String id;
    Money value;
    Instant timestamp;
    PaymentStatus status;

}
