package DAY7.CW.FUNCTION;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        System.out.println("Total Char:");
        Function<String,Integer> f= s->s.length();
        System.out.println(f.apply("Hello World!"));
    }

}
