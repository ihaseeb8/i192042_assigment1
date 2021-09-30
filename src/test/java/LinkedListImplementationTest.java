import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LinkedListImplementationTest {

    static LinkedListImplementation list = new LinkedListImplementation();

    @org.junit.jupiter.api.Test
    @Order(1)
    void add() {
        list.add(1);
        assertEquals(list.headPointer.data , 1);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void pushFront() {
        list.pushFront(9);
        assertEquals(list.headPointer.data , 9);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void topFront() {
        try{
            assertEquals( list.topFront() , 9);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    @Order(4)
    void popFront() {
        try{
            list.popFront();
            assertEquals( list.headPointer.data , 1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    @Order(5)
    void pushBack() {
        list.pushBack(13);
        assertEquals(list.tailPointer.data , 13);
    }

    @org.junit.jupiter.api.Test
    @Order(6)
    void topBack() {
        try{
            assertEquals( list.topBack() , 13);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    @Order(7)
    void display() {
        list.display();
    }

    @org.junit.jupiter.api.Test
    @Order(8)
    void size() {
        assertEquals(list.size() , 2);
    }
}