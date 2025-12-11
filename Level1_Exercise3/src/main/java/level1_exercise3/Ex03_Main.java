package level1_exercise3;

public class Ex03_Main {
    public static void main( String[] args ) {

        Task Task1 = new Task(Level.HIGH);
        Task Task2 = new Task(Level.MEDIUM);
        Task Task3 = new Task(Level.LOW);

        Task1.execute();
        Task2.execute();
        Task3.execute();

    }
}
