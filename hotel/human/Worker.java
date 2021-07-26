package hotel.human;

import hotel.human.Human.Human;

import java.util.Date;

public class Worker extends Human {
    private Integer workerId;

    private String role;

    private String username;

    private String password;

    private Integer department;

    private Date createTime;

    private Date updateTime;

    public Worker(Integer workerId, String role, String username, String password, Integer department,
                  Date createTime, Date updateTime) {
        this.workerId = workerId;
        this.role = role;
        this.username = username;
        this.password = password;
        this.department = department;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
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
                "workerId=" + workerId +
                ", role='" + role + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", department=" + department +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
