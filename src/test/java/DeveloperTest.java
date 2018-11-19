import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Joe Bloggs", "JJ123456C", 35000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Bloggs", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("JJ123456C", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(350.00);
        assertEquals(35350.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350.00, developer.payBonus(), 0.01);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        developer.raiseSalary(-350.00);
        assertEquals(35000, developer.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        developer.setName("Jane Bloggs");
        assertEquals("Jane Bloggs", developer.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        developer.setName(null);
        assertEquals("Joe Bloggs", developer.getName());
    }

}