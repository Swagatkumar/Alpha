package com.company.bitmanipulation;

class InvalidBitException extends Exception {
    int bit;

    InvalidBitException(int bit){
        this.bit = bit;
    }

    @Override
    public String toString() {
        return "InvalidBitException: "+bit+" is an invalid bit, it should be either 0 or 1";
    }
}

/**
 * Setting '1': n | (1<<pos)
 * pos = 2 of 10
 *  10 =       00001010
 * |(1<<2) =   00000100
 *             00001110 = 14
 *
 * Setting '0' -
 * Approach 1: n ^ (1<<pos)
 * pos = 1 of 10
 *  10 =       00001010
 * ^(1<<1) =   00000010
 *             00001000 = 8
 *
 * Approach 2: n & ~(1<<pos)
 * pos = 1 of 10
 *  10 =       00001010
 * &~(1<<1) =  11111101
 *             00001000 = 8
 */
public class SetIthBit {
    static int setIthBit(int n, int bit, int pos) throws InvalidBitException{
        int bitMask = 1<<pos;
        switch(bit){
            case 1:
                return n | bitMask;
            case 0:
                return n ^ bitMask; // another approach is n & ~bitMask
            default:
                throw new InvalidBitException(bit);
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println("Setting 1 at position 2 of 10: "+setIthBit(10, 1, 2));
            System.out.println("Setting 0 at position 1 of 10: "+setIthBit(10, 0, 1));
            System.out.println("Setting 3 at position 1 of 10: "+setIthBit(10, 3, 1));
        }catch(InvalidBitException e){
            e.printStackTrace();
        }
    }
}
