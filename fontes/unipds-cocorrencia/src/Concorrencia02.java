import java.util.concurrent.Executor;

public class Concorrencia02 {

  static void main() {

    Executor executor = command -> new Thread(command).start();

    executor.execute(() -> System.out.println("Executando com executor"));


  }

}
