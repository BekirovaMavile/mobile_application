package com.company.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    public Building(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        this.mLength = mLength;
        this.mWidth = mWidth;
        this.mLotLength = mLotLength;
        this.mLotWidth = mLotWidth;
    }

    public int getLength() {
        return mLength;
    }

    public void setLength(int mLength) {
        this.mLength = mLength;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    public int getLotLength() {
        return mLotLength;
    }

    public void setLotLength(int mLotLength) {
        this.mLotLength = mLotLength;
    }

    public int getLotWidth() {
        return mLotWidth;
    }

    public void setLotWidth(int mLotWidth) {
        this.mLotWidth = mLotWidth;
    }

    public int calcBuildingArea(){
        return getLength() * getWidth();
    }

    public int calcLotArea(){
        return getLotLength() * getLotWidth();
    }

    @Override
    public String toString() {
        return "Building{" +
                "mLength=" + mLength +
                ", mWidth=" + mWidth +
                ", mLotLength=" + mLotLength +
                ", mLotWidth=" + mLotWidth +
                '}';
    }
    // TODO - Put your code here.
}
