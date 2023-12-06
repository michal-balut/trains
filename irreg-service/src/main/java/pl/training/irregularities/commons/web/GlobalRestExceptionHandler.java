package pl.training.irregularities.commons.web;

import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@ControllerAdvice(annotations = RestController.class)
@RequiredArgsConstructor
public class GlobalRestExceptionHandler {

	private final RestExceptionResponseBuilder responseBuilder;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDto> onException(final Exception exception, final Locale locale) {
		log.warning("Exception: " + exception.getClass().getName());
		return responseBuilder.build(exception, HttpStatus.INTERNAL_SERVER_ERROR, locale);
	}

}
