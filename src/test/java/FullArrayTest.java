import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FullArrayTest {

    static FullArray array = new FullArray();

    @org.junit.jupiter.api.Test
    @Order(1)
    void insert() {
        array.insert(5 ,0 );
        array.insert(7 , 1);
        array.insert(2 , 2);
        array.insert(9 , 3);
        array.insert(11 , 4);

        assertEquals(array.array[0],5);
        assertEquals(array.array[1],7);
        assertEquals(array.array[2],2);
        assertEquals(array.array[3],9);
        assertEquals(array.array[4],11);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void delete() {
        array.delete(3);

        assertEquals(array.array[0],5);
        assertEquals(array.array[1],7);
        assertEquals(array.array[2],2);
        assertEquals(array.array[3],11);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void display() {
        array.display();
    }

    @org.junit.jupiter.api.Test
    @Order(4)
    void linearSearch() {

        assertEquals(array.linearSearch(11),true);
        assertEquals(array.linearSearch(9),false);

    }

    @org.junit.jupiter.api.Test
    @Order(5)
    void bubbleSort() {

        array.bubbleSort();

        assertEquals(array.array[0],2);
        assertEquals(array.array[1],5);
        assertEquals(array.array[2],7);
        assertEquals(array.array[3],11);
    }

    @org.junit.jupiter.api.Test
    @Order(6)
    void binarySearch() {

        assertEquals(array.linearSearch(2),true);
        assertEquals(array.linearSearch(11),true);
        assertEquals(array.linearSearch(9),false);
    }
}