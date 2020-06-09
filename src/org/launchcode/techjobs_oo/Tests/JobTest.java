package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {
    Job carpenter;
    Job librarian;
    @Before
    public void newJobs() {
        carpenter = new Job();
        librarian = new Job();
    }
    @Test
    public void testSettingJobId(){
        assertEquals((carpenter.getId()+ 1), librarian.getId());
    }

    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

}
