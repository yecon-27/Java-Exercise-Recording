package com.ava.adt;

public class eightIn32bits {

	public static void main(String[] args) {
        byte eightBitNumber = 8;
        int thirtyTwoBitNumber = eightBitNumber & 0xFF;
        
        System.out.println("8-bit number for 8 in binary: " + String.format("%8s", Integer.toBinaryString(eightBitNumber & 0xFF)).replace(' ', '0'));
        System.out.println("32-bit number for 8 in binary: " + String.format("%32s", Integer.toBinaryString(thirtyTwoBitNumber)).replace(' ', '0'));
        
        //8 >> 3
        byte eightBitNumberAfterShifting = (int) 8 >> 3;
        int thirtyTwoBitNumberAfterShifting =  eightBitNumberAfterShifting & 0xFF;
        
        System.out.println("8-bit number for 8 >> 3 in binary: " + String.format("%8s", Integer.toBinaryString(eightBitNumberAfterShifting & 0xFF)).replace(' ', '0'));
        System.out.println("32-bit number for 8 >> 3 in binary: " + String.format("%32s", Integer.toBinaryString(thirtyTwoBitNumberAfterShifting)).replace(' ', '0'));
  
        
        byte eightBitNumber2 = -8;
        int thirtyTwoBitNumber2 = eightBitNumber2 & 0xFF;
        System.out.println("8-bit number for -8 in binary: " + String.format("%8s", Integer.toBinaryString(eightBitNumber2 & 0xFF)).replace(' ', '0'));
        System.out.println("32-bit number for -8 in binary: " + String.format("%32s", Integer.toBinaryString(thirtyTwoBitNumber2)).replace(' ', '0'));
	
        //-8 >> 3
        byte eightBitNumberAfterShifting2 = (int) -8 >> 2;
        int thirtyTwoBitNumberAfterShifting2 =  eightBitNumberAfterShifting2 & 0xFF;
        System.out.println("8-bit number for -8 >> 2 in binary: " + String.format("%8s", Integer.toBinaryString(eightBitNumberAfterShifting2 & 0xFF)).replace(' ', '0'));
        System.out.println("32-bit number for -8 >> 2 in binary: " + String.format("%32s", Integer.toBinaryString(thirtyTwoBitNumberAfterShifting2)).replace(' ', '0'));
	
        //-8 >>> 3
        byte eightBitNumberAfterShifting3 = (byte) ((int) -8 >>> 2);
        int thirtyTwoBitNumberAfterShifting3 =  eightBitNumberAfterShifting3 & 0xFF;
        System.out.println("8-bit number for -8 >>> 2 in binary: " + String.format("%8s", Integer.toBinaryString(eightBitNumberAfterShifting3 & 0xFF)).replace(' ', '0'));
        System.out.println("32-bit number for -8 >>> 2 in binary: " + String.format("%32s", Integer.toBinaryString(thirtyTwoBitNumberAfterShifting3)).replace(' ', '0'));
	
        
	}

}
