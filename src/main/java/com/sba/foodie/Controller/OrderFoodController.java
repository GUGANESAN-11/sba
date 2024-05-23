package com.sba.foodie.Controller;
import com.sba.foodie.Entity.OrderFood;
import com.sba.foodie.Service.OrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/food")
public class OrderFoodController {

    @Autowired		
    private OrderFoodService service;

    @GetMapping("/getOrder")
    public List<OrderFood> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/getOrderById/{id}")
    public ResponseEntity<OrderFood> getOrderById(@PathVariable Integer id) {
        Optional<OrderFood> order = service.getOrderById(id);
        if (order.isPresent()) {
            return ResponseEntity.ok(order.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/updateOrder")
    public OrderFood createOrder(@RequestBody OrderFood order) {
        return service.saveOrder(order);
    }

    @PutMapping("/updateOrder/{id}")
    public ResponseEntity<OrderFood> updateOrder(@PathVariable Integer id, @RequestBody OrderFood orderDetails) {
        Optional<OrderFood> order = service.getOrderById(id);
        if (order.isPresent()) {
            orderDetails.setId(id);
            return ResponseEntity.ok(service.updateOrder(orderDetails));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteOrder/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Integer id) {
        Optional<OrderFood> order = service.getOrderById(id);
        if (order.isPresent()) {
            service.deleteOrderById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
