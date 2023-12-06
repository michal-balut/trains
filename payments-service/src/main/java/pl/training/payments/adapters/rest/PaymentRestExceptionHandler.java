package pl.training.payments.adapters.rest;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import java.util.Locale;

import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.RequiredArgsConstructor;
import pl.training.payments.commons.web.ExceptionDto;
import pl.training.payments.commons.web.RestExceptionResponseBuilder;
import pl.training.payments.domain.PaymentNotFoundException;

@Order(HIGHEST_PRECEDENCE)
@ControllerAdvice("pl.training.shop.payments.adapters.rest")
@RequiredArgsConstructor
public class PaymentRestExceptionHandler {

    private final RestExceptionResponseBuilder responseBuilder;

    @ExceptionHandler(PaymentNotFoundException.class)
    public ResponseEntity<ExceptionDto> onPaymentNotFoundException(PaymentNotFoundException paymentNotFoundException, Locale locale) {
        return responseBuilder.build(paymentNotFoundException, NOT_FOUND, locale);
    }

}
