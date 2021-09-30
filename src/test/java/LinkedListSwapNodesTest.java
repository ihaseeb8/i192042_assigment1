import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LinkedListSwapNodesTest {

    public static LinkedListSwapNodes list= new LinkedListSwapNodes();

    @org.junit.jupiter.api.Test
    @Order(1)
    void pushFront() {
        list.pushFront(6);
        assertEquals(list.head.key , 6);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void pushBack() {
        list.pushBack(7);
        assertEquals(list.head.next.key , 7);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void swap() {
        list.swap();
        assertEquals(list.head.key , 7);
        assertEquals(list.head.next.key , 6);
    }

    @org.junit.jupiter.api.Test
    void display() {
        list.display();
    }
}