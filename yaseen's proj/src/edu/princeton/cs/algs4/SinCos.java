
package edu.princeton.cs.algs4;

import java.util.Scanner;


public class SinCos {
 public double d;
    public SinCos(double d) {
        this.d=d;
    }

    public SinCos() {
    }

    

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    
   
   
    public static double sin(double d)
    {
    return Math.sin(d);
    }
    public static double cos(double d)
    {
    return Math.cos(d);
    }
    public static double tan(double d)
    {
    return Math.tan(d);
    }
    
}
