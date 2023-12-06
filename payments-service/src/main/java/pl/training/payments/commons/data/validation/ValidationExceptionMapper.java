package pl.training.payments.commons.data.validation;

import static java.util.stream.Collectors.joining;

import org.mapstruct.Mapper;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Mapper(componentModel = "spring")
public interface ValidationExceptionMapper {

    String KEY_VALUE_SEPARATOR = " ";
    String DELIMITER = ", ";

    default String getValidationErrors(MethodArgumentNotValidException methodArgumentNotValidException) {
        return methodArgumentNotValidException.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(fieldError -> fieldError.getField() + KEY_VALUE_SEPARATOR + fieldError.getDefaultMessage())
                .collect(joining(DELIMITER));
    }

}
