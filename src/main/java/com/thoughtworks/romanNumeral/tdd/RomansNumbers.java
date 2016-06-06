package com.thoughtworks.romanNumeral.tdd;

public class RomansNumbers {
    public String getRomanNumbers(int number) throws RomansNumbersException {

        String romans = "";
        String[] romansSymbols = {"I", "IV", "V", "IX", "X"};
        int[] arabicNumbers = {1, 4, 5, 9, 10};

        if (number == 0) {
            throw new RomansNumbersException("Zero number does not exist in Romans Number");
        }

        while(number >= arabicNumbers[4]){

            romans = romansSymbols[4];
            number -= arabicNumbers[4];
        }

        if (number <= 8 && number >= 5) {
            romans += "V";

            for (int i = 5; i < number; i++) {
                romans += "I";
            }

        } else if (number <= 3 && number > 0) {
            romans += "I";

            for (int i = 1; i < number; i++) {
                romans += "I";
            }

        } else if (number == 4) {
            romans += "IV";

        } else if (number == 9){
            romans += "IX";

        }

        return romans;
    }
}
