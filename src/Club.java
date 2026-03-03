public class Club extends PlanItem {
    private String clubName;

    public Club(String title, String clubName, int estimatedHours, int daysUntilDue) {
        super(title, estimatedHours, daysUntilDue);
        this.clubName = clubName;
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return 5 * estimatedHours / (daysUntilDue + 1);
    }
    @Override
    public boolean isUrgent () {
        return !completed && daysUntilDue <= 7;
    }

    @Override
    public String toString () {
        return "Club: " + getBaseInfo() + " | Club: " + clubName + " | Urgent: " + isUrgent();
    }
    }

