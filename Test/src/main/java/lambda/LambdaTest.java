package lambda;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author VAN
 */
@SuppressWarnings("all")
public class LambdaTest {

    public static void main(String[] args) {
        MyLambda lambda = (int a)-> System.out.println("expends" + a);
        lambda.hello(3);
        Thread thread = new Thread();
        System.out.println(thread.getState());
        System.out.println(thread.getPriority());

        CopyOnWriteArrayList list = new CopyOnWriteArrayList();

        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(() -> System.out.println("hello"));
        service.shutdown();
    }
}
