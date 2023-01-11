public class Course {
    private String name;
    private String teacher;
    private String period;
    private boolean isFinished;

    public String getName() {
        return this.name;
    }

    public String getTeacher() {
        return this.teacher;
    }

    public String getPeriod() {
        return this.period;
    }

    public boolean getIsFinished() {
        return this.isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
}
