/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinhdph.mathutil.test;

import /*statc*/ static com.thinhdph.mathutil.MathUtility.*; // t muốn các hàm, biến trong class này gõ trực tiếp ko cần class CHẤM
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HungThinh
 */
public class MathTest {
 @Test   
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n = 5;              //test 5! cos dung la
        long expected = 120;    //120 hay ko
        long actual = getFactorial(n);
        assertEquals(expected, actual);
        //mình tiêp tục test các trường hợp khác đúng đầu vào , đầu ra
        //khỏi cần biến trung gian làm luôn trong lệnh
        assertEquals(720 , getFactorial(6));
        assertEquals(24 , getFactorial(4));
        assertEquals(6 , getFactorial(3));
        assertEquals(1 , getFactorial(1));
        assertEquals(1 , getFactorial(0));
     }
    //điều gì xảy ra nếu ta đưa vào tham số cà chớn, âm, hoặc >20
        //theo thiết kế của hàm, đưa vào cà chớn sẽ ném ra ngoại lệ
        //và ta CẦN TEST XEM, NGOẠI LỆ  CÓ ĐƯỢC NÉM RA KO NẾU TA CÀ CHỚN
        // TỨC LÀ THẤY XUẤT HIỆN NGOẠI LỆ NẾU CÓ CÀ CHỚN ĐƯA VÀO --> HÀM ĐÚNG
        // THẤY NGOẠI LỆ KHI CÓ CÀ CHỚN MÌNH MỪNG VÌ HÀM ĐÃ CHẠY ĐÚNG (NGOẠI LỆ MÀ MÀU XANH LÀ ĐÚNG)
        
        @Test(expected = IllegalArgumentException.class) //có đúng ra hàm này thì ném ra ngoại lệ tên là Illegal...
                                                    // nếu đúng nó né ra ngoại lệ cùng tên, code đúng rồi, XANHHH
        
        public void testFactorialWrongArgumetThrowsException(){
            //mình test tình huống hàm phải ném ra ngoại lệ nếu tham số cà chớn
            //ngoại lệ không phải là value để so sánh, ko đùng assertEquals()
            //ta phải dùng chiêu khác. JUnit 4 khác JUnit 5 ở chỗ bắt ngoại lệ
            // KỲ 5 ĐI DỰ THÍNH MÔN SWT301 CỦA GIÁO LÀNG : DI, Lambda Expression liên quan, Dependency Injection / SOLID
            getFactorial(-5);
            getFactorial(21);
            getFactorial(40);
        }
}
