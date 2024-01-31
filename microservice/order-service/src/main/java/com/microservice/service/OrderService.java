package com.microservice.service;

import com.microservice.dto.OrderLineItemsDto;
import com.microservice.dto.OrderRequest;
import com.microservice.model.Order;
import com.microservice.model.OrderLineItems;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        orderRequest.getOrderLineItemsDto()
                .stream()
                .map(this::mapToDo)
                .toList();
    }

    private OrderLineItems mapToDo(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
}
