import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StackWithArrayTest {

    static StackWithArray stack = new StackWithArray();

    @org.junit.jupiter.api.Test
    @Order(1)
    void push() {
        stack.push(9);
        assertEquals(stack.array[0] , 9);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void pop() {
        stack.pop();
        assertEquals(stack.size , 0);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void display() {
        stack.display();
    }

}