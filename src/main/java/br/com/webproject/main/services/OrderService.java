package br.com.webproject.main.services;

import br.com.webproject.main.entities.Order;
import br.com.webproject.main.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository order;

    public List<Order> findAll(){
        return order.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj =  order.findById(id);
        return obj.get();
    }
}
