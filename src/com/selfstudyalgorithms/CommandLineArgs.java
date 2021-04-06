/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfstudyalgorithms;

/**
 *
 * @author maaj
 */
public class CommandLineArgs {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Run from the comandline with 3 arguments");
            System.exit(2);
        }
        
        if (args[0].equals(args[1]) && args[0].equals(args[2])) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
