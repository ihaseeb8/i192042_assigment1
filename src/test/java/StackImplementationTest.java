import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StackImplementationTest {

    static StackImplementation stack = new StackImplementation(6);
    @org.junit.jupiter.api.Test
    @Order(1)
    void push() {
        try{
            stack.push(21);
            assertEquals(stack.arraytostoreStack[0] , 21);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void top() {
        try{
            assertEquals(stack.top() , 21);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void pop() {
        try{
            assertEquals(stack.pop() , 21);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    @Order(4)
    void size() {
        assertEquals(stack.size() , 0);
    }

    @org.junit.jupiter.api.Test
    @Order(5)
    void displayStack() {
        stack.displayStack();
    }
}