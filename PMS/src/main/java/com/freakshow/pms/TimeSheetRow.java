package com.freakshow.pms;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name="timesheetRow")
@IdClass(TimeSheetRowPK.class)
public class TimeSheetRow implements Serializable{
    
    @Id
	private int proj_ID;
    
    @Id  
    private int emp_ID;
    
    @Id
	private String wp_ID;
    
	@Id
	private Date week_end_day;
	private int mon;
	private int fri;
	
	public TimeSheetRow(){
	}
//    public TimeSheetRow(int proj_ID, int emp_ID, String wp_ID, Date week_end_day){
//        this.emp_ID = emp_ID;
//        this.proj_ID = proj_ID;
//        this.wp_ID = wp_ID;
//        this.week_end_day = week_end_day;
//    }	
    public int getProj_ID() {
        return proj_ID;
    }

    public void setProj_ID(int proj_ID) {
        this.proj_ID = proj_ID;
    }

    public String getWp_ID() {
        return wp_ID;
    }

    public void setWp_ID(String wp_ID) {
        this.wp_ID = wp_ID;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getFri() {
        return fri;
    }

    public void setFri(int fri) {
        this.fri = fri;
    }

    public int getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public Date getWeek_end_day() {
        return week_end_day;
    }

    public void setWeek_end_day(Date week_end_day) {
        this.week_end_day = week_end_day;
    }

}
