package com.javapehaa;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
		int arrayIn[] = {  2, 10,  4,  6,  8 };
		assertEquals(true, Pehaa.checkIfAllElementsPair(arrayIn) );
		int arrayIn1[] = {  2, 10, 4,  6,  8, 7 };
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

}
