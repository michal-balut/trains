package pl.training.irregularities.adapters.events;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import pl.training.irregularities.domain.IrregEvent;
import pl.training.irregularities.ports.EventEmitter;

@Component
@RequiredArgsConstructor
public class StreamEventEmitter implements EventEmitter {

    private static final String IRREG_BINDING_NAME = "irregularities-out-0";

    private final StreamBridge streamBridge;
    private final IrregEventMapper mapper;

    @Override
    public void emit(IrregEvent event) {
        var irregEventDto = mapper.toDto(event);
        streamBridge.send(IRREG_BINDING_NAME, irregEventDto);
    }

}
