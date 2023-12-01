package org.montes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {

    @Test
    public void testRomanToInt()  {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        assertEquals(3, converter.romanToInt("III"));
        assertEquals(4, converter.romanToInt("IV"));
        assertEquals(5, converter.romanToInt("V"));
        assertEquals(8, converter.romanToInt("VIII"));
        assertEquals(18, converter.romanToInt("XVIII"));
        assertEquals(48, converter.romanToInt("XLVIII"));
        assertEquals(98, converter.romanToInt("XCVIII"));
        assertEquals(50, converter.romanToInt("L"));
        assertEquals(140, converter.romanToInt("CXL"));
        assertEquals(144, converter.romanToInt("CXLIV"));
        assertEquals(500, converter.romanToInt("D"));
        assertEquals(1500, converter.romanToInt("DDD"));
        assertEquals(1000, converter.romanToInt("M"));
        assertEquals(3000, converter.romanToInt("MMM"));
        assertEquals(1666, converter.romanToInt("MDCLXVI"));
    }

    @Test
    public void testIntToRoman() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        assertEquals("M", converter.intToRoman(1000));
        assertEquals("MM", converter.intToRoman(2000));
        assertEquals("MMM", converter.intToRoman(3000));
        assertEquals("CM", converter.intToRoman(900));
        assertEquals("MCM", converter.intToRoman(1900));
        assertEquals("D", converter.intToRoman(500));
        assertEquals("MD", converter.intToRoman(1500));
        assertEquals("CD", converter.intToRoman(400));
        assertEquals("MCD", converter.intToRoman(1400));
        assertEquals("C", converter.intToRoman(100));
        assertEquals("XC", converter.intToRoman(90));
        assertEquals("L", converter.intToRoman(50));
        assertEquals("XL", converter.intToRoman(40));
        assertEquals("X", converter.intToRoman(10));
        assertEquals("IX", converter.intToRoman(9));
        assertEquals("V", converter.intToRoman(5));
        assertEquals("I", converter.intToRoman(1));
        assertEquals("MMCMXCIX", converter.intToRoman(2999));
        assertEquals("MMCDIX", converter.intToRoman(2409));
        assertEquals("MDCLXXVIII", converter.intToRoman(1678));
        assertEquals("DLXVI", converter.intToRoman(566));
        assertEquals("CDXXVII", converter.intToRoman(427));
        assertEquals("CII", converter.intToRoman(102));
        assertEquals("XCIX", converter.intToRoman(99));
        assertEquals("LX", converter.intToRoman(60));
        assertEquals("XLIV", converter.intToRoman(44));
        assertEquals("XVIII", converter.intToRoman(18));
        assertEquals("IV", converter.intToRoman(4));
        assertEquals("III", converter.intToRoman(4));
    }

}
