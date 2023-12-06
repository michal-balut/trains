package pl.training.payments.adapters.rest;

import pl.training.payments.domain.Order;

public interface ShopMapper {

    Order toDomain(OrderDto orderDto);

}
