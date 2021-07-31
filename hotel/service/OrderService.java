package hotel.service;

import hotel.entity.Order;

public interface OrderService {
    int insert(Order order);

    int addOrder(Order order);

    int delete(Integer orderId);

    Order selectById(Integer orderId);

    Order selectByNameAndPhone(String name, String phone);

    int update(Order record);

    int payOrder(int orderId);

    int cancelOrder(int orderId);

    Integer getOrderCount();
}
