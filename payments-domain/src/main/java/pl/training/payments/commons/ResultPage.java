package pl.training.payments.commons;

import java.util.List;

import lombok.Value;

@Value
public class ResultPage<T> {

    List<T> data;
    int pageNumber;
    long totalPages;

}
