package pl.training.payments.commons.web;

import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import pl.training.payments.commons.data.validation.ValidationExceptionMapper;

@Log
@ControllerAdvice(annotations = RestController.class)
@RequiredArgsConstructor
public class GlobalRestExceptionHandler {

    private final RestExceptionResponseBuilder responseBuilder;
    private final ValidationExceptionMapper mapper;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> onException(Exception exception, Locale locale) {
        log.warning("Exception: " + exception.getClass().getName());
        return responseBuilder.build(exception, HttpStatus.INTERNAL_SERVER_ERROR, locale);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDto> onMethodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException, Locale locale) {
        var validationErrors = mapper.getValidationErrors(methodArgumentNotValidException);
        var description = responseBuilder.getDescription(methodArgumentNotValidException, locale, validationErrors);
        return responseBuilder.build(description, HttpStatus.BAD_REQUEST);
    }

}
