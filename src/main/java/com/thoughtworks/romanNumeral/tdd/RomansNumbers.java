package com.thoughtworks.romanNumeral.tdd;

public class RomansNumbers {
    public String getRomanNumbers(int number) throws RomansNumbersException {

        String romans = "";
        String[] romansSymbols = {"I", "IV", "V", "IX", "X","XL","L"};
        int[] arabicNumbers = {1, 4, 5, 9, 10, 40, 50};

        if (number == 0) {
            throw new RomansNumbersException("Zero number does not exist in Romans Number");
        }

        while(number > 0) {

            for (int i = arabicNumbers.length - 1; i >= 0; i--) {
                while (arabicNumbers[i] <= number) {
                    romans += romansSymbols[i];
                    number -= arabicNumbers[i];
                }

            }
        }
        return romans;
    }
}
