package level1_exercise4;

public class Task {

    private final Level priorityLevel;

    public Task(Level priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void execute() {

        switch(priorityLevel) {
            case LOW:
                System.out.println(priorityLevel + " priority! It can be postponed. -Color: " +
                        priorityLevel.getColor());
                break;
            case MEDIUM:
                System.out.println(priorityLevel + " priority! Start soon! -Color: " +
                        priorityLevel.getColor());
                break;
            case HIGH:
                System.out.println(priorityLevel + " priority! Do it immediately! -Color: " +
                        priorityLevel.getColor());
                break;
        }
    }

}
