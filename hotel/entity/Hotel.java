package hotel.entity;

import java.util.Date;

public class Hotel {
    public int hotelId;

    public String hotelName;

    public String phone;

    public String email;

    public String address;

    public String website;

    public Date createTime;

    public Date updateTime;
    public int starCount;
    public String Owner;

    public Hotel() {
    }


    public Hotel(int hotelId, String hotelName, String phone, String email, String address, String website,
                 int starCount, String owner) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.website = website;
        this.starCount = starCount;
        this.Owner = owner;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", starCount=" + starCount +
                ", Owner='" + Owner + '\'' +
                '}';
    }
}
