package com.amg.BasicTest;

import org.junit.*;
import package.Basic17;

public class Basic17Test {
    
    @Test
    public void testConsoleInput() {
        
    }

    @Test
    public void testAddBinaryNumbers() {
        int binary1 = 0b10010;
        int binary2 = 0b110;

        Assert.assertEquals(Math.addExact(binary1, binary2), Basic17.addBinaryNumbers(binary1, binary2));
    }
}
