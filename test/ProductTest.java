import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProductTest {
    private Product p1;
    private Product p2;

    @BeforeEach
    void setUp() {
        p1 = new  Product("000003", "Water skin", "Pouch of water ", 20.00);
        p2 = new  Product("000004", "Sword", "A sharp blade", 100.00);
    }

    @Test
    void setName() {
        p1.setName("Test Name");
        assertEquals("Test Name", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("Ur mom");
        assertEquals("Ur mom", p1.getDescription());
    }

    @Test
    void setCost() {
        p1.setCost(90.09);
        assertEquals(90.09,p1.getCost());
    }

}