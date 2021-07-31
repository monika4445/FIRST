package hotel.entity;

import java.util.Date;

public class Room {
    private int roomId;

    private int roomNumber;

    private int typeId;

    private String roomType;

    private double roomPrice;

    private int numberOfPerson;

    private double roomDiscount;

    private int roomStatus;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Room(Integer numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public Room(int roomId, int roomNumber, int typeId, String roomType, double roomPrice,
                Double roomDiscount, int roomStatus, String remark) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.typeId = typeId;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomDiscount = roomDiscount;
        this.roomStatus = roomStatus;
        this.remark = remark;
    }

    public Room() {
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

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public Integer getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(Integer numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Double getRoomDiscount() {
        return roomDiscount;
    }

    public void setRoomDiscount(Double roomDiscount) {
        this.roomDiscount = roomDiscount;
    }

    public int getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(int roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "Room{" +
                "roomId=" + roomId +
                ", roomNumber='" + roomNumber + '\'' +
                ", typeId=" + typeId +
                ", roomType='" + roomType + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomDiscount=" + roomDiscount +
                ", roomStatus=" + roomStatus +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
               " }";
    }


}
