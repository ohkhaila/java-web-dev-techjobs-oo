package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job carpenter;
    Job librarian;
    Job productTester;
    Job falseEqualJob1;
    Job falseEqualJob2;
    @Before
    public void newJobs() {
        carpenter = new Job();
        librarian = new Job("librarian", new Employer("SLPS"), new Location("Stl"), new PositionType("Education"), new CoreCompetency("children") );
        productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        falseEqualJob1 = new Job("Unicorn Dev with no work life balance", new Employer("Drain a Dev"), new Location("burnt out town"), new PositionType("IT"), new CoreCompetency("Overworking"));
        falseEqualJob2 = new Job("Unicorn Dev with no work life balance", new Employer("Drain a Dev"), new Location("burnt out town"), new PositionType("IT"), new CoreCompetency("Overworking"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals((carpenter.getId()+ 1), librarian.getId());
    }

    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(productTester.getEmployer() instanceof Employer);
        assertTrue(productTester.getLocation() instanceof Location);
        assertTrue(productTester.getPositionType() instanceof PositionType);
        assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", productTester.getName());
        assertEquals("ACME", productTester.getEmployer().getValue());
        assertEquals("Desert", productTester.getLocation().getValue());
        assertEquals("Quality control", productTester.getPositionType().getValue());
        assertEquals("Persistence", productTester.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(falseEqualJob1.equals(falseEqualJob2));
    }

    @Test
    public void testToStringStartsWithSpace(){
        String testString =
                "ID:" + librarian.getId() + "\n" +
                "Name:'" + librarian.getName() + '\'' + "\n" +
                "Employer:" + librarian.getEmployer().getValue() + "\n" +
                "Location:" + librarian.getLocation().getValue() + "\n" +
                "Position Type:" + librarian.getPositionType().getValue() + "\n" +
                "Core Competency:" + librarian.getCoreCompetency().getValue() + "\n";

        assertEquals(testString, librarian.toString());
    }
}
