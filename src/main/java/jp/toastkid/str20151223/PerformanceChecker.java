package jp.toastkid.str20151223;

import com.google.common.base.CaseFormat;
import com.gs.collections.api.multimap.MutableMultimap;
import com.gs.collections.impl.factory.Multimaps;
import com.gs.collections.impl.list.Interval;

/**
 *
 * @author Toast kid
 *
 */
public final class PerformanceChecker {
    /** sample of CamelCase string. */
    private static final String CAMEL = "TomatoCurry";
    /** sample of snake_case string. */
    private static final String SNAKE = "tomato_curry";

    public static void main(final String[] args) {
        // warm up.
        convertCharAt();
        convertArray();
        convertGuava();

        final MutableMultimap<String, Long> mm = Multimaps.mutable.list.empty();
        Interval.oneTo(5).each(i -> {
            long start = System.currentTimeMillis();
            convertCharAt();
            mm.put("charAt", System.currentTimeMillis() - start);

            start = System.currentTimeMillis();
            convertArray();
            mm.put("array", System.currentTimeMillis() - start);

            start = System.currentTimeMillis();
            convertGuava();
            mm.put("guava", System.currentTimeMillis() - start);
        });
        System.out.println(mm);
    }

    private static void convertCharAt() {
        Interval.oneTo(1_000_000).each(i -> {
            final String snake = Strings.camelToSnake(CAMEL);
            final String camel = Strings.camelToSnake(CAMEL);
        });
    }

    private static void convertArray() {
        Interval.oneTo(1_000_000).each(i -> {
            final String snake = Strings.camelToSnakeUseArray(CAMEL);
            final String camel = Strings.camelToSnakeUseArray(CAMEL);
        });
    }

    private static void convertGuava() {
        Interval.oneTo(1_000_000).each(i -> {
            final String snake = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, CAMEL);
            final String camel = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, SNAKE);
        });
    }
}
