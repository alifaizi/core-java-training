package com.collections;

import java.util.ArrayList;

public class StudentListWithForLoopAndForEachLoop {
	
    public static void main(String[] args) {
    	
    	
        ArrayList<String>[] studentArray = new ArrayList[2];

        
        studentArray[0] = new ArrayList<>();
        studentArray[0].add("Ahamd");
        studentArray[0].add("Mahmood");
        studentArray[0].add("Sarah");
        studentArray[0].add("Faizi");
        
        studentArray[1] = new ArrayList<>();
        studentArray[1].add("Dave");
        studentArray[1].add("John");
        studentArray[1].add("Robin");
        studentArray[1].add("Oscar");


        for (int i = 0; i < studentArray.length; i++) {

            System.out.println("Student " + (i+1) + " Names:");
            
            for (String name : studentArray[i]) {
            	
                System.out.println(name);
            }
            System.out.println();
        }
    }
}