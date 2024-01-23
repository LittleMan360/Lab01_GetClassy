import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest
{
    private Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp()
    {
        p1 = new Person("000001", "John", "Tester1", "Sr.", 1965);
        p2 = new Person("000002", "Stew", "Tester2", "Mr.", 2000);
        p3 = new Person("000003", "Kelsey", "Tester3", "Ms.", 1996);
        p4 = new Person("000004", "James", "Tester4", "Esq.", 1975);
        p5 = new Person("000005", "Stephen", "Tester5", "Jr.", 1971);
        p6 = new Person("000006", "Dalton", "Tester6", "Sr.", 2000);
    }


    @Test
    void setID()
    {
        p1.setID("000001");
        assertEquals("000001", p1.getID());
    }

    @Test
    void setFirstName()
    {
        p1.setFirstName("John");
        assertEquals("John", p1.getFirstName());
    }

    @Test
    void setLastName()
    {
        p1.setLastName("Tester1");
        assertEquals("Tester1", p1.getLastName());
    }

    @Test
    void setTitle()
    {
        p2.setTitle("Mr.");
        assertEquals("Mr.", p2.getTitle());
    }

    @Test
    void setYOB()
    {
        p3.setYOB(1996);
        assertEquals(1996, p3.getYOB());
    }



}
