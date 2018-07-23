package excelsheetcolumntitle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testThat1WillReturnA() {
        int column = 1;
        String excelColumn = new Solution().convertToTitle(column);
        assertEquals("A", excelColumn);
    }

    @Test
    void testThat28WillReturnAB() {
        int column = 28;
        String excelColumn = new Solution().convertToTitle(column);
        assertEquals("AB", excelColumn);
    }

    @Test
    void testThat701WillReturnZY() {
        int column = 701;
        String excelColumn = new Solution().convertToTitle(column);
        assertEquals("ZY", excelColumn);
    }
}
