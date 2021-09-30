import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ArrayInsertionTest {

    static ArrayInsertion arrIns= new ArrayInsertion();


    @org.junit.jupiter.api.Test
    @Order(1)
    void insert() {


        int[] array = new int[10];
        ArrayInsertion.insert(array,5,0);
        ArrayInsertion.insert(array,9,3);
        ArrayInsertion.insert(array,11,6);

        assertEquals(array[0] , 5);
        assertEquals(array[3] , 9);
        assertEquals(array[6] , 11);
        assertEquals(array[1] , 0);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void display() {
        int[] array = new int[10];
        ArrayInsertion.insert(array,5,0);
        ArrayInsertion.insert(array,9,3);
        ArrayInsertion.insert(array,11,6);

        ArrayInsertion.display(array);
    }
}