package level1_exercise4;

public class Application {

    public static void start(String input) {
        System.out.println("\nTrying convert " + input + " into Level...");

        Level priority = convertStringToLevel(input);

        if(priority != null) {
            Task task = new Task(priority);
            task.execute();
        } else {
            System.out.println("Error: invalid priority input. \"" + input + "\" conversion failed! ");
        }
    }


    public static Level convertStringToLevel(String levelString) {
        try {

            Level level = Level.valueOf(levelString.toUpperCase());
            System.out.println("Successful conversion: the String \"" + levelString +
                    "\" is converted into Level " + level);
            return level;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: is not possible to convert " + levelString + " into Level.");
            return null;
        }
    }


}
