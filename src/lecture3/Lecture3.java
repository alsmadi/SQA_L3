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
public class Lecture3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("I am in main method");
        // TODO code application logic here
        m1();
        m2();
        m3();
        m4();
        
    }
    
     public static int main1() {
        
        System.out.println("I am in main method");
        // TODO code application logic here
        m1();
        //m2();
        //m3();
        //m4();
        
        return 0;
        
    }
      public static int main2() {
        
        System.out.println("I am in main method");
        // TODO code application logic here
       // m1();
        m2();
        //m3();
        //m4();
        
        return 0;
        
    }
      public static int main3() {
        
        System.out.println("I am in main method");
        // TODO code application logic here
       // m1();
       // m2();
        m3();
        //m4();
        
        return 0;
        
    }
      public static int main4() {
        
        System.out.println("I am in main method");
        // TODO code application logic here
       // m1();
     //   m2();
        //m3();
        m4();
        
        return 0;
        
    }
    
    static int m1(){
         System.out.println("I am in Lecture3 m1 method");
        Class1.m1();
        Class2.m2();
        Class3.m3();
        
        return 0;
       
        
    }
    static int m2(){
        System.out.println("I am in Lecture3 m2 method");
           Class1.m1();
        Class2.m2();
        Class3.m3();
        return 0;
        
    }
    static int m3(){
       System.out.println("I am in Lecture3 m3 method");
          Class1.m1();
        Class2.m2();
        Class3.m3();
        return 0;
        
    }
    static int m4(){
       System.out.println("I am in Lecture3 m4 method");
        Class1.m1();
        Class2.m2();
        Class3.m3(); 
        return 0;
        
    }
    
}
