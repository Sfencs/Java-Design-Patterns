package com.sfencs.dp.prototypepattern;

public class PrototypeClass implements Cloneable{

    @Override
    public PrototypeClass clone(){
        PrototypeClass prototypeClass = null;
        try{
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
