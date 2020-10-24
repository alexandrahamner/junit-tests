import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortOfOne;
    Cohort cohortOfMany;

    @Before
    public void setUp(){
        cohortOfOne = new Cohort();
        emptyCohort = new Cohort();
        cohortOfMany = new Cohort();

        Student luna = new Student(12L, "Luna");
        Student andrew = new Student(13L, "Andrew");
        Student rob = new Student(14L, "Rob");
        Student liz = new Student(15L, "Liz");

        cohortOfOne.addStudent(luna);

        cohortOfMany.addStudent(andrew);
        cohortOfMany.addStudent(rob);
        cohortOfMany.addStudent(liz);

        andrew.addGrade(70);
        andrew.addGrade(70);
        rob.addGrade(90);
        rob.addGrade(90);
        liz.addGrade(80);
        liz.addGrade(80);

    }

    @Test
    public void testAddStudent(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortOfOne.getStudents().size());
    }

    @Test
    public void testGetStudents(){
        assertEquals("Liz", cohortOfMany.getStudents().get(2).getName());
        assertEquals("Luna", cohortOfOne.getStudents().get(0).getName());
    }

    @Test
    public void testGetCohortAverage(){
        assertEquals(80, cohortOfMany.getCohortAverage(), 0);

    }
}
