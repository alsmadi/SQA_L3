/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture3;

/**
 *
 * @author IAlsmadi
 */
public class Class2 {
    
     static void m1(){
      System.out.println("I am in Class2 m1 method");
         Class3.m1();
    }
    static void m2(){
      System.out.println("I am in Class2 m2 method");
       Class3.m3();
          Class3.m3();
        
    }
    static void m3(){
      System.out.println("I am in Class2 m3 method");
        
    }
    static void m4(){
      System.out.println("I am in Class2 m4 method");
        Class3.m1();
        
    }
    
}
