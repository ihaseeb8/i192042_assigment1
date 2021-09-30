import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class QueueWithLinkedListTest {

    static QueueWithLinkedList que = new QueueWithLinkedList();

    @org.junit.jupiter.api.Test
    @Order(1)
    void enqueue() {
        que.enqueue(14);
        assertEquals(que.head.key , 14);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void dequeue() {
        assertEquals(que.dequeue() , 14);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void display() {
        que.display();
    }
}