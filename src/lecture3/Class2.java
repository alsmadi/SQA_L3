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
    
     static int m1(){
      System.out.println("I am in Class2 m1 method");
         Class3.m1();
         return 0;
    }
    static int m2(){
      System.out.println("I am in Class2 m2 method");
       Class3.m3();
          return 0;
        
    }
    static int m3(){
      System.out.println("I am in Class2 m3 method");
      return 0;
        
    }
    static int m4(){
      System.out.println("I am in Class2 m4 method");
        Class3.m1();
        
        return 0;
        
    }
    
}
