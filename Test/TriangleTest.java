import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testTriangleClassifier1() {
        String expected = "Tam giác đều";
        String actual = Triangle.TriangleClassifier(2, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangleClassifier2() {
        String expected = "Tam giác cân";
        String actual = Triangle.TriangleClassifier(2, 2, 3);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangleClassifier3() {
        String expected = "Tam giác thường";
        String actual = Triangle.TriangleClassifier(3, 4, 5);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangleClassifier4() {
        String expected = "Không có cái tam giác nào mà 3 cái cạnh của nó như thế hết áh";
        String actual = Triangle.TriangleClassifier(8, 2, 3);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangleClassifier5() {
        String expected = "Không có cái tam giác nào mà cái cạnh của nó nhỏ hơn hoặc bằng 0 hết áh";
        String actual = Triangle.TriangleClassifier(-1, 2, 1);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangleClassifier6() {
        String expected = "Không có cái tam giác nào mà cái cạnh của nó nhỏ hơn hoặc bằng 0 hết áh";
        String actual = Triangle.TriangleClassifier(-1, 2, 1);
        assertEquals(expected, actual);
    }
}