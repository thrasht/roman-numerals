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
                case 'X':
                    result+=10;
                    pointer++;

                    if(pointer < roman.length()){
                        if(roman.charAt(pointer) == 'L') {
                            result += 30;
                            pointer++;
                        } else if (roman.charAt(pointer) == 'C') {
                            result += 80;
                            pointer++;
                        }
                    }
                    break;
                case 'L':
                    result += 50;
                    pointer++;
                    break;
                case 'C':
                    result += 100;
                    pointer++;

                    if(pointer < roman.length()){
                        if(roman.charAt(pointer) == 'D') {
                            result += 300;
                            pointer++;
                        } else if (roman.charAt(pointer) == 'M') {
                            result += 800;
                            pointer++;
                        }
                    }
                    break;
                case 'D':
                    result += 500;
                    pointer++;
                    break;
                case 'M':
                    result += 1000;
                    pointer++;
                    break;    

                default:
                    pointer++;
                }
        }

        return  result;
    }

    public String intToRoman(int number) {
        StringBuilder result = new StringBuilder();

        while (number >= 1000) {
            result.append("M");
            number -= 1000;
        }

        if (number >= 900) {
            result.append("CM");
            number -= 900;
        } else if (number >= 500) {
            result.append("D");
            number -= 500;
        } else if (number >= 400) {
            result.append("CD");
            number -= 400;
        }

        while (number >= 100) {
            result.append("C");
            number -= 100;
        }

        return result.toString();
    }
}
