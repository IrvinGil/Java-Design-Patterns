package com.designpatterns.creational.builder.cdbuilderdemo;

public class CDBuilder {
    public CDType buildSonyCD(){
        CDType sonyCD =new CDType();
        sonyCD.addItem(new Sony());
        return sonyCD;
    }

    public CDType buildSamsungCD(){
        CDType samsungCD =new CDType();
        samsungCD.addItem(new Samsung());
        return samsungCD;
    }
}
