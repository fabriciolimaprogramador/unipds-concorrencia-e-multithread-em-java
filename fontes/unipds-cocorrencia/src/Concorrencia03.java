import java.util.concurrent.*;

public class Concorrencia03 {

  static void main() {

    ExecutorService executor = Executors.newFixedThreadPool(3);

    try {

      Future<String> tarefa1 = executor.submit(() -> {
        Thread.sleep(1000);
        return "Resultado da tarefa 1 - " + Thread.currentThread().getName();
      });

      Future<String> tarefa2 = executor.submit(() -> {
        Thread.sleep(1000);
        return "Resultado da tarefa 2 - " + Thread.currentThread().getName();
      });

      Future<String> tarefa3 = executor.submit(() -> {
        Thread.sleep(1000);
        return "Resultado da tarefa 3 - " + Thread.currentThread().getName();
      });

      System.out.println(tarefa1.get());
      System.out.println(tarefa2.get());
      System.out.println(tarefa3.get());

    } catch (InterruptedException | ExecutionException e){
      e.printStackTrace();
    } finally {
      executor.shutdown();
    }

  }

}
