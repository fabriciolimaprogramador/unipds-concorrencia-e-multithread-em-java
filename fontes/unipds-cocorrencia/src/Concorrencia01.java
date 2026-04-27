public class Concorrencia01 {

  static void main() {

    new Thread(() -> {
      System.out.println("Executando tarefa");
    }).start();

  }

}
