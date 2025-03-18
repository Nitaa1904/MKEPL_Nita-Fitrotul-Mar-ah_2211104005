package models;

import java.util.Date;

public class JobInfo {
    private float salary;
    private Department department;
    private Date joinDate;

    public JobInfo(float salary, Department department, Date joinDate) {
        this.salary = salary;
        this.department = department;
        this.joinDate = joinDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}

// Enum untuk Departemen
enum Department {
    HRD,
    IT,
    FINANCE
}

