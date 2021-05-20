package ro.ase.cts.testareUnitara.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.testareUnitara.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Costica";
		Student student = new Student(nume);
		
		assertEquals("Nume neinitializat" ,nume, student.getNume());
		assertNotNull("Note neinitializat", student.getNote());
	}

	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();
		
		assertNotNull(student.getNume());
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAdaugaNotaSingura() {
		//regula 0, 1, n poate f aplicata
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(9);
		student.adaugaNota(9);
		
		assertEquals(3, student.getNote().size());
	}
	
	//regula 0, 1, n
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(10);
		student.adaugaNota(8);
		
		assertEquals(9f, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student();
		student.adaugaNota(8);
		assertEquals(8, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(6);
		assertFalse(student.areRestante());
	}
	
	//EXCEPTII
	
	@Test
	public void testGetNotaExceptie() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(6);
		
		try {
			student.getNota(4);
			fail("Exceptia nu a fost aruncata.");
		} catch (IndexOutOfBoundsException e) {
			
		} catch (Exception e) {
			fail("Exceptia nu a fost aruncata.");
		}
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaExceptieV4() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(6);
		
		student.getNota(4);
	}
	
	@Test
	public void testGetNotaExceptieV5() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(6);
		
		assertThrows(IndexOutOfBoundsException.class, () -> {
			student.getNota(5);
		});
	}
}
