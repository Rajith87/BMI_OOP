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
public class Person {
    
    String name;
    int age;
    double ht;
    double wt;
    double bmi;
    
    public Person(){
        System.out.println("New class is created.");
    }
    
    public Person(String givenName){
        System.out.println("New class is created with a name.");
        name = givenName;
    }
    /**Creating methods*/
    public Person(String givenName, double givenHt, double givenWt){
        System.out.println("New class is created with Name, Ht, Wt(with created method)");
        name=givenName;
        ht=givenHt;
        wt=givenWt;
    }
    
    public void calculateBmi (){
        bmi = wt/(ht*ht);        
    }
}
