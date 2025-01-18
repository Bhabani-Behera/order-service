package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderDao {
    public List<Order> getOrders() {


        List<Order> list = new ArrayList<Order>();

        list.add(new Order(101, "mobile", 1, 30000));
        list.add(new Order(58, "book", 4, 2000));
        list.add(new Order(102, "mobile1", 1, 50000));
        list.add(new Order(103, "book1", 4, 4000));
return list;
    }

}
