package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

//In Java, Functional Interface is an interface that has only one abstract method, also known as a Single Abstract Method (SAM) interface. Java provides a set of predefined functional interfaces in the java.util.function package to deal with functional programming constructs like lambda expressions and method references. Some of the most commonly used functional interfaces are:
//
//Consumer: It takes a single argument and performs some operation on that argument, without returning any value.
//Example: Consumer<String> consumer = s -> System.out.println(s);

//Supplier: It supplies a value without taking any input.
//Example: Supplier<Integer> supplier = () -> 5;

//Predicate: It takes an argument and returns a boolean value.
//Example: Predicate<Integer> predicate = n -> n % 2 == 0;

//Function: It takes an argument and returns a result.
//Example: Function<Integer, String> function = n -> String.valueOf(n);

//BiConsumer: It takes two arguments and performs some operation on them, without returning any value.
//Example: BiConsumer<String, Integer> consumer = (s, n) -> System.out.println(s + n);

//BiFunction: It takes two arguments and returns a result.
//Example: BiFunction<Integer, Integer, Integer> function = (a, b) -> a + b;

//UnaryOperator: It takes a single argument of a certain type and returns an object of the same type.
//Example: UnaryOperator<Integer> operator = n -> n * 2;

//BinaryOperator: It takes two arguments of a certain type and returns an object of the same type.
//Example: BinaryOperator<Integer> operator = (a, b) -> a + b;
public class FIClasses {
    public static void main(String[] args) {
        Predicate<Integer> predicate = number -> number > 0;
        System.out.println(predicate.test(5)); // Output: true
        System.out.println(predicate.test(-2)); // Output: false
        Function<String, Integer> stringLength = s -> {
            if (s.isEmpty()) {
                return 0;
            } else {
                return s.length();
            }
        };

        int length = stringLength.apply("Hello"); // length = 5
        int zeroLength = stringLength.apply(""); // length = 0
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        Consumer<String> updateName = name -> names.set(0, name);
        updateName.accept("Charlie");
        System.out.println(names); // Output: [Charlie, Bob]

        Supplier<Double> randomNumberGenerator = Math::random;
        double randomValue = randomNumberGenerator.get();
        System.out.println(randomValue);

        UnaryOperator<Integer> square = x -> x * x;
        int result = square.apply(5);
        System.out.println(result); // Output: 25

        BinaryOperator<Integer> max = Integer::max;
        int res = max.apply(5, 10);
        System.out.println(res); // Output: 10

        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println(name + " is " + age + " years old");
        printDetails.accept("John", 25);

        BiFunction<Integer, Integer, Integer> addNumbers = (num1, num2) -> num1 + num2;
        int sum = addNumbers.apply(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum);

    }
}

//A List of all the interfaces in Java along with their Single Abstract Method (SAM) :

//Runnable - void run()
//Callable - V call() throws Exception
//Comparator - int compare(T o1, T o2)
//ActionListener - void actionPerformed(ActionEvent e)
//EventListener - Marker interface
//UnaryOperator - T apply(T t)
//BinaryOperator - T apply(T t1, T t2)
//Predicate - boolean test(T t)
//BiPredicate - boolean test(T t1, T t2)
//Function - R apply(T t)
//BiFunction - R apply(T t, U u)
//Consumer - void accept(T t)
//BiConsumer - void accept(T t, U u)
//Supplier - T get()
//IntUnaryOperator - int applyAsInt(int operand)
//LongUnaryOperator - long applyAsLong(long operand)
//DoubleUnaryOperator - double applyAsDouble(double operand)
//IntBinaryOperator - int applyAsInt(int left, int right)
//LongBinaryOperator - long applyAsLong(long left, long right)
//DoubleBinaryOperator - double applyAsDouble(double left, double right)
//IntPredicate - boolean test(int value)
//LongPredicate - boolean test(long value)
//DoublePredicate - boolean test(double value)
//ToIntFunction - int applyAsInt(T value)
//ToLongFunction - long applyAsLong(T value)
//ToDoubleFunction - double applyAsDouble(T value)
//IntFunction - R apply(int value)
//LongFunction - R apply(long value)
//DoubleFunction - R apply(double value)
//IntToDoubleFunction - double applyAsDouble(int value)
//IntToLongFunction - long applyAsLong(int value)
//LongToIntFunction - int applyAsInt(long value)
//LongToDoubleFunction - double applyAsDouble(long value)
//DoubleToIntFunction - int applyAsInt(double value)
//DoubleToLongFunction - long applyAsLong(double value)
//ObjIntConsumer - void accept(T t, int value)
//ObjLongConsumer - void accept(T t, long value)
//ObjDoubleConsumer - void accept(T t, double value)
//IntConsumer - void accept(int value)
//LongConsumer - void accept(long value)
//DoubleConsumer - void accept(double value)
//IntSupplier - int getAsInt()
//LongSupplier - long getAsLong()
//DoubleSupplier - double getAsDouble()
//ObjDoubleConsumer - void accept(T t, double value)
//IntToObjFunction - R apply(int value)
//LongToObjFunction - R apply(long value)
//DoubleToObjFunction - R apply(double value)
//ToIntBiFunction - int applyAsInt(T t, U u)
//ToLongBiFunction - long applyAsLong(T t, U u)
//ToDoubleBiFunction - double applyAsDouble(T t, U u)


