import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Joe Bloggs", "JJ123456D", 20000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Bloggs", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("JJ123456D", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(200.00);
        assertEquals(20200.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200.00, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        databaseAdmin.raiseSalary(-200.00);
        assertEquals(20000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Jane Bloggs");
        assertEquals("Jane Bloggs", databaseAdmin.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        databaseAdmin.setName(null);
        assertEquals("Joe Bloggs", databaseAdmin.getName());
    }

}