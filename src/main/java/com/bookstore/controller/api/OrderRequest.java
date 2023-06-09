package com.bookstore.controller.api;
import java.util.List;
import com.bookstore.model.db.order.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Order order;
    private List<Order> orderList;
}


