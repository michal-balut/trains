package pl.training.irregularities.commons.web;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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
