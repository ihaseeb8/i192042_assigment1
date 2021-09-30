import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ArrayDeletionTest {

        static ArrayDeletion array = new ArrayDeletion();

    @org.junit.jupiter.api.Test
    @Order(1)
    void delete() {
        int[] arr = new int[4];

        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 9;

        array.delete(arr , 1);

        assertEquals(arr[0] , 2);
        assertEquals(arr[1] , 7);
        assertEquals(arr[2] , 9);
        assertEquals(arr[3] , -1);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void display() {

        int[] arr = new int[4];

        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 9;

        array.display(arr);
    }
}