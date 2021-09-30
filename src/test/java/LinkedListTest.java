import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LinkedListTest {

    static LinkedList list = new LinkedList();

    @org.junit.jupiter.api.Test
    @Order(1)
    void pushFront() {
        list.pushFront(2);
        list.pushFront(11);
        assertEquals(list.head.key , 11);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void pushBack() {
        list.pushBack(13);
        assertEquals(list.head.next.next.key , 13);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void popFront() {
        list.popFront();
        assertEquals(list.head.key , 2);
    }

    @org.junit.jupiter.api.Test
    @Order(4)
    void popBack() {
        list.popBack();
        assertNull(list.head.next);
    }

    @org.junit.jupiter.api.Test
    @Order(5)
    void pop() {
        list.pop(0);
        assertNull(list.head);
    }

    @org.junit.jupiter.api.Test
    @Order(6)
    void display() {
        list.display();
    }
}