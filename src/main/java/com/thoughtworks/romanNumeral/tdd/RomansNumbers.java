package com.thoughtworks.romanNumeral.tdd;

public class RomansNumbers {
    public String getRomanNumbers(int number) throws RomansNumbersException {

        String romans = "";

        if (number == 0) {
            throw new RomansNumbersException("Zero number does not exist in Romans Number");

        } else if (number <= 8 && number >= 5) {
            romans = "V";

            for (int i = 5; i < number; i++){
                romans += "I";
            }

        } else if(number <= 3){
            romans = "I";

            for(int i = 1; i < number; i++){
                romans += "I";
            }

        } else if (number == 4){
            romans = "IV";
        }

        return romans;
    }
}
