import org.junit.Before;
import org.junit.Test;
import Management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Joe Bloggs", "JJ123456A", 90000.00, "Directorship", 1000000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Bloggs", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("JJ123456A", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(90000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1800.00);
        assertEquals(91800.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1800.00, director.payBonus(), 0.01);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        director.raiseSalary(-1800.00);
        assertEquals(90000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        director.setName("Jane Bloggs");
        assertEquals("Jane Bloggs", director.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        director.setName(null);
        assertEquals("Joe Bloggs", director.getName());
    }

}