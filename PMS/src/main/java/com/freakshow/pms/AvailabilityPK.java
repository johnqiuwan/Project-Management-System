package com.freakshow.pms;

import java.io.Serializable;

public class AvailabilityPK implements Serializable {
    private int emp_ID;
    private int proj_ID;
    
    public int getEmp_ID() {
        return emp_ID;
    }
    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }
    public int getProj_ID() {
        return proj_ID;
    }
    public void setProj_ID(int proj_ID) {
        this.proj_ID = proj_ID;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + emp_ID;
        result = prime * result + proj_ID;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AvailabilityPK other = (AvailabilityPK) obj;
        if (emp_ID != other.emp_ID)
            return false;
        if (proj_ID != other.proj_ID)
            return false;
        return true;
    }
    
}


