package com.javapehaa;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.javapehaa.Pehaa;

public class PehaaTest {

	static Pehaa pehaa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pehaa = new Pehaa();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void checkIfPair() {
		assertEquals(true, Pehaa.checkIfPair(10));
		assertEquals(false, Pehaa.checkIfPair(21));
	}
	
	@Test
	public void checkIfPairPairImpair() {
		assertEquals(false, Pehaa.checkIfPairPairImpair(10, 20, 10));
		assertEquals(false, Pehaa.checkIfPairPairImpair(10, 21, 10));
		assertEquals(false, Pehaa.checkIfPairPairImpair(10, 21, 11));
		assertEquals(false, Pehaa.checkIfPairPairImpair(11, 20, 10));
		assertEquals(false, Pehaa.checkIfPairPairImpair(11, 21, 10));
		assertEquals(false, Pehaa.checkIfPairPairImpair(11, 21, 11));
		assertEquals(true, Pehaa.checkIfPairPairImpair(10, 20, 11));
	}
	
	@Test
	public void checkIfSumIsPair() {
		assertEquals(true, Pehaa.checkIfSumIsPair(10, 20, 10));
		assertEquals(false, Pehaa.checkIfSumIsPair(10, 21, 10));
		assertEquals(true, Pehaa.checkIfSumIsPair(10, 21, 11));
		assertEquals(false, Pehaa.checkIfSumIsPair(11, 20, 10));
		assertEquals(true, Pehaa.checkIfSumIsPair(11, 21, 10));
		assertEquals(false, Pehaa.checkIfSumIsPair(11, 21, 11));
		assertEquals(false, Pehaa.checkIfSumIsPair(10, 20, 11));
	}
	
	@Test
	public void checkIfAllElementsPair() {
		int[] arrayIn = {  2, 10,  4,  6,  8 };
		assertEquals(true, Pehaa.checkIfAllElementsPair(arrayIn) );
		int[] arrayIn1 = {  2, 10, 4,  6,  8, 7 };
		assertEquals(false, Pehaa.checkIfAllElementsPair(arrayIn1) );
	}
	
	@Test
	public void exportAllElementsPair() {
		int arrayIn[] = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(2);
		resultat.add(2);
		resultat.add(0);
		resultat.add(4);
		resultat.add(6);
		resultat.add(8);
		assertEquals(resultat, Pehaa.exportAllElementsPair(arrayIn) );
		int arrayIn1[] = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		assertEquals(resultat1, Pehaa.exportAllElementsPair(arrayIn1) );
	}
	
