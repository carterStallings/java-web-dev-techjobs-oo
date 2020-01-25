package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_jobOne;
    Job test_jobTwo;
    Employer employerThree = new Employer("ACME");
    Location locationThree = new Location("Desert");
    PositionType positionThree = new PositionType("Quality control");
    CoreCompetency competencyThree = new CoreCompetency("Persistence");
    Job test_jobThree = new Job("Product tester", employerThree, locationThree, positionThree, competencyThree);

    Employer employerFour = new Employer("Dell");
    Location locationFour = new Location("City");
    PositionType positionFour = new PositionType("Engineer");
    CoreCompetency competencyFour = new CoreCompetency("Technical skills");
    Job test_jobFour = new Job("Software Engineer", employerFour, locationFour, positionFour, competencyFour);

    Employer employerFive = new Employer("Dell");
    Location locationFive = new Location("City");
    PositionType positionFive = new PositionType("Engineer");
    CoreCompetency competencyFive = new CoreCompetency("Technical skills");
    Job test_jobFive = new Job("Software Engineer", employerFive, locationFive, positionFive, competencyFive);

    Employer employerSix = new Employer("Dell");
    Location locationSix = new Location("City");
    PositionType positionSix = new PositionType("");
    CoreCompetency competencySix = new CoreCompetency("Technical skills");
    Job test_jobSix = new Job("Software Engineer", employerSix, locationSix, positionSix, competencySix);

    @Before
    public void createJobObjectOne() {
        test_jobOne = new Job();
    }

    @Before
    public void createJobObjectTwo() {
        test_jobTwo = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertTrue((test_jobOne.getId() - test_jobTwo.getId()) == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(test_jobThree.getName(), "Product tester");
        assertEquals(test_jobThree.getEmployer(), employerThree);
        assertEquals(test_jobThree.getLocation(), locationThree);
        assertEquals(test_jobThree.getPositionType(), positionThree);
        assertEquals(test_jobThree.getCoreCompetency(), competencyThree);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_jobFour.equals(test_jobFive));
    }

    @Test
    public void blankLine() {
        assertTrue(test_jobFour.toString().startsWith("\n") && test_jobFour.toString().endsWith("\n"));
    }

    @Test
    public void getsData() {
        assertEquals(test_jobFour.toString(), "\n" + "ID: "+ test_jobFour.getId() + "\n" +
                "Name: "+ test_jobFour.getName() + "\n" +
                "Employer: "+ test_jobFour.getEmployer() + "\n" +
                "Location: "+ test_jobFour.getLocation() + "\n" +
                "Position Type: "+ test_jobFour.getPositionType() + "\n" +
                "Core Competency: " + test_jobFour.getCoreCompetency() + "\n");
    }

    @Test
    public void emptyField() {
        String output = ("\n" + "ID: "+ test_jobSix.getId() + "\n" +
                "Name: "+ test_jobSix.getName() + "\n" +
                "Employer: "+ test_jobSix.getEmployer() + "\n" +
                "Location: "+ test_jobSix.getLocation() + "\n" +
                "Position Type: "+ "Data not available" + "\n" +
                "Core Competency: " + test_jobSix.getCoreCompetency() + "\n");
        assertEquals(output, test_jobSix.toString());
    }
}
