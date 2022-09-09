package org.example;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name="emp1")
public class emp {

    private int empno;
    private String ename;
    private String job;
    private int mgr;
    @Temporal(TemporalType.DATE)
    private Date Hiredate;
    private int sal;
    private int comm;

    @Id
    @PrimaryKeyJoinColumn
    private int deptno;


  @OneToOne(targetEntity=dept.class,cascade =CascadeType.ALL)
      private dept dep;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return Hiredate;
    }

    public void setHiredate(Date hiredate) {
        Hiredate = hiredate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", Hiredate=" + Hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
