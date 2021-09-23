package com.sb.docker.app.controller;

import com.sb.docker.app.dao.Order;
import com.sb.docker.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/")
    public String greet(){
        return "Hello My Dear...!";
    }

    @GetMapping(value = "/order/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping(value = "/order/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Order getAllOrders(@PathVariable int id){
        return orderService.findOrderById(id);
    }

}
