import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Concorrencia04 {

  static void main() {

    ExecutorService executor = Executors.newFixedThreadPool(2);

    try {

      for (int i = 0; i < 5; i++) {
        int numero = i;
        executor.execute(() -> {
          System.out.println("Processando tarefa " + numero + " na thread " + Thread.currentThread().getName());
        });

      }

    } finally {
      executor.shutdown();
    }

  }

}
