package com.company;

public class Point {
    private double x,y,z;
    Point(double a) {
        this.x = a;
    }
    public Point(double a, double b) {
        this.x = a;
        this.y = b;
    }
    Point(double a, double b, double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }



    public double getCoord(String a){

        if (a.equals("x")){
            return this.x;
        } else  if (a.equals("y")){
            return this.y;
        }
        else  if (a.equals("z")){
            return this.z;
        }
        return 0;
    }

}
