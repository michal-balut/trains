package pl.training.payments.domain;

import org.javamoney.moneta.Money;

import lombok.Value;

@Value
public class PaymentRequest {

    Money value;

}
