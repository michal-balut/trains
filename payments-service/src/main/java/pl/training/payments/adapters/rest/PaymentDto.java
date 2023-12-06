package pl.training.payments.adapters.rest;

import java.time.Instant;

import lombok.Data;

@Data
public class PaymentDto {

    String id;
    String value;
    Instant timestamp;
    String status;

}
