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
public class Class1 {
    static int m1(){
          System.out.println("I am in Class1 m1 method");
          Class2.m2();
          Class3.m2();
          return 0;
        
    }
    static int m11(){
          System.out.println("I am in Class1 m1 method");
       //   Class2.m2();
          Class3.m2();
          return 0;
        
    }
    static int m13(){
          System.out.println("I am in Class1 m1 method");
          Class2.m2();
      //    Class3.m2();
          return 0;
        
    }
    static int m2(){
      System.out.println("I am in Class1 m2 method");
        return 0;
    }
    static int m3(){
      System.out.println("I am in Class1 m3 method");
       Class2.m2();
          Class3.m2();
          return 0;
        
    }
    static int m4(){
      System.out.println("I am in Class1 m4 method");
      return 0;
        
    }
}
