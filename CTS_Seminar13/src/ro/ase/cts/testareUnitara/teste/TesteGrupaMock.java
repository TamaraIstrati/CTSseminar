package ro.ase.cts.testareUnitara.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.testareUnitara.clase.Grupa;
import ro.ase.cts.testareUnitara.clase.IStudent;
import ro.ase.cts.testareUnitara.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.testareUnitara.teste.categorii.TesteUrgenteCategory;
import ro.ase.cts.testareUnitara.teste.mocks.DummyStudent;
import ro.ase.cts.testareUnitara.teste.mocks.FakeStudent;
import ro.ase.cts.testareUnitara.teste.mocks.StubStudent;

public class TesteGrupaMock {

	@Test
	@Category(TesteUrgenteCategory.class)
	public void testAdaugaStudent() {
		IStudent student = new DummyStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		assertEquals("Adaugare student", 1, grupa.getStudenti().size()); 
	}

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitate() {
		IStudent student = new StubStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<8; i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<2; i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(), 0.001);
	}
}
