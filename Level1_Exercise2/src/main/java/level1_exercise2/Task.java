package level1_exercise2;

public class Task {
    private Level priorityLevel;

    public Task(Level priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void execute() {

        switch(priorityLevel) {
            case LOW:
                System.out.println(priorityLevel + " priority! It can be postponed.");
                break;
            case MEDIUM:
                System.out.println(priorityLevel + " priority! Start soon.");
                break;
            case HIGH:
                System.out.println(priorityLevel + " priority! Do it immediately!");
        }
    }
}
