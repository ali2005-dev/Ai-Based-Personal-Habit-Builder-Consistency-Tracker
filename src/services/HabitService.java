import models.Habit;
import java.util.ArrayList;

public class HabitService {

    private ArrayList<Habit> habits;

    public HabitService() {
        habits = new ArrayList<>();
    }

    public void addHabit(String name) {
        habits.add(new Habit(name));
    }

    public ArrayList<Habit> getAllHabits() {
        return habits;
    }
}
