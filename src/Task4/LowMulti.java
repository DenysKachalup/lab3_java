package Task4;

public class LowMulti {
    public static void main(final String[] args) {

        final SimpleThread1 simpleThread1 = new SimpleThread1();
        final SimpleThread2 simpleThread2 = new SimpleThread2();
        final SimpleThread3 simpleThread3 = new SimpleThread3();

        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();

    }
    public static class SimpleThread1 extends Thread{
        @Override
        public void run() {
            Calculations.calc1(5,5);
        }
    }
    public static class SimpleThread2 extends Thread{
        @Override
        public void run() {
            Calculations.calc2(18,8);
        }
    }
    public static class SimpleThread3 extends Thread{
        @Override
        public void run() {
            Calculations.calc3(2,5);
        }
    }
}
