/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package studentgrade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;




/**
 *
 * @author user
 */
  


/* JUnit 3.8.1 */
public class StudentgradeTest  {
    
   

   

    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = Studentgrade.getGrade(mark);
        assertEquals(expResult, result);
    }

    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = Studentgrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    public void testGetGrade75() {
        System.out.println("getGrade 85");
        int mark = 75;
        String expResult = "F";
        String result = Studentgrade.getGrade(mark);
        assertEquals(expResult, result);
    }}

    