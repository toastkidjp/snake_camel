package jp.toastkid.str20151223;

import jp.toastkid.str20151223.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Strings's test cases.
 * @author Toast kid
 *
 */
public class StringsTest {
    /** sample of CamelCase string. */
    private static final String CAMEL = "TomatoCurry";
    /** sample of snake_case string. */
    private static final String SNAKE = "tomato_curry";

    /**
     * check behavior {@link Strings#camelToSnake(String)}.
     */
    @Test
    public void testCamelToSnake() {
        assertEquals(SNAKE, Strings.camelToSnake(CAMEL));
        assertEquals("orange_shake", Strings.camelToSnake("orangeShake"));
    }

    /**
     * check behavior {@link Strings#snakeToCamel(String)}.
     */
    @Test
    public void testSnakeToCamel() {
        assertEquals(CAMEL, Strings.snakeToCamel(SNAKE));
        assertEquals("Adapter", Strings.snakeToCamel("_adapter"));
    }

    /**
     * check behavior {@link Strings#camelToSnakeUseArray(String)}.
     */
    @Test
    public void testCamelToSnakeUseArray() {
        assertEquals(SNAKE, Strings.camelToSnakeUseArray(CAMEL));
        assertEquals("orange_shake", Strings.camelToSnakeUseArray("orangeShake"));
    }

    /**
     * check behavior {@link Strings#snakeToCamelUseArray(String)}.
     */
    @Test
    public void testSnakeToCamelUseArray() {
        assertEquals(CAMEL, Strings.snakeToCamelUseArray(SNAKE));
        assertEquals("Adapter", Strings.snakeToCamelUseArray("_adapter"));
    }
}
