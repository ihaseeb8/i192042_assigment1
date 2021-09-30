import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StackWithLinkedListTest {

    static StackWithLinkedList stack = new StackWithLinkedList();

    @org.junit.jupiter.api.Test
    @Order(1)
    void push() {
        stack.push(7);
        assertEquals(stack.head.key,7);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void top() {
        assertEquals(stack.top() , 7);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void pop() {
        stack.pop();
        assertNull(stack.head);
    }

    @org.junit.jupiter.api.Test
    @Order(4)
    void display() {
        stack.display();
    }

    @org.junit.jupiter.api.Test
    @Order(5)
    void getSize() {
        assertEquals(stack.getSize(),0);
    }
}