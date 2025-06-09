import java.util.ArrayList;

public class StepCounter {
    int min_steps_active;
    ArrayList<Integer> daily_steps = new ArrayList<>();
    StepCounter(int min_steps_active) {
        this.min_steps_active = min_steps_active;
    }
    StepCounter() {
        this.min_steps_active = 7000;
    }
    void addDailySteps(int steps) {
        daily_steps.add(steps);
    }
    int activeDays() {
        int act_days = 0;
        for (int day = 0; day < daily_steps.size(); day++) {
           if (daily_steps.get(day) >= min_steps_active) {
                act_days++;
            }
        }
        return act_days;
    }
    float averageSteps() {
        if (daily_steps.size() == 0)
            return 0.0f;
        int total_steps = 0;
        for (int day = 0; day < daily_steps.size(); day++) {
           total_steps += daily_steps.get(day);
        }
        return (float)total_steps / (float)daily_steps.size();
    }
}
