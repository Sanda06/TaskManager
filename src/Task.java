public class Task {
   private String TaskTitle;
   private String TaskDescription;

    public Task( String taskTitle, String taskDescription) {
        TaskTitle = taskTitle;
        TaskDescription = taskDescription;
    }

    public String getTaskTitle() {
        return TaskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        TaskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        TaskDescription = taskDescription;
    }

    @Override
    public String toString() {
        return "Task{" +
                "TaskTitle='" + TaskTitle + '\'' +
                ", TaskDescription='" + TaskDescription + '\'' +
                '}';
    }
}
