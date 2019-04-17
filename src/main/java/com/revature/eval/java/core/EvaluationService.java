package com.revature.eval.java.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		
		//using phrase.toCharArray creates an array of chars
		//from the given phrase
		char[] phrArr = phrase.toCharArray();
		//we want to start building our acronyms using
		//the first element in our arrays (index 0)
		String acronym = "" + phrArr[0];
		
		//iterates the array
		for(int i = 1; i < phrArr.length; i++) 
		{
			//if index I has a character and if there isn't a character in the previous index
			if((Character.isLetter(phrArr[i])) && (!(Character.isLetter(phrArr[i-1]))))
			{
				//then take that character and add it to the acronym
				acronym = acronym + phrArr[i];
			}
		}
		//makes all letters uppercase	
		return acronym.toUpperCase();
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			if((sideOne == sideTwo) && (sideTwo == sideThree)) 
			{
			return true;
			}
			else
			{
			return false;
			}
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			if((sideOne == sideTwo) || (sideTwo == sideThree) || (sideOne == sideThree)) 
			{
				return true;
			}
			else 
			{
			return false;
			}
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			if((sideOne != sideTwo) && (sideTwo != sideThree) && (sideOne != sideThree))
			{
				return true;
			}
			else 
			{
				return false;
			}
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
	    
		//creates character array out of given string
		char[] word = string.toCharArray();
		
		//creates int called sum which is initially set to 0
	    int sum = 0;
	    
	    //iterates the character array
	    for(int i = 0; i < word.length; i++){
	    	
	    	//used to add a value to sum based on the char at the current index
	    	switch(Character.toUpperCase(string.charAt(i))) 
	    	{
	    	 	case 'A':
	    	 		sum = sum + 1;
	    	 		break;
	    		
	    	 	case 'E':
	    	 		sum = sum + 1;
	    	 		break;
	    	 		
	    	 	case 'I':
	    	 		sum = sum + 1;
	    	 		break;
	    	 		
	    	 	case 'O':
	    	 		sum = sum + 1;
	    	 		break;
	    	 		
	    	 	case 'U':
	    	 		sum = sum + 1;
	    	 		break;
	    	 		
	    	 	case 'L':
	    	 		sum = sum + 1;
	    	 		break;
	    	 	
	    	 	case 'N':
	    	 		sum = sum + 1;
	    	 		break;
	    	 		
	    	 	case 'R':
	    	 		sum = sum + 1;
	    	 		break;
	    	 	
	    	 	case 'S':
	    	 		sum = sum + 1;
	    	 		break;
	    	 		
	    	 	case 'T':
	    	 		sum = sum + 1;
	    	 		break;
	    	 	
	    	 	case 'D':
	    	 		sum = sum + 2;
	    	 		break;
	    	 		
	    	 	case 'G':
	    	 		sum = sum + 2;
	    	 		break;
	    	 	
	    	 	case 'B':
	    	 		sum = sum + 3;
	    	 		break;
	    	 		
	    	 	case 'C':
	    	 		sum = sum + 3;
	    	 		break;
	    	 	
	    	 	case 'M':
	    	 		sum = sum + 3;
	    	 		break;
	    	 	
	    	 	case 'P':
	    	 		sum = sum + 3;
	    	 		break;
	    	 		
	    	 	case 'F':
	    	 		sum = sum + 4;
	    	 		break;
	    	 	
	    	 	case 'H':
	    	 		sum = sum + 4;
	    	 		break;
	    	 	
	    	 	case 'V':
	    	 		sum = sum + 4;
	    	 		break;
	    	 	
	    	 	case 'W':
	    	 		sum = sum + 4;
	    	 		break;
	    	 	
	    	 	case 'Y':
	    	 		sum = sum + 4;
	    	 		break;
	    	 		
	    	 	case 'K':
	    	 		sum = sum + 5;
	    	 		break;
	    	 		
	    	 	case 'J':
	    	 		sum = sum + 8;
	    	 		break;
	    	 		
	    	 	case 'X':
	    	 		sum = sum + 8;
	    	 		break;
	    	 	
	    	 	case 'Q':
	    	 		sum = sum + 10;
	    	 		break;
	    		
	    	 	case 'Z':
	    	 		sum = sum + 10;
	    	 		break;
	    	
	    	}
	    	 
	    	 
	     }
	        return sum;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		
		//removes all non-numerics, expected number of digits is 10
		string = string.replaceAll("[^_0-9]+", ""); 
		
		//if the length of the number exceeds 10 digits,
		if(string.length()>10) 
		{
			//throw this exception
			throw new IllegalArgumentException();
		}
		
		//since earlier code cleaned up the input, anything less than 10 = non-numerics			
		if(string.length()<10) 
		{
			throw new IllegalArgumentException();
		}
		return string;
	
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		
		//string.split(with this regex) creates a string array out of all tested strings
		String[] Battlestar = string.split("[\\s@&.?$+-,]+");
		
		//This is the same as:
		//String[] Battlestar = {"word","one","of","each",etc...}
		
		//creates a new hashmap called bsgHM
		Map<String,Integer> bsgHM = new HashMap();
		
		//enhanced for loop 
		for(String x:Battlestar)
		//this iterates the String [] Battlestar and at each iteration
		//stores the element as var x
		{
			//if the hashmap does not contain x(the current string element being handled)
			if(!(bsgHM.containsKey(x)))
			{
				//then map x with value 1
				bsgHM.put(x,1);
			}
			//if it does contain x
			else 
			{
				//then map x with a value that's 1 higher than what it was prior 
				//by getting it's previous value and adding 1
				bsgHM.put(x, bsgHM.get(x)+1);
			}
		}
		
		return bsgHM;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
						
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		
		//I know I can use a regex to pick out vowels and consonant groups, 
		//so i would use patter.compile to pick out those patterns
		Pattern aeiou = Pattern.compile("^([aeiou])");
		Pattern cons = Pattern.compile("([qu]+|[^aeiouy]+|y(?=[aeiou]))");
		
		//I want to create a new string that I can add to, so I created str2
		String str2 = "";
		
		//I can use this enhance for loop to iterate through an array 
		//split by spaced
		for(String x : string.split(" ")) 
		{
			//here i want to say that if the word begins with a vowel
			//throw the word into str2 
			if(aeiou.matcher(x).find()) 
			{
				str2 += x;
			}
			//if it begins with a consonant, throw the consonant to the end of the word
			//bring the rest of the word to the beginning
			else 
			{
				Matcher match = cons.matcher(x);
				if(match.find())
				str2 += x.substring(match.end()) + match.group();	
			}
			
			//and here i would say, take str2 and add "ay"
			str2 = str2 + "ay "; 
		}
		
		
		//-1 gets rid of the last space
		return str2.substring(0,str2.length()-1);
		
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		
		String given = Integer.toString(input);
				
		char[] given2 = given.toCharArray();
		
		int power = given2.length;
		
		int sumInput = 0;
		
		for(int i = 0; i < given2.length; i++) 
		{
			int digit = Character.getNumericValue(given2[i]);
			sumInput += Math.pow(digit, power);	
		}
		
		if(sumInput == input) 
		{
			return true;
		}
		
			return false;
		
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		
		
		
		// creating a list of type long and setting it equal to a new array list of type long
		List<Long> primeNums = new ArrayList<Long>();
		//standard for loop with a long variable instead of int
		for(long i = 2; i<= l; i++) 
		{
			//a while loop to loop through as long as the modulus comes out to 0
			while(l % i == 0) 
			{
				//if the modulus of i come out to 0, then add to the list
				primeNums.add(i);
				//same as l = l/i
				l /= i;
			}
		}
		
		return primeNums;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		return 0;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			
			String string2 = string.replaceAll("[\\,\\.]+", " ").toLowerCase();
			String translation = "";
			String [] strArr = string2.split(" ");
			Map<Integer, Character> map1 = new HashMap<>();
		
			map1.put(1, 'a');
			map1.put(2, 'b');
			map1.put(3, 'c');
			map1.put(4, 'd');
			map1.put(5, 'e');
			map1.put(6, 'f');
			map1.put(7, 'g');
			map1.put(8, 'h');
			map1.put(9, 'i');
			map1.put(10, 'j');
			map1.put(11, 'k');
			map1.put(12, 'l');
			map1.put(13, 'm');
			map1.put(14, 'n');
			map1.put(15, 'o');
			map1.put(16, 'p');
			map1.put(17, 'q');
			map1.put(18, 'r');
			map1.put(19, 's');
			map1.put(20, 't');
			map1.put(21, 'u');
			map1.put(22, 'v');
			map1.put(23, 'w');
			map1.put(24, 'x');
			map1.put(25, 'y');
			map1.put(26, 'z');
			
			for(int i = 0; i < strArr.length; i++) 
			{
				char [] charArr = strArr[i].toCharArray();
				for(int j = 0; j<charArr.length; j++) 
				{	
					char letter = charArr[j];
					
					if(Character.isDigit(charArr[j])) 
					{
						translation += charArr[j];
					}
					switch(letter) 
					{
						case 'a':
							translation += map1.get(26);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'b':
							translation += map1.get(25);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'c':
							translation += map1.get(24);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'd':
							translation += map1.get(23);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'e':
							translation += map1.get(22);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'f':
							translation += map1.get(21);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'g':
							translation += map1.get(20);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'h':
							translation += map1.get(19);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'i':
							translation += map1.get(18);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'j':
							translation += map1.get(17);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'k':
							translation += map1.get(16);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'l':
							translation += map1.get(15);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'm':
							translation += map1.get(14);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'n':
							translation += map1.get(13);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'o':
							translation += map1.get(12);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'p':
							translation += map1.get(11);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'q':
							translation += map1.get(10);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'r':
							translation += map1.get(9);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 's':
							translation += map1.get(8);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 't':
							translation += map1.get(7);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'u':
							translation += map1.get(6);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'v':
							translation += map1.get(5);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'w':
							translation += map1.get(4);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'x':
							translation += map1.get(3);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'y':
							translation += map1.get(2);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
						case 'z':
							translation += map1.get(1);
							if(j==charArr.length-1) 
							{
								translation += " ";
							}
							break;
					}
					
				}
			
				
			}
			String translation2 = translation.replace(" ", "");
			String trans3 = translation2.replaceAll(".....(?!$)", "$0 ");
			
			return trans3;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			String decode = "";
			String noSpace = string.replaceAll(" ", "");
			char [] givenArr = noSpace.toCharArray();
			
			Map<Integer, Character> map2 = new HashMap<>();
			
			map2.put(1, 'a');
			map2.put(2, 'b');
			map2.put(3, 'c');
			map2.put(4, 'd');
			map2.put(5, 'e');
			map2.put(6, 'f');
			map2.put(7, 'g');
			map2.put(8, 'h');
			map2.put(9, 'i');
			map2.put(10, 'j');
			map2.put(11, 'k');
			map2.put(12, 'l');
			map2.put(13, 'm');
			map2.put(14, 'n');
			map2.put(15, 'o');
			map2.put(16, 'p');
			map2.put(17, 'q');
			map2.put(18, 'r');
			map2.put(19, 's');
			map2.put(20, 't');
			map2.put(21, 'u');
			map2.put(22, 'v');
			map2.put(23, 'w');
			map2.put(24, 'x');
			map2.put(25, 'y');
			map2.put(26, 'z');
			
			for(int i = 0; i <givenArr.length; i++) 
			{
				char letter = givenArr[i];
				
				if(Character.isDigit(givenArr[i])) 
				{
					decode += givenArr[i];
				}
				switch(letter) 
				{
					case 'a':
						decode += map2.get(26);
						break;
					case 'b':
						decode += map2.get(25);
						break;
					case 'c':
						decode += map2.get(24);
						break;
					case 'd':
						decode += map2.get(23);
						break;
					case 'e':
						decode += map2.get(22);
						break;
					case 'f':
						decode += map2.get(21);
						break;
					case 'g':
						decode += map2.get(20);
						break;
					case 'h':
						decode += map2.get(19);
						break;
					case 'i':
						decode += map2.get(18);
						break;
					case 'j':
						decode += map2.get(17);
						break;
					case 'k':
						decode += map2.get(16);
						break;
					case 'l':
						decode += map2.get(15);
						break;
					case 'm':
						decode += map2.get(14);
						break;
					case 'n':
						decode += map2.get(13);
						break;
					case 'o':
						decode += map2.get(12);
						break;
					case 'p':
						decode += map2.get(11);
						break;
					case 'q':
						decode += map2.get(10);
						break;
					case 'r':
						decode += map2.get(9);
						break;
					case 's':
						decode += map2.get(8);
						break;
					case 't':
						decode += map2.get(7);
						break;
					case 'u':
						decode += map2.get(6);
						break;
					case 'v':
						decode += map2.get(5);
						break;
					case 'w':
						decode += map2.get(4);
						break;
					case 'x':
						decode += map2.get(3);
						break;
					case 'y':
						decode += map2.get(2);
						break;
					case 'z':
						decode += map2.get(1);
						break;
				}
			}
			
			
			return decode;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		//Takes the given string and removes all hyphens
		String strGiven = string.replaceAll("[\\-]", "");
		int result = 0;
		boolean testResult = false;
		//j represents the first index of the string, this will decrease by one
		//every time we iterate a string index
		//this will equal our 10 - 1
		int j = 10;
		
		//iterate the strGiven
		for(int i = 0; i < strGiven.length(); i++) 
		{	
			//if the character being iterated's numerical value is a character
			if(((Character.getNumericValue(strGiven.charAt(i))<=9))) 
			{	
				//multiply that value by j which at each iteration will decrease by 1
				//to give the 10, 9, 8, 7, 6, etc...
				result += Character.getNumericValue(strGiven.charAt(i)) * j;
			}
			//if the character is X
			else if(strGiven.charAt(i)=='X') 
			{
				//result + 10... this works because in the tests, X only appears in the end
				result += 10;
			}
			//reduces the multiplier by one at each iteration
			j--;
		}
		if(result%11==0)
		{
			testResult = true;
		}
		else 
		{
			testResult = false;
		}
		return testResult;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		
		//creating 2 hashmaps called map1 and map2
		Map<Integer, Character> map1 = new HashMap<>();
		Map<Integer, Character> map2 = new HashMap<>();
		
		//fill map1 with all characters mapped to corresponding key
		map1.put(1, 'a');
		map1.put(2, 'b');
		map1.put(3, 'c');
		map1.put(4, 'd');
		map1.put(5, 'e');
		map1.put(6, 'f');
		map1.put(7, 'g');
		map1.put(8, 'h');
		map1.put(9, 'i');
		map1.put(10, 'j');
		map1.put(11, 'k');
		map1.put(12, 'l');
		map1.put(13, 'm');
		map1.put(14, 'n');
		map1.put(15, 'o');
		map1.put(16, 'p');
		map1.put(17, 'q');
		map1.put(18, 'r');
		map1.put(19, 's');
		map1.put(20, 't');
		map1.put(21, 'u');
		map1.put(22, 'v');
		map1.put(23, 'w');
		map1.put(24, 'x');
		map1.put(25, 'y');
		map1.put(26, 'z');
		
		//send given string to a character array
		char [] phrase = string.toCharArray();
		
		//standard for loop iterates the given string as an array
		for(int i = 0; i < phrase.length; i++) 
		{
			//calls the element at index i a 'letter'
			char letter = phrase[i];
			//switching on the letter at index i
			switch(letter) 
			{
				//if map 2 does not contain key1, then add 'a' to 1
				//if it does, then break
				//doing this for all letters in the given string
				case 'a':
					if(!(map2.containsKey(1))) 
					{
						map2.put(1, 'a');
					}
					break;
				case 'b':
					if(!(map2.containsKey(2))) 
					{
						map2.put(2, 'b');
					}
					break;
				case 'c':
					if(!(map2.containsKey(3))) 
					{
						map2.put(3, 'c');
					}
					break;
				case 'd':
					if(!(map2.containsKey(4))) 
					{
						map2.put(4, 'd');
					}
					break;
				case 'e':
					if(!(map2.containsKey(5))) 
					{
						map2.put(5, 'e');
					}
					break;
				case 'f':
					if(!(map2.containsKey(6))) 
					{
						map2.put(6, 'f');
					}
					break;
				case 'g':
					if(!(map2.containsKey(7))) 
					{
						map2.put(7, 'g');
					}
					break;
				case 'h':
					if(!(map2.containsKey(8))) 
					{
						map2.put(8, 'h');
					}
					break;
				case 'i':
					if(!(map2.containsKey(9))) 
					{
						map2.put(9, 'i');
					}
					break;
				case 'j':
					if(!(map2.containsKey(10))) 
					{
						map2.put(10, 'j');
					}
					break;
				case 'k':
					if(!(map2.containsKey(11))) 
					{
						map2.put(11, 'k');
					}
					break;
				case 'l':
					if(!(map2.containsKey(12))) 
					{
						map2.put(12, 'l');
					}
					break;
				case 'm':
					if(!(map2.containsKey(13))) 
					{
						map2.put(13, 'm');
					}
					break;
				case 'n':
					if(!(map2.containsKey(14))) 
					{
						map2.put(14, 'n');
					}
					break;
				case 'o':
					if(!(map2.containsKey(15))) 
					{
						map2.put(15, 'o');
					}
					break;
				case 'p':
					if(!(map2.containsKey(16))) 
					{
						map2.put(16, 'p');
					}
					break;
				case 'q':
					if(!(map2.containsKey(17))) 
					{
						map2.put(17, 'q');
					}
					break;
				case 'r':
					if(!(map2.containsKey(18))) 
					{
						map2.put(18, 'r');
					}
					break;
				case 's':
					if(!(map2.containsKey(19))) 
					{
						map2.put(19, 's');
					}
					break;
				case 't':
					if(!(map2.containsKey(20))) 
					{
						map2.put(20, 't');
					}
					break;
				case 'u':
					if(!(map2.containsKey(21))) 
					{
						map2.put(21, 'u');
					}
					break;
				case 'v':
					if(!(map2.containsKey(22))) 
					{
						map2.put(22, 'v');
					}
					break;
				case 'w':
					if(!(map2.containsKey(23))) 
					{
						map2.put(23, 'w');
					}
					break;
				case 'x':
					if(!(map2.containsKey(24))) 
					{
						map2.put(24, 'x');
					}
					break;
				case 'y':
					if(!(map2.containsKey(25))) 
					{
						map2.put(25, 'y');
					}
					break;
				case 'z':
					if(!(map2.containsKey(26))) 
					{
						map2.put(26, 'z');
					}
					break;
			}
			
		}
		//at this point, if a phrase contained all letters in the alphabet
		//map1 will be the same as map2
		//.equals will compare the values of two maps
		if(map1.equals(map2)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		try {
			
		LocalDateTime date = LocalDateTime.parse(given.toString());
		return date.plusSeconds(1000000000);
		
		} catch(Exception e) {
		LocalDate today = LocalDate.parse(given.toString());
		
		LocalDateTime now = today.atTime(0,0,0);
		
		return now.plusSeconds(1000000000);
		
		}
		
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		return 0;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		//takes out all non numerical characters, including spaces
		String numsOnly = string.replaceAll("[\\s]", "");
		//used to reverse a the given string
		//this will make it easier to iterate through the for loop at every second character
		//from the right
		StringBuilder reverser = new StringBuilder();
		//.append adds the numsOnly string to the string builder
		reverser.append(numsOnly);
		//reverser, the string builder w given numsOnly string is now reversed using
		//the .reverse method
		reverser = reverser.reverse();
		//create a new string of the reversed string
		String reversed = reverser.toString();
		//setting two integers called total, where we will get the sum at the end of doubling
		//and adding operations and mod, where we will set to our modulus
		
		int total = 0;
		int mod = 0;
		
		//if the entry contains a dash, this will automatically mark the number
		//as invalid
		if(reversed.contains("-")) {
			return false;
		}
		else {
		//iterating reversed string starting at first index, then updating to every other
		//these are the first, third, fifth, and so on...
		//these do not get doubled, so they are just added to the total
		for(int i = 0; i < reversed.length(); i = i+2) 
		{
			int x = Character.getNumericValue(reversed.charAt(i));
			total += x;
		}
		
		//iterating reversed string starting at the second index, then updating to every other
		//these are the second, fourth, sixth, and so on...
		//these get doubled, and if the double is greater than 9, go through an additional
		//function to find the integer that will get added to total
		for(int i = 1; i < reversed.length(); i=i+2 ) 
		{
			int x = Character.getNumericValue(reversed.charAt(i));
			int dubX = x*2;
			if(dubX > 9) 
			{
				int newX = dubX - 9;
				total += newX;
			}
			else
			{
				total += dubX;
			}
			
		}
		//using the modulus function on our total will tell us if there is a remainder
		mod = total%10;
		
		//if the modulus equals 0, then the number is divisible by ten, therefore valid
		if(mod==0) 
		{
			return true;
		}
		
		//if the modulus is not equal to 0, then the number is not divisible by ten
		//therefore, the number is invalid
		else
		{
			return false;
		}
		
		}	
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		String string2 = string.replace("?", " ");
		String [] problem = string2.split(" ");
		
		int a = Integer.parseInt(problem[2]);
		int b = Integer.parseInt(problem[problem.length-1]);
		int answer = 0;
		
		
		
		if(string.contains("plus")) 
		{
			answer = a + b;
		}
		else if(string.contains("minus")) 
		{
			answer = a - b;
		}
		else if(string.contains("multiplied")) 
		{
			answer = a * b;
		}
		else if(string.contains("divided")) 
		{
			answer = a / b;
		}
	
		
		return answer;
	}

}
