package jp.toastkid.str20151223;

import java.util.concurrent.TimeUnit;

import com.google.common.base.CaseFormat;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
/**
 *
 * @author Toast kid
 *
 */
@State(Scope.Thread)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class SnakeCamelBenchmark {

    /** sample of CamelCase string. */
    private static final String CAMEL = "TomatoCurry";

    /** sample of snake_case string. */
    private static final String SNAKE = "tomato_curry";

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public static void convertCharAt() {
        System.out.println(Strings.camelToSnake(CAMEL));
        System.out.println(Strings.snakeToCamel(SNAKE));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public static void convertArray() {
        System.out.println(Strings.camelToSnakeUseArray(CAMEL));
        System.out.println(Strings.snakeToCamelUseArray(SNAKE));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public static void convertGuava() {
        System.out.println(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, CAMEL));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, SNAKE));
    }
}
