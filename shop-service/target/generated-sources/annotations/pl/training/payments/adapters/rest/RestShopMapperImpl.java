package pl.training.payments.adapters.rest;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.training.payments.domain.Order;
import pl.training.payments.domain.OrderEntry;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-06T09:23:45+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class RestShopMapperImpl implements RestShopMapper {

    @Override
    public Order toDomain(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }
        return new Order(orderDto.getId(), orderDto.email, orderDto.status, orderDto.routeId, orderDto.value);
    }

}
