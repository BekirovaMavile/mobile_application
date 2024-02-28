package com.company.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {
    public int dimension;
    private boolean mSecondFloor;
//    public Cottage(int dimension, int lotLength, int lotWidth) {
//        super(dimension, dimension, lotLength, lotWidth);
//
//    }

    public Cottage( int dimension, int lotLength, int lotWidth, String owner, boolean mSecondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner);
        this.mSecondFloor = mSecondFloor;
    }

    public boolean hasSecondFloor(){
        return mSecondFloor;
    }

    @Override
    public String toString() {
        String area = "";
        String pool = "";
        String owner = "n/a";
        String stories = "; is a cottage";
        if (hasSecondFloor()){
            stories = "; is a two story cottage";
        }
        if (hasArea()){
            area = "; has a big open space";
        }
        if (hasPool()){
            pool = "; has a pool";
        }
        if (getOwner().equals("")){
            owner = getOwner();
        }
        return "Owner: " +owner+ pool + area + stories;
    }

    // TODO - Put your code here.

}