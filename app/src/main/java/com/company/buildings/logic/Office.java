package com.company.buildings.logic;

import java.util.Objects;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mParkingSpaces = 0;
        this.mBusinessName = null;
        sTotalOffices += 1; // sTotalOffices = sTotalOffices + 1; sTotalOffices++; ++sTotalOffices
    }

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth, String mBusinessName) {
        this(mLength, mWidth, mLotLength, mLotWidth);
        this.mBusinessName = mBusinessName;
    }

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth, String mBusinessName, int mParkingSpaces) {
        this(mLength, mWidth, mLotLength, mLotWidth, mBusinessName);
        this.mParkingSpaces = mParkingSpaces;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    @Override
    public String toString() {
        String occup = "unoccupied";
        String parking = "";
        if (getParkingSpaces()>0){
            parking = "; has "+getParkingSpaces()+" parking spaces";
        }
        if (!"".equals(getBusinessName()) && getBusinessName() != null){
            occup = getBusinessName();
        }
        return "Business: " + occup+parking+" (total offices: "+sTotalOffices+")";
    }

    @Override
    public boolean equals(Object o) {
        Office office = (Office) o;
        if ((this.getLength()*this.getWidth()) == (office.getLength()* office.getWidth()) && this.getParkingSpaces() == office.getParkingSpaces()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(mBusinessName, mParkingSpaces);
    }

    // TODO - Put your code here.

}