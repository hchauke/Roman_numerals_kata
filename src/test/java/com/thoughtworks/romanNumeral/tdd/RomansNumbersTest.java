package com.thoughtworks.romanNumeral.tdd;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RomansNumbersTest {

    @Rule
    public ExpectedException error = ExpectedException.none();

    @Test
    public void testZeroThrowException() throws RomansNumbersException {

        error.expect(RomansNumbersException.class);
        error.expectMessage("Zero number does not exist in Romans Number");
        RomansNumbers romansNumbers = new RomansNumbers();
        romansNumbers.getRomanNumbers(0);

    }

    @Test
    public void testOneReturnI() throws Exception {
        RomansNumbers romansNumbers = new RomansNumbers();

        Assert.assertEquals("I", romansNumbers.getRomanNumbers(1));
    }

    @Test
    public void testTwoReturnII() throws Exception {
        RomansNumbers romansNumbers = new RomansNumbers();
        Assert.assertEquals("II", romansNumbers.getRomanNumbers(2));

    }

    @Test
    public void testThreeReturnIII() throws Exception {
        RomansNumbers romansNumbers = new RomansNumbers();
        Assert.assertEquals("III", romansNumbers.getRomanNumbers(3));
    }

    @Test
    public void testFourReturnIV() throws Exception {

        RomansNumbers romansNumbers = new RomansNumbers();
        Assert.assertEquals("IV", romansNumbers.getRomanNumbers(4));
    }

    @Test
    public void testFiveReturnV() throws Exception {
        RomansNumbers romansNumbers = new RomansNumbers();
        Assert.assertEquals("V", romansNumbers.getRomanNumbers(5));

    }

    @Test
    public void testSixReturnVI() throws Exception {
        RomansNumbers romansNumbers = new RomansNumbers();
        Assert.assertEquals("VI", romansNumbers.getRomanNumbers(6));

    }

    @Test
    public void testSevenReturnVII() throws Exception {

        RomansNumbers romansNumbers = new RomansNumbers();
        Assert.assertEquals("VII", romansNumbers.getRomanNumbers(7));

    }

    @Test
    public void testEightReturnVIII() throws Exception {


    }
}
