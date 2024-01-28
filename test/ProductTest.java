import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProductTest {
    //creates two products
    private Product p1;
    private Product p2;

    //sets up the test
    @BeforeEach
    void setUp() {
        p1 = new  Product("000003", "Water skin", "Pouch of water ", 20.00);
        p2 = new  Product("000004", "Sword", "A sharp blade", 100.00);
    }

    //test to see if the name is not equal to the name of the product
    @Test
    void setName() {
        p1.setName("Test Name");
        assertEquals("Test Name", p1.getName());
    }

    //test to see if the description is not equal to the description of the product
    @Test
    void setDescription() {
        p1.setDescription("water pouch");
        assertEquals("water pouch", p1.getDescription());
    }

    //test to see if the cost is not equal to the cost of the product
    @Test
    void setCost() {
        p1.setCost(35.00);
        assertEquals(35.00,p1.getCost());
    }

}