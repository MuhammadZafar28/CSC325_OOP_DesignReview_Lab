
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
    private int GPA;// Private Variable
    public Student(String name, short age, int GPA) {
        super(name, age);
        this.GPA = GPA;
    }
        
        // Getter
        public int getGPA(){
        return GPA;
        }

        // Setter
        public void setGPA(int GPA) {
        this.GPA = GPA;
        }

        
	// ToDo 4: Add comments to your code

    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}