package pl.training.payments.commons.web;

import java.time.Instant;

import lombok.Value;

@Value
public class ExceptionDto {

    Instant timestamp;
    String description;

}
