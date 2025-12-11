// UI updates done by collaborator (friend)
import services.HabitService;
import models.Habit;

public class MainDashboard {

    public static void main(String[] args) {
        System.out.println("Keep going! Your habits matter.");
        HabitService habitService = new HabitService();

        // Add sample habits
        habitService.addHabit("Drink Water");
        habitService.addHabit("Study 1 Hour");

        System.out.println("Your Habits:");
        for (Habit h : habitService.getAllHabits()) {
            System.out.println("- " + h.getName());
        }
    }
}
