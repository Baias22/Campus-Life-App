abstract class PlanItem {
    protected String title;
    protected int estimatedHours;
    protected int daysUntilDue;
    protected boolean completed;

    public PlanItem(String title, int estimatedHours, int daysUntilDue) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.daysUntilDue = daysUntilDue;
        this.completed = false;
    }
    public String getTitle() {
        return title;
    }

    public int getDaysUntilDue() {
        return daysUntilDue;
    }

    public void markCompleted() {

        this.completed = true;
    }

    public boolean isCompleted() {

        return completed;
    }
    public abstract int calculateUrgency();

    abstract boolean isUrgent();

    public int getEstimatedHours() {

        return estimatedHours;
    }
    protected String getBaseInfo() {
        return title + " | Estimated: " + estimatedHours + "h | Due in: " + daysUntilDue + " days | Completed: " + completed;
    }

    @Override
    public  abstract String toString() ;
}

