package hotel.human;

import java.util.Date;

public class User extends Human{

    private int idcard;

    private Date createTime;

    private Date updateTime;

    public User(int idcard,
                  Date createTime, Date updateTime) {
        this.idcard = idcard;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }


    public int getIdcard() {
        return idcard;
    }

    public void setIdcard(int idcard) {
        this.idcard = idcard;
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
        return "User{" +
                ", idcard='" + idcard + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
