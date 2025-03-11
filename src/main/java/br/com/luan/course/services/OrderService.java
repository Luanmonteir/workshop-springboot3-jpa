package br.com.luan.course.services;

import br.com.luan.course.entities.Order;
import br.com.luan.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository Repository;

    public List<Order> findAll(){
        return Repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = Repository.findById(id);
        return obj.get();
    }
}
