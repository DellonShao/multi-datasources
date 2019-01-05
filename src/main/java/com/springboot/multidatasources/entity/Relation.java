package com.springboot.multidatasources.entity;

public class Relation {

    private Integer rId;
    private String rFrom = "";
    private String rTo = "";
    private double rRawPosibility;
    private double rPosibility;

    public Relation() {
    }
    public Relation(Integer rId, String rFrom, String rTo, double rRawPosibility, double rPosibility) {
        this.rId = rId;
        this.rFrom = rFrom;
        this.rTo = rTo;
        this.rRawPosibility = rRawPosibility;
        this.rPosibility = rPosibility;
    }
    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrFrom() {
        return rFrom;
    }

    public void setrFrom(String rFrom) {
        this.rFrom = rFrom;
    }

    public String getrTo() {
        return rTo;
    }

    public void setrTo(String rTo) {
        this.rTo = rTo;
    }

    public double getrRawPosibility() {
        return rRawPosibility;
    }

    public void setrRawPosibility(double rRawPosibility) {
        this.rRawPosibility = rRawPosibility;
    }

    public double getrPosibility() {
        return rPosibility;
    }

    public void setrPosibility(double rPosibility) {
        this.rPosibility = rPosibility;
    }
}