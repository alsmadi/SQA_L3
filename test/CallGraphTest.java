/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import lecture3.Lecture3;

/**
 *
 * @author IAlsmadi
 */
public class CallGraphTest {
    
    public CallGraphTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestPath1() {
         assertEquals(Lecture3.main1(),0);
     }
     
     @Test
     public void TestPath2() {
         assertEquals(Lecture3.main2(),0);
     }
     @Test
     public void TestPath3() {
         assertEquals(Lecture3.main3(),0);
     }
     @Test
     public void TestPath4() {
         assertEquals(Lecture3.main4(),0);
     }
}
