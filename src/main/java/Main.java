import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<MyCallable> myCList = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            myCList.add(new MyCallable());
        }

        Integer result = threadPool.invokeAny(myCList);
        System.out.println("Результат: " + result);
        threadPool.shutdown();

    }
}