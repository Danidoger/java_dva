package com.company;

public class Lesson2 {
    public static void main(String[] args) {
        Point a = new Point(11,4.5);
        Point b = new Point(1,2);
        segment hh = new segment(a,b);
        System.out.println(hh.Length());
        Point c = b;
        System.out.println(hh.isPointIn(c));
        segment ds = new segment(a,c);
        System.out.println(hh.isCrossin(ds));
        segment[] segs = {ds,hh};
        brokenLine brline = new brokenLine(segs);
        System.out.println(brline.Length());
    }
}
