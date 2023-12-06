package pl.training.irregularities.ports;

import pl.training.irregularities.domain.IrregEvent;

public interface EventEmitter {

    void emit(IrregEvent event);

}
