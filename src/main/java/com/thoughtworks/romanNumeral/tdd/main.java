package com.thoughtworks.romanNumeral.tdd;

public class main {
    public static void main(String[] args) throws RomansNumbersException {
        RomansNumbers romansNumbers = new RomansNumbers();

        System.out.println("[5] in roman is:" + romansNumbers.getRomanNumbers(5));
        System.out.println("[9] in roman is:" + romansNumbers.getRomanNumbers(9));
        System.out.println("[20] in roman is:" + romansNumbers.getRomanNumbers(20));
        System.out.println("[21] in roman is:" + romansNumbers.getRomanNumbers(21));
    }
}
