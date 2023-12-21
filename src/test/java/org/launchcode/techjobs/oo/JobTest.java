package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

  @Test
  public void testSettingJobId(){
    // create job1 object
      Job job1 =new Job();
      //create  job2 object
      Job job2 =new Job();
      //match job1 id with job2 id to make sure they are not equal
      assertNotEquals(job1.getId(),job2.getId());
  }
  @Test
  public void testJobConstructorSetsAllFields(){
    // create job objects with all fields
    Job job1 =new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //check job1 is an instance of job class
    assertTrue(job1 instanceof Job);
    //check the values matches with the job object's initialization given above
    assertEquals("ACME",job1.getEmployer().getValue());
    assertEquals("Desert",job1.getLocation().getValue());
    assertEquals("Quality control",job1.getPositionType().getValue());
    assertEquals("Persistence",job1.getCoreCompetency().getValue());
  }
  @Test
  public void testToStringStartsAndEndsWithNewLine(){
    // create job1 object
    Job job1 =new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    // starts with \n
    assertTrue(job1.toString().startsWith("\n"));
    //ends with \n
    assertTrue(job1.toString().endsWith("\n"));
  }
  public void testToStringContainsCorrectLabelsAndData(){
    // create job1 object
    Job job1 =new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //use stringbuilder to create expected string with \n and all data labels and values, instead of using + i am using string builder
    StringBuilder expected =new StringBuilder().append("\n").append("ID: ").append(job1.getId()).append("\n").append("Name: ").
            append(job1.getName()).append("\n").append("Employer: ").append(job1.getEmployer().getValue()).append("\n").
            append("Location: ").append(job1.getLocation().getValue()).append("\n").append("Position Type: ").append(job1.getPositionType().getValue()).append("\n").
            append("Core Competency: ").append(job1.getCoreCompetency().getValue()).append("\n");
    //expected.tostring matches with job1.tostring
    assertEquals(expected.toString(),job1.toString());
  }
  public void testToStringHandlesEmptyField(){
    // create job1 object with empty employer and location
    Job job1 =new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    StringBuilder expected =new StringBuilder().append("\n").append("ID: ").append(job1.getId()).append("\n").append("Name: ").
            append(job1.getName()).append("\n").append("Employer: ").append(job1.getEmployer().getValue()).append("\n").
            append("Location: ").append(job1.getLocation().getValue()).append("\n").append("Position Type: ").append(job1.getPositionType().getValue()).append("\n").
            append("Core Competency: ").append(job1.getCoreCompetency().getValue()).append("\n");

    assertEquals(expected.toString(),job1.toString());

  }
  public void testJobsForEquality(){
    //create two job objects and check there id are not matching
    Job job1 =new Job();
    Job job2 =new Job();
    assertNotEquals(job1.getId(),job2.getId());

  }
}
