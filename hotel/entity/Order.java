package hotel.entity;

import java.util.Date;

public class Order {
    private int orderId;
    private String orderType;
    private int orderTypeId;
    private int userId;
    private String name;

    private int phone;

    private int roomTypeId;

    private String roomType;

    private Date orderDate;

    private int orderDays;

    private int orderStatus;

    private double orderCost;

    private Date createTime;

    private Date updateTime;

    public Order(int orderId, String orderType, int orderTypeId, int userId, String name, int phone,
                 int roomTypeId, String roomType, Date orderDate, int orderDays, int orderStatus, double orderCost) {
        this.orderId = orderId;
        this.orderType = orderType;
        this.orderTypeId = orderTypeId;
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.roomTypeId = roomTypeId;
        this.roomType = roomType;
        this.orderDate = orderDate;
        this.orderDays = orderDays;
        this.orderStatus = orderStatus;
        this.orderCost = orderCost;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(int orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderDays() {
        return orderDays;
    }

    public void setOrderDays(int orderDays) {
        this.orderDays = orderDays;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderType='" + orderType + '\'' +
                ", orderTypeId=" + orderTypeId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", roomTypeId=" + roomTypeId +
                ", roomType='" + roomType + '\'' +
                ", orderDate=" + orderDate +
                ", orderDays=" + orderDays +
                ", orderStatus=" + orderStatus +
                ", orderCost=" + orderCost +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
