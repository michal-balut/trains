package pl.training.payments.commons.web;

import java.util.List;

import lombok.Value;

@Value
public class ResultPageDto<T> {

    List<T> data;
    int pageNumber;
    long totalPages;

}
