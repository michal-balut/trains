package pl.training.payments.domain;

import org.javamoney.moneta.Money;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PercentagePaymentFeeCalculator implements PaymentFeeCalculator {

    private final double percentage;

    @Override
    public Money calculateFee(Money paymentValue) {
        return paymentValue.multiply(percentage);
    }

}
