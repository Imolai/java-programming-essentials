import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public class ThreadHello {
    public static void sayHello(String name, BlockingQueue<String> queue, CountDownLatch latch) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        queue.add("Hello, " + name + "!");
        latch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        CountDownLatch latch = new CountDownLatch(2);

        Thread thread1 = new Thread(() -> sayHello("Alice", queue, latch));
        Thread thread2 = new Thread(() -> sayHello("Bob", queue, latch));

        thread1.start();
        thread2.start();

        latch.await();

        System.out.println(queue.take());
        System.out.println(queue.take());
    }
}
