package level1_exercise1;

public class Ex01_Main {

    public static void main( String[] args ) {

        weekEndChecker(Day.SATURDAY);
        weekEndChecker(Day.FRIDAY);
        weekEndChecker(Day.WEDNESDAY);

    }

    public static void weekEndChecker(Day day) {
        switch(day) {
            case SATURDAY, SUNDAY -> System.out.println(day + " is weekend!");
            default -> System.out.println(day + " is a working day!");
        }
    }

}

