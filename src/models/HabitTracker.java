// Added by main developer for clarity
// Tracking improvement

import java.util.ArrayList;

public class HabitTracker {
    private ArrayList<Habit> habits;

    public HabitTracker() {
        habits = new ArrayList<>();
    }

    public void addHabit(Habit habit) {
        habits.add(habit);
    }

    public ArrayList<Habit> getHabits() {
        return habits;
    }
}
