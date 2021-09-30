import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class QueueImplementationTest {

    static QueueImplementation que = new QueueImplementation(10);

    @org.junit.jupiter.api.Test
    @Order(1)
    void enqueue() {
        try{
            que.enqueue(2);
            que.enqueue(3);
            assertEquals(que.array[0] , 2);
            assertEquals(que.array[1] , 3);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void dequeue() {
        try{
            assertEquals(que.dequeue() , 2);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void empty() {
        assertEquals(que.empty() , false);
    }

    @org.junit.jupiter.api.Test
    @Order(4)
    void size() {
        assertEquals(que.size() , 1);
    }

    @org.junit.jupiter.api.Test
    @Order(5)
    void display() {
        que.display();
    }
}