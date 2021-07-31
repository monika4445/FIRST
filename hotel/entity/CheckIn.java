package hotel.entity;

import java.util.Date;

public class CheckIn extends Order {

    public CheckIn(int orderId, String orderType, int orderTypeId, int userId,
                   String name, String phone, int roomTypeId, String roomType, Date orderDate, int orderDays,
                   int orderStatus, double orderCost) {
        super(orderId, orderType, orderTypeId, userId, name, phone, roomTypeId, roomType, orderDate, orderDays,
                orderStatus, orderCost);
    }

    private int checkInId;
    private int roomId;

    private int roomNumber;
    private String persons;

    private int ids;

    private Date checkInTime;

    private Date checkOutTime;

    private Date createTime;

    private Date updateTime;

    public CheckIn(int orderId, String orderType, int orderTypeId, int userId, String name,
                   String phone, int roomTypeId, String roomType, Date orderDate, int orderDays,
                   int orderStatus, double orderCost, int checkInId, int roomId, int roomNumber,
                   String persons, int ids, Date checkInTime, Date checkOutTime, Date createTime, Date updateTime) {
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

    public int getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(int checkInId) {
        this.checkInId = checkInId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getPersons() {
        return persons;
    }

    public void setPersons(String persons) {
        this.persons = persons;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
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
