package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
   @Test
    public void emptyTest() {
       assertEquals(true, true);
   }

   @Test
   public void emptyString() {
       assertTrue(BalancedBrackets.hasBalancedBrackets(""));
   }

    @Test
    public void onlyBracketsWithCorrectPairReturnsTrue() {
       assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyBracketsFollowedByString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringFollowedByBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void correctOrderOfBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void twoBracketsInIncorrectOrder() {

       assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void missingCloseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsInIncorrectOrderWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void onlyOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void BracketsInIncorrectOrderWithString() {
       assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

}
