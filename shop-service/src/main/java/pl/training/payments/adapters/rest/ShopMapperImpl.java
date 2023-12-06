package pl.training.payments.adapters.rest;

import org.springframework.stereotype.Component;

import pl.training.payments.domain.Order;

@Component
public class ShopMapperImpl implements ShopMapper {

	@Override
	public Order toDomain(OrderDto orderDto) {
		if ( orderDto == null ) {
			return null;
		}
		return new Order(orderDto.getId(), orderDto.email, orderDto.status, orderDto.routeId, orderDto.value);
	}

}
