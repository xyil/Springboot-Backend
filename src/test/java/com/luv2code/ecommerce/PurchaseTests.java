package com.luv2code.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.luv2code.ecommerce.dto.Purchase;
import com.luv2code.ecommerce.entity.Address;
import com.luv2code.ecommerce.entity.Customer;
import com.luv2code.ecommerce.entity.Order;
import com.luv2code.ecommerce.entity.OrderItem;

@SpringBootTest
public class PurchaseTests {
	
	
	@Test
	public void purchaseTest() {
		
		Purchase purchase = new Purchase();
		
		Purchase purchase2 = purchase;
		
		purchase.equals(purchase2);
		
		Address address = new Address();
		
		address.setZipCode("");
		address.setCity("");
		address.setCountry("");
		address.setId((long)1);
		address.setState("");
		address.setStreet("");
		
		Order order = new Order();
		
		Customer customer = new Customer();
		
		Set<OrderItem> orderItems = new HashSet<OrderItem>();
		
		Set<Order> orders = new HashSet<Order>();
		
		customer.setEmail("");
		customer.setFirstName("arnold");
		customer.setLastName("Pat");
		customer.setId((long)1);
		customer.setOrders(orders);

		
		purchase.setBillingAddress(address);
		purchase.setShippingAddress(address);
		purchase.setCustomer(customer);
		purchase.setOrder(order);
		purchase.setOrderItems(orderItems);
		
		assertEquals(address, purchase.getBillingAddress());
		assertEquals(address, purchase.getShippingAddress());
		assertEquals(customer, purchase.getCustomer());
		assertEquals(order, purchase.getOrder());
		assertEquals(orderItems, purchase.getOrderItems());
		
		
		
		System.out.println(purchase.toString());
		System.out.println(purchase.hashCode());
		
		

	}

}
