package com.company.buildings.logic;

import java.util.Objects;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
    private String mOwner;
    private boolean mPool;


    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
    }

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    @Override
    public String toString() {
        String area = "";
        String pool = "";
        String owner = "n/a";
        if (hasArea()){
            area = "; has a big open space";
        }
        if (hasPool()){
            pool = "; has a pool";
        }
        if (!getOwner().equals("")){
            owner = getOwner();
        }
        return "Owner: " + owner + pool+ area;

    }

    @Override
    public boolean equals(Object o) {
        House house = (House) o;
        if ((this.getLength()*this.getWidth()) == (house.getLength()* house.getWidth()) && this.hasPool() == house.hasPool()){
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(mOwner, mPool);
    }
    // TODO - Put your code here.

    public boolean hasArea(){
        if (calcBuildingArea()<calcLotArea()){
            return true;
        }
        else{
            return false;
        }
    }

}