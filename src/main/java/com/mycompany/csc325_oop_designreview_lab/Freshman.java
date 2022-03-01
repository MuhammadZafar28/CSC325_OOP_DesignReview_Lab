/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author awais
 */
public class Freshman extends Student{ //extends Student 

    public Freshman(String name, short age, int GPA) {// Constructor
        super(name, age, GPA);
    }
    
    public String toString() {
     return "\nFreshman Student:\n\tName:"+getName()+"\n\tAge: "+ getAge()+ "\n\tGPA: "+ getGPA();
    }
    
}
