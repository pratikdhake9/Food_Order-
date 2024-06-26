package com.food_order.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Food food;
    private int quantity;
    private Long totalPrice;
    private List<String> ingredients;

}
