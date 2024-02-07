package com.amg.BasicTest;

import java.io.ByteArrayInputStream;

import org.junit.*;
import com.amg.Basic.Basic17;

public class Basic17Test {
    
    void provideIput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void testConsoleInput() {
        
    }

    @Test
    public void testAddBinaryNumbers() {
        int binary1 = 10010;
        int binary2 = 110;

        int decimal1 = Integer.parseInt(String.valueOf(binary1), 2);
        int decimal2 = Integer.parseInt(String.valueOf(binary2), 2);

        int sum = decimal1 + decimal2;

        Assert.assertEquals(Integer.toBinaryString(sum), Basic17.addBinaryNumbers(binary1, binary2));
    }
}
