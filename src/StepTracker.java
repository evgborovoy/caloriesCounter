import java.util.HashMap;


public class StepTracker {
    private int stepsGoal = 10_000;
    private HashMap<Integer, MonthData> monthToData = new HashMap<>();
    Converter converter = new Converter();


    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    public void saveSteps(int month, int day, int stepsPerDay) {
        if (stepsPerDay > 0 && 0 < day && day < 31 && 0 < month && month < 12) {
            monthToData.get(month).steps[day - 1] = stepsPerDay;
        }
    }

    public void setStepsGoal(int newGoal) {
        stepsGoal = newGoal;
        System.out.println("Ваша новая цель " + stepsGoal + " шагов.");
    }

}


class Converter {
    public double stepsToDistance(int steps) {
        return steps * 0.75;
    }

    public double countCalories(int steps) {
        return (double) (steps * 50) / 1000;
    }
}

class MonthData {
    int[] steps;

    MonthData() {
        steps = new int[30];
    }
}

