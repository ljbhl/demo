package com.xxx.controller;

import com.xxx.request.OrderRequest;
import com.xxx.response.OrderResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private static Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
    @RequestMapping(name ="/order",method = RequestMethod.POST)
    public OrderResponse createOrder(@RequestBody OrderRequest request) {
        LOGGER.info("order request is {}",request);
        return new OrderResponse(true,"success");
    }
}
