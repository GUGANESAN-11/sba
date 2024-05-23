package com.sba.foodie.Repository;
import com.sba.foodie.Entity.OrderFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderFoodRepository extends JpaRepository<OrderFood, Integer> {
}
