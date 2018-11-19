import org.junit.Before;
import org.junit.Test;
import Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Joe Bloggs", "JJ123456B", 50000.00, "Management");
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Bloggs", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("JJ123456B", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void getDeptName() {
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500.00);
        assertEquals(50500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500.00, manager.payBonus(), 0.01);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        manager.raiseSalary(-500.00);
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.setName("Jane Bloggs");
        assertEquals("Jane Bloggs", manager.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        manager.setName(null);
        assertEquals("Joe Bloggs", manager.getName());
    }


}