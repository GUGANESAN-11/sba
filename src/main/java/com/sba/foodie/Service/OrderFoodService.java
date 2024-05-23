package com.sba.foodie.Service;



import com.sba.foodie.Entity.OrderFood;
import com.sba.foodie.Repository.OrderFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderFoodService {

    @Autowired
    private OrderFoodRepository repository;

    public List<OrderFood> getAllOrders() {
        return repository.findAll();
    }

    public Optional<OrderFood> getOrderById(Integer id) {
        return repository.findById(id);
    }

    public OrderFood saveOrder(OrderFood order) {
        return repository.save(order);
    }

    public void deleteOrderById(Integer id) {
        repository.deleteById(id);
    }

    public OrderFood updateOrder(OrderFood order) {
        return repository.save(order);
    }
}
