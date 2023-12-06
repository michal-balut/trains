package pl.training.payments.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import pl.training.payments.ports.PaymentsService;
import pl.training.payments.ports.ShopService;

@Log
@RequiredArgsConstructor
public class OrderProcessor implements ShopService {

    private static final String DEFAULT_CURRENCY = "PLN";

    private final PaymentsService paymentsService;

    @Override
    public void place(Order order) {
        log.info("New order with total value: %d %s".formatted(order.getValue(), DEFAULT_CURRENCY));
        var paymentStatus = paymentsService.pay(order.getValue(), DEFAULT_CURRENCY);
        log.info("Order payment status: " + paymentStatus);
    }

}
