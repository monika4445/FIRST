package hotel.entity;

import java.util.Date;

public class CheckIn extends Order {

    public CheckIn(Integer orderId, String orderType, Integer orderTypeId, Integer userId,
                   String name, String phone, Integer roomTypeId, String roomType, Date orderDate, Integer orderDays,
                   Integer orderStatus, Double orderCost) {
        super(orderId, orderType, orderTypeId, userId, name, phone, roomTypeId, roomType, orderDate, orderDays,
                orderStatus, orderCost);
    }

    private Integer checkInId;
    private Integer roomId;

    private String roomNumber;
    private String persons;

    private String ids;

    private Date checkInTime;

    private Date checkOutTime;

    private Date createTime;

    private Date updateTime;

    public CheckIn(Integer orderId, String orderType, Integer orderTypeId, Integer userId, String name,
                   String phone, Integer roomTypeId, String roomType, Date orderDate, Integer orderDays,
                   Integer orderStatus, Double orderCost, Integer checkInId, Integer roomId, String roomNumber,
                   String persons, String ids,
                   Date checkInTime, Date checkOutTime, Date createTime, Date updateTime) {
        super(orderId, orderType, orderTypeId, userId, name, phone, roomTypeId, roomType, orderDate,
                orderDays, orderStatus, orderCost);
        this.checkInId = checkInId;
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.persons = persons;
        this.ids = ids;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(Integer checkInId) {
        this.checkInId = checkInId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getPersons() {
        return persons;
    }

    public void setPersons(String persons) {
        this.persons = persons;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "CheckIn{" +
                "checkInId=" + checkInId +
                ", roomId=" + roomId +
                ", roomNumber='" + roomNumber + '\'' +
                ", persons='" + persons + '\'' +
                ", ids='" + ids + '\'' +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
