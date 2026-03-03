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

        StudySession study1 = new StudySession("Review calulus", Calculus2, 2, 2);
        Club event  = new Club ("ecology","Enactuse",1,12);
        ExamPreparation event1 = new ExamPreparation ("derivative",Calculus2,10,12);
        ArrayList<PlanItem> tasks = new ArrayList<>();
        tasks.add(study1);
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(event);
        tasks.add(event1);

        System.out.println(" All Plan Items ");
        for (PlanItem item : tasks) {
            System.out.println(item);
            System.out.println("------------------ ---");
        }

        event1.markCompleted();

        System.out.println(" After marking exam as completed ");
        for (PlanItem item : tasks) {
            System.out.println(item);
            System.out.println("------------------___________");
        }

        int totalRemaining = 0;
        for (PlanItem item : tasks) {
            if (!item.isCompleted()) {
                totalRemaining += item.getEstimatedHours();
            }
        }
        System.out.println("Total remaining hours: " + totalRemaining);


        PlanItem mostUrgent = null;
        int maxUrgency = -1;

        for (PlanItem item : tasks) {
            int urgency = item.calculateUrgency();
            if (urgency > maxUrgency) {
                maxUrgency = urgency;
                mostUrgent = item;
            }
        }


        if (mostUrgent != null) {
            System.out.println("Most urgent item:");
            System.out.println(mostUrgent);
        }
    }

    }

