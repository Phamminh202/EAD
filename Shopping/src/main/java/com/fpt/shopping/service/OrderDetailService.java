package com.fpt.shopping.service;

import com.fpt.shopping.entity.OrderDetail;
import com.fpt.shopping.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public Iterable<OrderDetail> findAll(){
        return orderDetailRepository.findAll();
    }

    public Optional<OrderDetail> findById(Integer id){
        return orderDetailRepository.findById(id);
    }

    public OrderDetail save(OrderDetail orderDetail){
        return orderDetailRepository.save(orderDetail);
    }
}
