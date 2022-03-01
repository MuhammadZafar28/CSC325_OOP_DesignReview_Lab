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
public class Senior extends Student { 
    private int credits = 85; // ToDo 8: The senior class should have a minimum of 85 credits 
    public Senior(String name, short age, int GPA){
        super(name,age,GPA);
    }
    
    public void setCredits(int credits) {
    if(credits < 85){
        System.out.println("Senior must have 85 or greater credits.");       
    }
    else {
        this.credits = credits;
    }  
  }
   public int getCredits(){
    return credits;   
   }  
    public String toString(){
    
    return "\nSenior Student:\n\tName: "+ getName() + "\n\tTotal Credits: " + credits + "\n\tAge: " +getAge()+"\n\tGPA: "+getGPA();
    }
    
}
