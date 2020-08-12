package com.ordersproject.demo.services;

import com.ordersproject.demo.models.Order;

public interface OrderServices {

    Order findOrderById(long id);

    void delete(long id);

    Order save(Order order);
}
