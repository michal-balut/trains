package pl.training.payments.adapters.rest;

import pl.training.payments.domain.Order;

public interface RestShopMapper {

    Order toDomain(OrderDto orderDto);

}
