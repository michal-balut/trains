package pl.training.payments.ports;

import java.util.Optional;

import pl.training.payments.commons.Page;
import pl.training.payments.commons.ResultPage;
import pl.training.payments.domain.Payment;
import pl.training.payments.domain.PaymentStatus;

public interface PaymentRepository {

    Payment save(Payment payment);

    Optional<Payment> getById(String id);

    ResultPage<Payment> getByStatus(PaymentStatus paymentStatus, Page page);

}
