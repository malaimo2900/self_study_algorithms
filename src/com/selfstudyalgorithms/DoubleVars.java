/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfstudyalgorithms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author maaj
 */
public class DoubleVars {
    private double x;
    private double y;
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Run from the comandline with 2 double arguments");
            System.exit(2);
        }
        
        String pattern = "\\d|\\d\\.\\d";
        Pattern r = Pattern.compile(pattern);
        
        double[] doubles = new double[2];
        try {
            doubles[0] = matches(r, args[0]);
            doubles[1] = matches(r, args[1]);
        } catch(NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        
        DoubleVars dv = new DoubleVars(doubles[0], doubles[1]);
    }
    
    private static double matches(Pattern r, String arg) {
        Matcher m = r.matcher(arg);
        if (m.matches() == false) {
            System.out.println("Argument not a number");
            System.exit(3);
        }
        
        return Double.parseDouble(arg);
    }
    
    public DoubleVars(double x, double y) {
        
    }
}
