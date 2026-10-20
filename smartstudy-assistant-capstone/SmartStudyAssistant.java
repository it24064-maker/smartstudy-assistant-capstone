import java.util.ArrayList;
import java.util.List;

//  User Class (User information)
class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//  Task Class (Study assignment or work )
class Task {
    private int taskId;
    private String title;
    private String dueDate;
    private boolean isCompleted;

    public Task(int taskId, String title, String dueDate) {
        this.taskId = taskId;
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public void markComplete() {
        this.isCompleted = true;
    }
}

//  StudyMaterial Class (Note or book resorces)
class StudyMaterial {
    private int materialId;
    private String title;
    private String fileType;

    public StudyMaterial(int materialId, String title, String fileType) {
        this.materialId = materialId;
        this.title = title;
        this.fileType = fileType;
    }

    public String getTitle() {
        return title;
    }
}

//  Quiz Class (Quiz or test)
class Quiz {
    private int quizId;
    private String subject;
    private int totalQuestions;

    public Quiz(int quizId, String subject, int totalQuestions) {
        this.quizId = quizId;
        this.subject = subject;
        this.totalQuestions = totalQuestions;
    }

    public String getSubject() {
        return subject;
    }
}

// StudyDashboard Class (Main controler interface)
class StudyDashboard {
    private User user;
    private List<Task> taskList;
    private List<StudyMaterial> materialList;

    public StudyDashboard(User user) {
        this.user = user;
        this.taskList = new ArrayList<>();
        this.materialList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("Task Added: " + task.getTitle());
    }

    public void addMaterial(StudyMaterial material) {
        materialList.add(material);
        System.out.println("Material Added: " + material.getTitle());
    }

    public void showSummary() {
        System.out.println("\n--- Welcome " + user.getName() + " to SmartStudy Dashboard ---");
        System.out.println("Total Pending Tasks: " + taskList.size());
        System.out.println("Total Study Materials: " + materialList.size());
    }
}

// Main class (Command line interface of driver code)
public class SmartStudyAssistant {
    public static void main(String[] args) {
        // 1. Building a user
        User student = new User(101, "Samiul");

        // 2. Building a dashboard
        StudyDashboard dashboard = new StudyDashboard(student);

        // 3. Adding task and study material 
        Task task1 = new Task(1, "Complete ICT 3107 Capstone Proposal", "2026-10-27");
        StudyMaterial doc1 = new StudyMaterial(201, "Java OOP Lecture Notes", "PDF");

        dashboard.addTask(task1);
        dashboard.addMaterial(doc1);

        // 4. Showing output summery
        dashboard.showSummary();
    }
}