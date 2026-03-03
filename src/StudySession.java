public class StudySession  extends  PlanItem {

    private Course course;

public StudySession (String title, Course course, int estimatedHours, int daysUntilDue){
    super(title, estimatedHours, daysUntilDue);
    this.course=course;

}
    public Course getCourse() {
        return course;
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return estimatedHours / (daysUntilDue + 1);
    }

    @Override
    public boolean isUrgent() {
        return !completed && daysUntilDue <= 3;
    }

    @Override
    public String toString() {
        return "StudySession: " + getBaseInfo() + " | Course: " + course.getName() + " | Urgent: " + isUrgent();
    }
}