package com.iss;

public class PrimitiveDataType {

	public static void main(String[] args) {
        // byte type
		//-128 to 127 (8 bit)
        byte byteValue = 100;
        System.out.println("byteValue: " + byteValue);

        // short type
        //-32,768 to 32,767 (16 bit)
        short shortValue = 10000;
        System.out.println("shortValue: " + shortValue);

        // int type
        // -2^31 to 2^31 - 1 (32 bit)
        int intValue = 100000;
        System.out.println("intValue: " + intValue);

        // long type
        // -2^63 to 2^63 - 1 (32 bit)
        long longValue = 100000L;
        System.out.println("longValue: " + longValue);

        // float type
        // (6-7 significant decimal digits)
        float floatValue = 10.567366456768383f;
        System.out.println("floatValue: " + floatValue);

        // double type
        // (15 significant decimal digits)
        double doubleValue = 10.567366456768383d;
        System.out.println("doubleValue: " + doubleValue);

        // boolean type
        boolean booleanValue = true;
        System.out.println("booleanValue: " + booleanValue);

        // char type
        //Lowercase 'a' to 'z': Unicode values range from 97 to 122.
        //Uppercase 'A' to 'Z': Unicode values range from 65 to 90.
        
        char charValue = 'A';
        System.out.println("charValue: " + charValue);
    }
	
}
