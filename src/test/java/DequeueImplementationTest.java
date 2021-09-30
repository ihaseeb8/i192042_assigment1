import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DequeueImplementationTest {

    static DequeueImplementation deque = new DequeueImplementation(10);

    @org.junit.jupiter.api.Test
    @Order(1)
    void addLeft() {
        deque.addLeft(5);
        assertEquals(deque.array[0],5);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void addRight() {
        deque.addRight(11);
        assertEquals(deque.array[9] , 11);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void display() {
        deque.display();
    }
}