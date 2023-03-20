import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Chance {
  public Chance(){}
  public Chance(List<String> al) {
  }
  void pair(String[] arr,String[] river,String[] hand) {
    if (isPair(river, hand) == true) {
      System.out.println("100%");
    }
    else {
    BigInteger chance = new BigInteger("1");
    BigInteger chance2 = new BigInteger("1");
    BigInteger chance3 = new BigInteger("1");
    BigInteger chance4 = new BigInteger("1");
    BigInteger temp = new BigInteger("1");
    BigInteger temp2 = new BigInteger("1");
    BigInteger temp3 = new BigInteger("1");
    //Chance 1
    temp = factorial(1).multiply(factorial(13-1));
    chance = factorial(13).divide(temp);
    //Chance 2
    temp = factorial(2).multiply(factorial(4-2));
    chance2 = factorial(4).divide(temp);
    //Chance 3
    temp = factorial(3).multiply(factorial(12-3));
    chance3 = factorial(12).divide(temp);
    //Chance 4
    temp = factorial(1).multiply(factorial(4-1));
    chance4 = factorial(4).divide(temp);
    chance3 = chance3.multiply(chance4.multiply(chance4));

    //Final Compute
    BigDecimal finalChance = new BigDecimal("0.1");
    temp = chance3.multiply(chance2.multiply(chance));
    temp2 = factorial(7).multiply(factorial(52-7));
    temp3 = factorial(52).divide(temp2);
    BigDecimal tempDec = new BigDecimal(temp);
    BigDecimal temp2Dec = new BigDecimal(temp3);
    finalChance = tempDec.divide(temp2Dec,MathContext.DECIMAL32);

    BigDecimal hundred = new BigDecimal("100");
    finalChance = hundred.multiply(finalChance);

    System.out.println(finalChance);

    //C(47,2)(4,2)(13,1) // Algorithim
    // 47 = deck size, 2 = amount of cards needed
    // 4 =amount of suites 2= amount of suites needed
    // 13 = amount of cards in suite 1= amount of cards needed in that suite
    }
  }
  void triple(String[] arr,String[] river,String[] hand) {
    if (isTriple(river, hand) == true) {
      System.out.println("100%");
    }
    else {
    BigInteger chance = new BigInteger("1");
    BigInteger chance2 = new BigInteger("1");
    BigInteger chance3 = new BigInteger("1");
    BigInteger chance4 = new BigInteger("1");
    BigInteger temp = new BigInteger("1");
    BigInteger temp2 = new BigInteger("1");
    BigInteger temp3 = new BigInteger("1");

    //Chance 1
    temp = factorial(2).multiply(factorial(12-2));
    chance = factorial(12).divide(temp);
    
    //Chance 2
    temp = factorial(3).multiply(factorial(4-3));
    chance2 = factorial(4).divide(temp);
    //System.out.println(chance2);
    
    //Chance 3
    temp = factorial(1).multiply(factorial(13-1));
    chance3 = factorial(13).divide(temp);
    //System.out.println(chance3);
    //Chance 4
    temp = factorial(3).multiply(factorial(4-3));
    chance4 = factorial(4).divide(temp);
    chance3 = chance3.multiply(chance4.multiply(chance4));
    //Final Compute
    BigDecimal finalChance = new BigDecimal("1.0");
    temp = chance3.multiply(chance2.multiply(chance));
    temp2 = factorial(7).multiply(factorial(52-7));
    temp3 = factorial(52).divide(temp2);
    BigDecimal tempDec = new BigDecimal(temp);
    BigDecimal temp2Dec = new BigDecimal(temp3);
    finalChance = tempDec.divide(temp2Dec,MathContext.DECIMAL32);

    BigDecimal hundred = new BigDecimal("100");
    finalChance = hundred.multiply(finalChance);

    System.out.println(finalChance);
    //C(50,5)(4,3)(13,1);
    }
  }
  void four(String[] arr) { 
    BigInteger chance = new BigInteger("1");
    BigInteger chance2 = new BigInteger("1");
    BigInteger chance3 = new BigInteger("1");
    BigInteger chance4 = new BigInteger("1");
    BigInteger temp = new BigInteger("1");
    BigInteger temp2 = new BigInteger("1");
    BigInteger temp3 = new BigInteger("1");
    
    //Chance 1
    temp = factorial(1).multiply(factorial(12-1));
    chance = factorial(12).divide(temp);
    
    //Chance 2
    temp = factorial(4).multiply(factorial(4-4));
    chance2 = factorial(4).divide(temp);
    //System.out.println(chance2);
    
    //Chance 3
    temp = factorial(1).multiply(factorial(12));
    chance3 = factorial(13).divide(temp);
    //System.out.println(chance3);

    //Chance 4
    temp = factorial(1).multiply(factorial(4-1));
    chance4 = factorial(4).divide(temp);
    chance3 = chance3.multiply(chance4);

    //Final Compute
    BigDecimal finalChance = new BigDecimal("1.0");
    temp = chance3.multiply(chance2.multiply(chance));
    temp2 = factorial(7).multiply(factorial(52-7));
    temp3 = factorial(52).divide(temp2);
    BigDecimal tempDec = new BigDecimal(temp);
    BigDecimal temp2Dec = new BigDecimal(temp3);
    finalChance = tempDec.divide(temp2Dec,MathContext.DECIMAL32);

    BigDecimal hundred = new BigDecimal("100");
    finalChance = hundred.multiply(finalChance);

    System.out.println(finalChance);
    //C(50,5)(4,4)(13,1)
  }
  void fullHouse(String[] arr) {
    BigInteger chance = new BigInteger("1");
    BigInteger chance2 = new BigInteger("1");
    BigInteger chance3 = new BigInteger("1");
    BigInteger temp = new BigInteger("1");
    BigInteger temp2 = new BigInteger("1");
    BigInteger temp3 = new BigInteger("1");
    //Chance 1- permutation
    chance = BigInteger.valueOf(13*12);
    //Same as (13 1) * (12 1)
    //System.out.println(chance);
    //Chance2
    temp = factorial(3).multiply(factorial(1));
    chance2 = factorial(4).divide(temp);
    //System.out.println(chance2);
    
    //Chance 3
    temp = factorial(2).multiply(factorial(2));
    chance3 = factorial(4).divide(temp);
    //System.out.println(chance3);

    //Final Chance
    BigDecimal finalChance = new BigDecimal("1.0");
    temp = chance3.multiply(chance2.multiply(chance));
    temp2 = factorial(7).multiply(factorial(52-7));
    temp3 = factorial(52).divide(temp2);
    BigDecimal tempDec = new BigDecimal(temp);
    BigDecimal temp2Dec = new BigDecimal(temp3);
    finalChance = tempDec.divide(temp2Dec,MathContext.DECIMAL32);

    BigDecimal hundred = new BigDecimal("100");
    finalChance = hundred.multiply(finalChance);

    System.out.println(finalChance);
    //P(13,2)C(4,3)C(4,2)
    //P 13 for one suite picking two cards 3 times and 2 times

    //PCC / C(52,5) // Amount of cards
  }
  void straight(String[] arr) {
    // Use product rule to multiply 52*51*50*49*48/4(because of suites) to get the chance of selecting when you sample without replacement.
    //Probability of getting 5 specific out of 13 cards(4 out of 13 as you have one) *4 to get all pairs
    BigInteger chance = new BigInteger("1");
    BigInteger chance2 = new BigInteger("1");
    BigInteger chance3 = new BigInteger("1");
    BigInteger temp = new BigInteger("1");
    BigInteger temp2 = new BigInteger("1");
    BigInteger temp3 = new BigInteger("1");

    //Chance 1
    temp = factorial(1).multiply(factorial(13-1));
    chance = factorial(13).divide(temp);
    //Chance 2
    temp = factorial(1).multiply(factorial(4-1));
    chance2 = factorial(4).divide(temp);
    chance3 = chance2.multiply(chance2.multiply(chance2.multiply(chance2.multiply(chance2))));
    //Final Chance
    BigDecimal finalChance = new BigDecimal("1.0");
    temp = chance3.multiply(chance);
    temp2 = factorial(7).multiply(factorial(52-7));
    temp3 = factorial(52).divide(temp2);
    BigDecimal tempDec = new BigDecimal(temp);
    BigDecimal temp2Dec = new BigDecimal(temp3);
    finalChance = tempDec.divide(temp2Dec,MathContext.DECIMAL32);

    BigDecimal hundred = new BigDecimal("100");
    finalChance = hundred.multiply(finalChance);

    System.out.println(finalChance);
  }
  void flush(String[] arr) {
    //Probability is any 13 cards in a suite with only one of the four suites 
    BigInteger chance = new BigInteger("1");
    BigInteger chance2 = new BigInteger("1");
    BigInteger chance3 = new BigInteger("1");
    BigInteger temp = new BigInteger("1");
    BigInteger temp2 = new BigInteger("1");
    BigInteger temp3 = new BigInteger("1");
    //Chance 1- permutation
    chance = BigInteger.valueOf(1*1);
    //System.out.println(chance);
    //Chance2
    temp = factorial(5).multiply(factorial(8));
    chance2 = factorial(13).divide(temp);
    //System.out.println(chance2);
    
    //Chance 3
    temp = factorial(1).multiply(factorial(3));
    chance3 = factorial(4).divide(temp);
    //System.out.println(chance3);

    //Final Chance
    BigDecimal finalChance = new BigDecimal("1.0");
    temp = chance3.multiply(chance2.multiply(chance));
    temp2 = factorial(7).multiply(factorial(52-7));
    temp3 = factorial(52).divide(temp2);
    BigDecimal tempDec = new BigDecimal(temp);
    BigDecimal temp2Dec = new BigDecimal(temp3);
    finalChance = tempDec.divide(temp2Dec,MathContext.DECIMAL32);

    BigDecimal hundred = new BigDecimal("100");
    finalChance = hundred.multiply(finalChance);
    
    System.out.println(finalChance);
    //[C(13,5) / C(50,5) ] * 4for the suites

  }
  BigInteger factorial(int n) {
    BigInteger result = BigInteger.ONE;
    for (int i = 2; i <= n; i++)
        result = result.multiply(BigInteger.valueOf(i));
    return result;
  }

  boolean isPair(String[] river,String[] hand) {
  Character hand1 = hand[0].charAt(0);
  Character hand2 = hand[1].charAt(0);
  Character[] charArray = new Character[5];
  charArray[0] = river[0].charAt(0);
  charArray[1] = river[1].charAt(0);
  charArray[2] = river[2].charAt(0);
  charArray[3] = river[3].charAt(0);
  charArray[4] = river[4].charAt(0);
  //If there is a pair in the hand
  if(hand1 == hand2) {
    return true;
  }
  //If there is a pair with a hand and the river
  for(int i=0; i < charArray.length;++i) {
    if(hand1 == charArray[i]) {
      return true;
    }
  }
  for(int i=0; i < charArray.length;++i) {
    if(hand2 == charArray[i]) {
      return true;
    }
  }
  //If the river hand pairs
  if(new HashSet<Character>(Arrays.asList(charArray)).size() == 4){return true;}
  if(new HashSet<Character>(Arrays.asList(charArray)).size() == 3){return true;}
  if(new HashSet<Character>(Arrays.asList(charArray)).size() == 2){return true;}
  return false;
  }
  
  boolean isTriple(String[] river,String[] hand){
    //either you have two cards that are the same and the 3rd is on the board
    //or two on the board and one in your hand
    // could use my isPair
  Character hand1 = hand[0].charAt(0);
  Character hand2 = hand[1].charAt(0);
  Character[] charArray = new Character[5];
  charArray[0] = river[0].charAt(0);
  charArray[1] = river[1].charAt(0);
  charArray[2] = river[2].charAt(0);
  charArray[3] = river[3].charAt(0);
  charArray[4] = river[4].charAt(0);
  //check two cards in hand
  
  if(hand1.equals(hand2) == true) 
  {
    if (hand1.equals(charArray[0]) == true) {
      return true;
    }
    else if (hand1.equals(charArray[1]) == true) {
      return true;
    }
    else if (hand1.equals(charArray[2]) == true) {
      return true;
    }
    else if (hand1.equals(charArray[3]) == true) {
      return true;
    }
    else if (hand1.equals(charArray[4]) == true) {
      return true;
    }
  }
  //Check cards on table
  if(new HashSet<Character>(Arrays.asList(charArray)).size() == 4){
    boolean checker = false;
    char answer = 'n';
    while(checker == false) {
      int i=0;
      if (charArray[i] == charArray[0]) {
        answer = charArray[0];
        checker = true;
      }
      if (charArray[i] == charArray[1]) {
        answer = charArray[1];
        checker = true;
      }
      if (charArray[i] == charArray[2]) {
        answer = charArray[2];
        checker = true;
      }
      if (charArray[i] == charArray[3]) {
        answer = charArray[3];
        checker = true;
      }  
      if (charArray[i] == charArray[4]) {
        answer = charArray[4];
        checker = true;
      }
    }
    if(hand1 == answer) {
      return true;
    }
    if(hand2 == answer) {
      return true;
    }
  }
  if(new HashSet<Character>(Arrays.asList(charArray)).size() == 3){
    boolean checker1 = false;
    boolean checker2 = false;
    char answer1;
    char answer2;
    while(checker1 == false && checker2 == false) {
      int i=0;
      while(checker1 == false) {
      if (charArray[i] == charArray[0]) {
        answer1 = charArray[0];
        checker1 = true;
      }
      if (charArray[i] == charArray[1]) {
        answer1 = charArray[1];
        checker1 = true;
      }
      if (charArray[i] == charArray[2]) {
        answer1 = charArray[2];
        checker1 = true;
      }
      if (charArray[i] == charArray[3]) {
        answer1 = charArray[3];
        checker1 = true;
      }  
      if (charArray[i] == charArray[4]) {
        answer1 = charArray[4];
        checker1 = true;
      }
    }
      while(checker2 == false) {
      if (charArray[i] == charArray[0]) {
        answer2 = charArray[0];
        checker2 = true;
      }
      if (charArray[i] == charArray[1]) {
        answer2 = charArray[1];
        checker2 = true;
      }
      if (charArray[i] == charArray[2]) {
        answer2 = charArray[2];
        checker2 = true;
      }
      if (charArray[i] == charArray[3]) {
        answer2 = charArray[3];
        checker1 = true;
      }  
      if (charArray[i] == charArray[4]) {
        answer2 = charArray[4];
        checker2 = true;
      }
    }
    }
    if (hand1 == answer1 || hand1 == answer2) {
      return true;
    }
    else if (hand2 == answer1 || hand2 == answer2) {
      return true;
    }
    else 
    return false;
    } 
    //FIX IT:will be true if two pairs in river
  if(new HashSet<Character>(Arrays.asList(charArray)).size() == 2){return true;}
  if(new HashSet<Character>(Arrays.asList(charArray)).size() == 1){return true;}
  /*
  else if (hand1.equals(hand2) == false) 
  {
    if ((hand1.equals(river1) || hand1.equals(river2) || hand1.equals(river3) ||hand1.equals(river4) || hand1.equals(river5)) == true) {
      if ((river1.equals(river2) || river1.equals(river3) ||river1.equals(river4) || river1.equals(river5)) == true) {
        return true;
      }
      else if ((river2.equals(river1) || river2.equals(river3) ||river2.equals(river4) || river2.equals(river5))) {
        return true;
      }
    }
    else if (hand1.equals(river2) == true) {
      return true;
    }
    else if (hand1.equals(river3) == true) {
      return true;
    }
    else if (hand1.equals(river4) == true) {
      return true;
    }
    else if (hand1.equals(river5) == true) {
      return true;
    }
    else if (hand2.equals(river1) == true) {
      return true;
    }
    else if (hand2.equals(river2) == true) {
      return true;
    } 
    else if (hand2.equals(river3) == true) {
      return true;
    } 
    else if (hand2.equals(river4) == true) {
      return true;
    } 
    else if (hand2.equals(river5) == true) {
      return true;
    } 
  }
  */
    return false;
  }
 }