	@Test
	public void exportAllUniqueElementsPair() {
		int arrayIn[] = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(2);
		resultat.add(0);
		resultat.add(4);
		resultat.add(6);
		resultat.add(8);
		assertEquals(resultat, Pehaa.exportAllUniqueElementsPair(arrayIn) );
		int arrayIn1[] = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		assertEquals(resultat1, Pehaa.exportAllUniqueElementsPair(arrayIn1) );
		int arrayIn2[] = {  2, 3, 2, 0,  4, 4, 6,  6 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(2);
		resultat2.add(0);
		resultat2.add(4);
		resultat2.add(6);
		assertEquals(resultat2, Pehaa.exportAllUniqueElementsPair(arrayIn2) );
	}
	
	@Test
	public void checkIfTriangleRectangle() {
		assertEquals(true, Pehaa.checkIfTriangleRectangle(3, 4, 5));
		assertEquals(true, Pehaa.checkIfTriangleRectangle(5, 4, 3));
		assertEquals(true, Pehaa.checkIfTriangleRectangle(5, 3, 4));
		assertEquals(false, Pehaa.checkIfTriangleRectangle(5, 3, 3));
		
	}
	
	@Test
	public void checkSiTuPeuxAcheter() {
		assertEquals(false, Pehaa.checkSiTuPeuxAcheter(3));
		assertEquals(false, Pehaa.checkSiTuPeuxAcheter(24));
		assertEquals(true, Pehaa.checkSiTuPeuxAcheter(20));
		assertEquals(false, Pehaa.checkSiTuPeuxAcheter(23));
		
	}
	
	@Test
	public void checkCase1() {
		assertEquals(true, Pehaa.checkCase1(30.0, 44));
		assertEquals(true, Pehaa.checkCase1(120.0, 30));
		assertEquals(true, Pehaa.checkCase1(200, 55));
		assertEquals(false, Pehaa.checkCase1(200, 10));
		
	}
	
	@Test
	public void checkCase2() {
		assertEquals(true, Pehaa.checkCase2(13,14));
		assertEquals(true, Pehaa.checkCase2(14,13));
		assertEquals(true, Pehaa.checkCase2(21, 14));
		assertEquals(true, Pehaa.checkCase2(13, 8));		
	}
	
	@Test
	public void checkCase2a() {
		assertEquals(true, Pehaa.checkCase2a(13,14));
		assertEquals(true, Pehaa.checkCase2a(14,13));
		assertEquals(false, Pehaa.checkCase2a(21, 14));
		assertEquals(false, Pehaa.checkCase2a(13, 8));		
	}
	

	@Test
	public void checkCase3() {
		assertEquals(true, Pehaa.checkCase3(13,14,17));
		assertEquals(true, Pehaa.checkCase3(14,13, 10));
		assertEquals(false, Pehaa.checkCase3(21, 14, 15));
		assertEquals(false, Pehaa.checkCase3(5, 13, 8));		
	}
	
	
//	public static boolean checkSiTuPeuxAcheter(int prix) {
//		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
//		return false;
//	}
//	
//	public static boolean checkCase1(double prix, float remise) {
//		// t'as 100 euros, verifie si tu peux acheter l'article solde
//		return false;
//	}
//	
//	public static boolean checkCase2(int number1, int number2) {
//		// check si une (mais pas tous les 2) de 2 chiffres, ou leur somme se divise par 7
//		return false;
//	}
//	
//	public static boolean checkCase3(int number1, int number2, int number3) {
//		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
//		return false;
//	}
	
	@Test
	public void allElementsExceptFirstThree() {
		int arrayIn[] = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(0);
		resultat.add(4);
		resultat.add(11);
		resultat.add(6);
		resultat.add(8);
		assertEquals(resultat, Pehaa.allElementsExceptFirstThree(arrayIn) );
		int arrayIn1[] = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		assertEquals(resultat1, Pehaa.allElementsExceptFirstThree(arrayIn1) );
		int arrayIn2[] = {  2, 3, 2, 0,  4, 4, 6,  6 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(0);
		resultat2.add(4);
		resultat2.add(4);
		resultat2.add(6);
		resultat2.add(6);
		assertEquals(resultat2, Pehaa.allElementsExceptFirstThree(arrayIn2) );
	}
	
	@Test
	public void allElementsExceptFirstAndLast() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(3);
		resultat.add(2);
		resultat.add(0);
		resultat.add(4);
		resultat.add(11);
		resultat.add(6);
		assertEquals(resultat, Pehaa.allElementsExceptFirstAndLast(arrayIn) );
		int[] arrayIn1 = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		resultat1.add(3);
		assertEquals(resultat1, Pehaa.allElementsExceptFirstAndLast(arrayIn1) );
		int[] arrayIn2 = {  2, 3 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		assertEquals(resultat2, Pehaa.allElementsExceptFirstAndLast(arrayIn2) );
	}
	
	@Test
	public void allElementsExceptFirstAndLastInt() {
		int[] arrayIn = {2, 3, 2, 0, 4, 11, 6,  8 };
		int[] arrayOut = {  3, 2, 0, 4, 11, 6 };	
		assertArrayEquals(arrayOut, Pehaa.allElementsExceptFirstAndLastInt(arrayIn) );
		int[] arrayIn1 = {9, 3, 11 };
		int[] arrayOut1 = { 3 };
		assertArrayEquals(arrayOut1, Pehaa.allElementsExceptFirstAndLastInt(arrayIn1) );
		int[] arrayIn2 = { 2, 3 };
		int[] arrayOut2 = {};
		assertArrayEquals(arrayOut2, Pehaa.allElementsExceptFirstAndLastInt(arrayIn2) );
	}
	
	@Test
	public void allElementsWithIndexPair() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(2);
		resultat.add(2);
		resultat.add(4);
		resultat.add(6);
		assertEquals(resultat, Pehaa.allElementsWithIndexPair(arrayIn) );
		int[] arrayIn1 = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		resultat1.add(9);
		resultat1.add(11);
		assertEquals(resultat1, Pehaa.allElementsWithIndexPair(arrayIn1) );
		int[] arrayIn2 = {  2, 3 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(2);
		assertEquals(resultat2, Pehaa.allElementsWithIndexPair(arrayIn2) );
	}
	
	@Test
	public void reverseOrder() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(8);
		resultat.add(6);
		resultat.add(11);
		resultat.add(4);
		resultat.add(0);
		resultat.add(2);
		resultat.add(3);
		resultat.add(2);
		assertEquals(resultat, Pehaa.reverseOrder(arrayIn) );
		int[] arrayIn1 = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		
		resultat1.add(11);
		resultat1.add(3);
		resultat1.add(9);
		assertEquals(resultat1, Pehaa.reverseOrder(arrayIn1) );
		int[] arrayIn2 = {  2, 3 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(3);
		resultat2.add(2);
		assertEquals(resultat2, Pehaa.reverseOrder(arrayIn2) );
	}
	
	@Test
	public void reverseOrderInt() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		int[] arrayOut = {  8,6,11,4,0,2,3,2 };
		
		assertArrayEquals(arrayOut, Pehaa.reverseOrderInt(arrayIn) );
		int[] arrayIn1 = {  9, 3, 11 };
		int[] arrayOut1 = {  11,3,9 };
		assertArrayEquals(arrayOut1, Pehaa.reverseOrderInt(arrayIn1) );
		int[] arrayIn2 = {  2, 3 };
		int[] arrayOut2 = {3,2};
		assertArrayEquals(arrayOut2, Pehaa.reverseOrderInt(arrayIn2) );
	}
	
	@Test
	public void insertElementInTheMiddleOfAnArray() {
		int element = -7;
		int[] arrayIn = {  2, 3, 2, 0, 4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(2);
		resultat.add(3);
		resultat.add(2);
		resultat.add(0);
		resultat.add(element);
		resultat.add(4);
		resultat.add(11);
		resultat.add(6);
		resultat.add(8);
		assertEquals(resultat, Pehaa.insertElementInTheMiddleOfAnArray(arrayIn, element) );
		int[] arrayIn1 = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();		
		resultat1.add(9);
		resultat1.add(element);
		resultat1.add(3);
		resultat1.add(11);
		assertEquals(resultat1, Pehaa.insertElementInTheMiddleOfAnArray(arrayIn1, element) );
		int[] arrayIn2 = {  2, 3 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(2);
		resultat2.add(element);
		resultat2.add(3);
		assertEquals(resultat2, Pehaa.insertElementInTheMiddleOfAnArray(arrayIn2, element) );
	}
	
	
	@Test
	public void exportElementsPair() {
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(2);
		in.add(3);
		in.add(2);
		in.add(0);
		in.add(-7);
		in.add(4);
		in.add(11);
		in.add(6);
		in.add(8);
		ArrayList<Integer> out = new ArrayList<Integer>();
		out.add(2);
		out.add(2);
		out.add(0);
		out.add(4);
		out.add(6);
		out.add(8);
		assertEquals(out, Pehaa.exportElementsPair(in) );
		ArrayList<Integer> in2 = new ArrayList<Integer>();
		in2.add(2);
		in2.add(3);
		ArrayList<Integer> out2 = new ArrayList<Integer>();
		out2.add(2);
		assertEquals(out2, Pehaa.exportElementsPair(in2) );
	}
	
	@Test
	public void exportElementsWithIndexPair() {
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(2);
		in.add(3);
		in.add(2);
		in.add(0);
		in.add(-7);
		in.add(4);
		in.add(11);
		in.add(6);
		in.add(8);
		ArrayList<Integer> out = new ArrayList<Integer>();
		out.add(2);
		out.add(2);
		out.add(-7);
		out.add(11);
		out.add(8);
		assertEquals(out, Pehaa.exportElementsWithIndexPair(in) );
		ArrayList<Integer> in2 = new ArrayList<Integer>();
		in2.add(2);
		in2.add(3);
		ArrayList<Integer> out2 = new ArrayList<Integer>();
		out2.add(2);
		assertEquals(out2, Pehaa.exportElementsWithIndexPair(in2) );
	}
	
	@Test
	public void Addition() {
		
		HashMap<String,Integer> in = new HashMap<String,Integer>();
		in.put("chicken", 22);
		in.put("curry", 18);
		in.put("coffee", 2);
		assertEquals(42, Pehaa.Addition(in) );
	}
	
	@Test
	public void checkIfStringStartsWithA() {
		
		assertEquals(false, Pehaa.checkIfStringStartsWithA( "kuku" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithA( "assert" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithA( "Amour" ) );
	}
	
	@Test
	public void checkIfStringStartsWithVowel() {

		assertEquals(false, Pehaa.checkIfStringStartsWithVowel( "kuku" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "assert" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "Amour" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "ola" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "Ola" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "eoee" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "Ecran" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "ioee" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "Icran" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "ioee" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "Icran" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "utile" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "Utile" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "ygrek" ) );
		assertEquals(true, Pehaa.checkIfStringStartsWithVowel( "YGY" ) );
	}
	
	@Test
	public void checkIfStringEndsWithS() {
		
		assertEquals(false, Pehaa.checkIfStringEndsWithS( "kuku" ) );
		assertEquals(true, Pehaa.checkIfStringEndsWithS( "asserts" ) );
		assertEquals(true, Pehaa.checkIfStringEndsWithS( "AmourS" ) );
	}
	
	@Test
	public void findShortestWord() {
		String[] arrayIn = {  "grrr", "kuku", "la", "ouf",  "mu" };
		assertEquals("la", Pehaa.findShortestWord(arrayIn) );
	}
	
	@Test
	public void swapFirstandLastLetter() {
		
		assertEquals("uukk",Pehaa.swapFirstandLastLetter( "kuku" ) );
		assertEquals("uu",Pehaa.swapFirstandLastLetter( "uu" ) );
		assertEquals("sa",Pehaa.swapFirstandLastLetter( "as" ) );
		assertEquals("eoj",Pehaa.swapFirstandLastLetter( "joe" ) );
	}
	
	@Test
	public void swapFirstandLastElement() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		int[] arrayOut = {  8, 3, 2, 0,  4, 11, 6,  2 };
		assertArrayEquals( arrayOut, Pehaa.swapFirstandLastElement(arrayIn));
		int[] arrayIn1 = {  2, 3, 2, 0,  4, 11, 6,  2 };
		assertArrayEquals( arrayIn1, Pehaa.swapFirstandLastElement(arrayIn1));
		int[] arrayIn2 = {  2 };
		assertArrayEquals( arrayIn2, Pehaa.swapFirstandLastElement(arrayIn2));
	}

}
