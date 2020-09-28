
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int counter = 0;
        while (counter < 7){
            System.out.printf("%d Сообщение  от потока %s\n", counter, Thread.currentThread().getName());
            Thread.sleep(2000);
            counter++;
        }

        return counter;
    }
}