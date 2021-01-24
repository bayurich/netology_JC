package Netology_JC.Lesson1.Pack_Task_1_2;

public class Task_1_2 {

    public static void  main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
