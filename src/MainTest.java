package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Нікіта
 * 
 * Клас MainTest містить тести для перевірки працездатності класів Main і Calc.
 * Використовується бібліотека JUnit для написання та запуску тестів.
*/ 
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     /**
     * Тест для перевірки транспонування матриці.
     */
    @Test
    public void testTestTransposeMatrix() {
        int[][] originalMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedTransposedMatrix = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        
        int[][] transposedMatrix = Calc.transposeMatrix(originalMatrix);
        
        assertArrayEquals(expectedTransposedMatrix, transposedMatrix);
    }
    
     /**
     * Тест для перевірки генерації випадкової матриці.
     */
    @Test
    public void testTestGenerateRandomMatrix() {
        int rows = 3;
        int columns = 4;
        
        int[][] randomMatrix = Calc.generateRandomMatrix(rows, columns);
        
        assertEquals(rows, randomMatrix.length);
        assertEquals(columns, randomMatrix[0].length);
    }
    
}
