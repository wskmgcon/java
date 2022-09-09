package org.example;

import javax.persistence.*;

@Entity
@Table(name="dept1")
public class dept {
    @Id
    private int deptno;
    private String dname;
    private String Loc;


    @OneToOne(targetEntity =emp.class)
    private  emp e1;


    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    @Override
    public String toString() {
        return "dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", Loc='" + Loc + '\'' +
                '}';
    }
}
