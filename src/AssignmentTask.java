public class AssignmentTask  extends PlanItem {
    private Course course;

    public AssignmentTask(String title, Course course, int estimatedHours, int daysUntilDue) {
        super(title, estimatedHours, daysUntilDue);
        this.course = course;

    }
    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return estimatedHours * 3 / (daysUntilDue + 1);
    }

        @Override
        public boolean isUrgent () {
            return !completed && daysUntilDue <= 2;
        }

        @Override
        public String toString () {
            return "Assignment: " + getBaseInfo() + " | Course: " + course.getName() + " | Urgent: " + isUrgent();
        }

    }

