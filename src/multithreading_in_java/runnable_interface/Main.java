package multithreading_in_java.runnable_interface;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i <= 100) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    i++;
                }
            }
        });
        thread2.start();

        // the same but with lambda expression
        Thread thread3 = new Thread(() -> {
            int i = 0;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });
        thread3.start();
    }

}
