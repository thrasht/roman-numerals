package org.montes;

public class RomanNumeralConverter {

    public int romanToInt(String roman) {
        int pointer = 0;
        int result = 0;

        while (pointer < roman.length()) {
            switch (roman.charAt(pointer)) {
                case 'I':
                    result+=1;
                    pointer++;

                    if(pointer < roman.length() && roman.charAt(pointer) == 'V'){
                        result+=3;
                        pointer++;
                    }
                    break;
                case 'V':
                    result+=5;
                    pointer++;
                    break;

                default:
                    pointer++;
                }
        }

        return  result;
    }

    public String intToRoman(int number) {
        return null;
    }
}
