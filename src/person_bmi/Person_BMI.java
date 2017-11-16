/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_bmi;

/**
 *
 * @author MERC-LAB-01
 */
public class Person_BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person();
            p1.name = "Rajith";
            p1.ht =1.72;
            p1.wt =58;
            p1.calculateBmi();
            System.out.println(p1.name+"'s BMI is " +p1.bmi);
        
        Person p2 =new Person("XYZ");
            p2.ht=1.68;
            p2.wt=80;
            p2.calculateBmi();
            System.out.println(p2.name+"'s BMI is "+p2.bmi);
        
        Person p3 =new Person("ABC");
            p3.ht=1.70;
            p3.wt=90;
            p3.calculateBmi();
            System.out.println(p3.name+"'s BMI is "+p3.bmi);
            
        Person p4=new Person("Hathamuna",1.70,62);
            System.out.println(p4.name+"'s BMI is "+p4.bmi);
        
    }
    
}
