package com.sba.foodie.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_food")
public class OrderFood {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer order_id;
    private String item_name;
    private Integer item_price;
    private String hotel_name;
    private String location;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Integer getItem_price() {
		return item_price;
	}
	public void setItem_price(Integer item_price) {
		this.item_price = item_price;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public OrderFood(Integer id, Integer order_id, String item_name, Integer item_price, String hotel_name,
			String location) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.hotel_name = hotel_name;
		this.location = location;
	}
	
	public OrderFood() {
		super();
	}
	
	
    
    
    
    

}
