public class Habit {
    private String name;
    private boolean completed;

    public Habit(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() { return name; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
