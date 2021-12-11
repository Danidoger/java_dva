package com.company;

public class brokenLine {
    private segment segs[];
    brokenLine(segment[] args){
        this.segs = args;
    }
    public double Length() {
        double len  = 0;
        for (int j=0;j < segs.length ;j++) {
                len += segs[j].Length();
        }
        return len;
    }
}
