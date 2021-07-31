package hotel.human;

import java.util.Date;

public class Worker extends Human {

    private String role;

    private int department;

    private Date createTime;

    private Date updateTime;

    public Worker(String role, int department,
                  Date createTime, Date updateTime) {
        this.role = role;
        this.department = department;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
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
        return "Worker{" +
                ", role='" + role + '\'' +
                ", department=" + department +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
