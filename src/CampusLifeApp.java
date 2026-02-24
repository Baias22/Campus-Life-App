import java.util.ArrayList;

public class CampusLifeApp {
    public static void main(String[] args) {
        Course pl = new Course ("Programming lenguage","Miss Azhar", 6);
        Course Calculus2 = new Course ("Calculus 2","Mister Husein", 6);
        Course korean = new Course ("Korean lenguage","Miss Tattybubu", 4);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(pl);
        courses.add(Calculus2);
        courses.add(korean);

        AssignmentTask task1= new AssignmentTask("objects",pl,3,7);
        AssignmentTask task2 = new AssignmentTask("integral ",Calculus2,2,2);
        AssignmentTask task3 = new AssignmentTask("안녕하세요",korean,4,6);
        ArrayList<AssignmentTask> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        ArrayList<StudySession> sessions = new ArrayList<>();
        sessions.add(new StudySession(pl,180));
        sessions.add(new StudySession(Calculus2,120));
        sessions.add(new StudySession(korean,90));

        System.out.println("Courses: ");
        for (Course c : courses) {
            System.out.println(c);
        }

        System.out.println("Assignments: ");
        for (AssignmentTask t : tasks) {
            if (t.isUrgent()) {
                System.out.println("urgent: " + t);
            } else {
                System.out.println(t);
            }
        }

        int totalRemaining = 0;
        for (AssignmentTask t : tasks) {
            if (!t.isCompleted()) {
                totalRemaining += t.getEstimatedHours();
            }
        }
        System.out.println("Total remaining hours: " + totalRemaining);

        System.out.println("Study Time Per Course ");

        for (Course c : courses) {
            double totalHours = 0;

            for (StudySession s : sessions) {
                if (s.getCourse().equals(c)) {
                    totalHours += s.hours();
                }
            }

            System.out.println(c.getName() + ": " + totalHours + " hours");
        }

        task1.markCompleted();

        System.out.println("Updated assignment:");
        System.out.println(task1);

        totalRemaining = 0;
        for (AssignmentTask t : tasks) {
            if (!t.isCompleted()) {
                totalRemaining += t.getEstimatedHours();
            }
        }

        System.out.println("New remaining hours: " + totalRemaining);
    }
}
