package pl.training.payments.commons.web;

import java.net.URI;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class LocationUri {

    public static final String SEGMENT_SEPARATOR = "/";

    private LocationUri() {}

    public static URI fromRequest(Object id) {
        return ServletUriComponentsBuilder.fromCurrentRequest()
                .path(SEGMENT_SEPARATOR + id)
                .build()
                .toUri();
    }

}
