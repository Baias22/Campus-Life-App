public class ExamPreparation extends PlanItem {
    private Course course;

    public ExamPreparation(String title, Course course, int estimatedHours, int daysUntilDue) {
        super(title, estimatedHours, daysUntilDue);
        this.course = course;

    }


    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return estimatedHours * 2 / (daysUntilDue + 1);
    }

    @Override
    public boolean isUrgent () {
        return !completed && daysUntilDue <= 7;
    }



    @Override
    public String toString () {
        return "ExamPreparation: " + getBaseInfo() + " | Course: " + course.getName() + " | Urgent: " + isUrgent();
    }

}
