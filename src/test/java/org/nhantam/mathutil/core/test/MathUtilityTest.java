/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nhantam.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.nhantam.mathutil.core.MathUtility;

/**
 *
 * @author think
 */
public class MathUtilityTest {
    
   @Test
   public void checkFactorialGivenRightArgument0ReturnsWell(){
//       assertEquals(69, 69);
       assertEquals(1, MathUtility.getFactorial(0));
       assertEquals(1, MathUtility.getFactorial(1));
       assertEquals(2, MathUtility.getFactorial(2));
       assertEquals(24, MathUtility.getFactorial(4));
       assertEquals(720, MathUtility.getFactorial(6));
   }
}

// KIẾN THỨC MỚI: DDT - Data Driven Testing
//                      Kĩ thuật viết code kiểm thử của UnitTest
//                      mà tách phần data ra khỏi câu lệnh assertE()

// Viết các test case hướng về việc tách data test ra riêng biệt 

// KO NHẦM LẪN VỚI TDD - TEST DRIVEN DEVELOPMENT
// Kĩ thuật viết code làm app thì phải viết luôn code cho các test case để đảm bảo hàm/method/class chạy ngon

//TDD: viết code chính và code test/test case đc thực thi đan xen để check hàm đúng sai
//DDT: trong quá trình viết code test, tách data test ra riêng 1 chỗ cho dễ đọc, bảo trì

//DDT nằm trong TDD