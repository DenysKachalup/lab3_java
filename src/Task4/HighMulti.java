package Task4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighMulti {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(()->Calculations.calc1(5,5));
        executor.submit(()->Calculations.calc2(5,5));
        executor.submit(()->Calculations.calc3(5,5));

    }
}
