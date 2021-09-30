import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class QueueWithArrayTest {

    static QueueWithArray que = new QueueWithArray(10);

    @org.junit.jupiter.api.Test
    @Order(1)
    void enqueue() {
        que.enqueue(19);
        assertEquals(que.array[0] , 19);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void dequeue() {
        assertEquals(que.dequeue() , 19);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void display() {
        que.display();
    }
}