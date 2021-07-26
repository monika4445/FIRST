package hotel.entity;

import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderType;
    private Integer orderTypeId;
    private Integer userId;
    private String name;

    private String phone;

    private Integer roomTypeId;

    private String roomType;

    private Date orderDate;

    private Integer orderDays;

    private Integer orderStatus;

    private Double orderCost;

    private Date createTime;

    private Date updateTime;

    public Order(Integer orderId, String orderType, Integer orderTypeId, Integer userId, String name, String phone,
                 Integer roomTypeId, String roomType, Date orderDate, Integer orderDays, Integer orderStatus, Double orderCost) {
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(Integer orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
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

    public Integer getOrderDays() {
        return orderDays;
    }

    public void setOrderDays(Integer orderDays) {
        this.orderDays = orderDays;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(Double orderCost) {
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
