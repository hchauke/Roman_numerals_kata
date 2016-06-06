package com.thoughtworks.romanNumeral.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RomansNumbersTest {

    private RomansNumbers romansNumbers;

    @Before
    public void setUp() throws Exception {
        romansNumbers = new RomansNumbers();
    }

    @Rule
    public ExpectedException error = ExpectedException.none();

    @Test
    public void testZeroThrowException() throws RomansNumbersException {
        error.expect(RomansNumbersException.class);
        error.expectMessage("Zero number does not exist in Romans Number");
        romansNumbers.getRomanNumbers(0);
    }

    @Test
    public void testOneReturnI() throws Exception {
        Assert.assertEquals("I", romansNumbers.getRomanNumbers(1));
    }

    @Test
    public void testTwoReturnII() throws Exception {
        Assert.assertEquals("II", romansNumbers.getRomanNumbers(2));
    }

    @Test
    public void testThreeReturnIII() throws Exception {
        Assert.assertEquals("III", romansNumbers.getRomanNumbers(3));
    }

    @Test
    public void testFourReturnIV() throws Exception {

        Assert.assertEquals("IV", romansNumbers.getRomanNumbers(4));
    }

    @Test
    public void testFiveReturnV() throws Exception {
        Assert.assertEquals("V", romansNumbers.getRomanNumbers(5));
    }

    @Test
    public void testSixReturnVI() throws Exception {
        Assert.assertEquals("VI", romansNumbers.getRomanNumbers(6));
    }

    @Test
    public void testSevenReturnVII() throws Exception {
        Assert.assertEquals("VII", romansNumbers.getRomanNumbers(7));
    }

    @Test
    public void testEightReturnVIII() throws Exception {
        Assert.assertEquals("VIII", romansNumbers.getRomanNumbers(8));
    }

    @Test
    public void testNineReturnIX() throws Exception {
        Assert.assertEquals("IX", romansNumbers.getRomanNumbers(9));
    }

    @Test
    public void testTenReturnX() throws Exception {
        Assert.assertEquals("X", romansNumbers.getRomanNumbers(10));
    }

    @Test
    public void testElevenReturnXI() throws Exception {
        Assert.assertEquals("XI", romansNumbers.getRomanNumbers(11));
    }

    @Test
    public void testTwelveReturnXII() throws Exception {
        Assert.assertEquals("XII", romansNumbers.getRomanNumbers(12));
    }

    @Test
    public void testThirteenReturnXIII() throws Exception {
        Assert.assertEquals("XIII", romansNumbers.getRomanNumbers(13));
    }

    @Test
    public void testFourteenReturnXIV() throws Exception {
        Assert.assertEquals("XIV", romansNumbers.getRomanNumbers(14));
    }

    @Test
    public void testFifteenReturnXV() throws Exception {
        Assert.assertEquals("XV",romansNumbers.getRomanNumbers(15));
    }

    @Test
    public void testNineteenReturnXIX() throws Exception {
        Assert.assertEquals("XIX", romansNumbers.getRomanNumbers(19));
    }

    @Test
    public void testTwentyReturnXX() throws Exception {
        Assert.assertEquals("XX",romansNumbers.getRomanNumbers(20));

    }

    @Test
    public void testThirtyFiveReturnXXXV() throws Exception {
        Assert.assertEquals("XXXV", romansNumbers.getRomanNumbers(35));

    }

    @Test
    public void testFortyReturnXL() throws Exception {
        Assert.assertEquals("XL", romansNumbers.getRomanNumbers(40));
    }

    @Test
    public void testOneThousandNineHundredsNinetyNineReturnMCMXCIX() throws Exception {
        Assert.assertEquals("MCMXCIX", romansNumbers.getRomanNumbers(1999));

    }
}
