package com.sb.docker.app.service;

import com.sb.docker.app.dao.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> allOrders;

    public List<Order> getAllOrders(){
        allOrders = populateOrdersList();
        return allOrders;
    }

    public Order findOrderById(int orderId){
        allOrders = populateOrdersList();
        Order ord = allOrders.stream().filter(n->n.getOrderId()==orderId).findFirst().orElse(null);
        return ord;
    }

    private List<Order> populateOrdersList(){
        List<Order> listOrder = new ArrayList<Order>();
        listOrder.add(new Order(100L,2030.40));
        listOrder.add(new Order(200L,100.40));
        listOrder.add(new Order(300L,700.00));
        listOrder.add(new Order(400L,1340.70));
        listOrder.add(new Order(500L,10000.40));
        listOrder.add(new Order(600L,5400.80));

        return listOrder;
    }
}
