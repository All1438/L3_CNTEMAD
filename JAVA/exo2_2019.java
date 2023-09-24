public class exo2_2019 {
        public static void main(String[] args) {
            CounterThread positiveCounter = new CounterThread("Positive Counter", 0, 2, 5, 500);
            CounterThread negativeCounter = new CounterThread("Negative Counter", 10, -3, 4, 1000);
    
            positiveCounter.start();
            negativeCounter.start();
        }
    }
    
    class CounterThread extends Thread {
        private final String threadName;
        private final int initialValue;
        private final int increment;
        private final int iterations;
        private final int sleepTime;
    
        public CounterThread(String name, int init, int inc, int nit, int sleep) {
            threadName = name;
            initialValue = init;
            increment = inc;
            iterations = nit;
            sleepTime = sleep;
        }
    
        @Override
        public void run() {
            System.out.println(threadName + " starting.");
            int counter = initialValue;
            for (int i = 0; i < iterations; i++) {
                System.out.println(threadName + ": " + counter);
                counter += increment;
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted.");
                    return;
                }
            }
            System.out.println(threadName + " finished.");
        }  
}
