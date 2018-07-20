import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongSupplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.UnaryOperator;

public class Lab3Function {
	public static void main(String[] args) {
		Consumer<String> con = (str) -> System.out.println(str);
		Function<Integer, Integer> sqr = x -> x * x;
		ToDoubleBiFunction<Integer, Integer> divide = (x, y) -> x / y;
		UnaryOperator<Integer> sqr1 = x -> x * x;
		BiPredicate<Integer, Integer> greater = (x, y) -> x > y;
		LongSupplier currentMilliSeconds = () -> System.currentTimeMillis();
		

		System.out.println(greater.test(12, 5));
		System.out.println(greater.test(12, 50));
		System.out.println(greater.test(50, 50));
		System.out.println(currentMilliSeconds.getAsLong());

	}
}
