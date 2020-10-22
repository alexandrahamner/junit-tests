import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortOfOne;
    Cohort cohortOfMany;

    @Test
    public void testAddStudent(){
        cohortOfOne = new Cohort();
        emptyCohort = new Cohort();

        cohortOfOne.addStudent(new Student(12L, "Luna"));

        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortOfOne.getStudents().size());
    }

    @Test
    public void testGetStudents(){
        cohortOfOne = new Cohort();
        cohortOfMany = new Cohort();

        cohortOfOne.addStudent(new Student(12L, "Luna"));
        cohortOfMany.addStudent(new Student(13L, "Andrew"));
        cohortOfMany.addStudent(new Student(14L, "Rob"));
        cohortOfMany.addStudent(new Student(15L, "Liz"));

        assertEquals("Liz", cohortOfMany.getStudents().get(2).getName());
        assertEquals("Luna", cohortOfOne.getStudents().get(0).getName());
    }
}
