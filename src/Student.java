public class Student {
    private String name;
    private String cpf;
    private String email;
    private String birthday;
    private Course enrolledCourse = new Course();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getCPF(){
        return this.cpf;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Course getEnrolledCourse() {
        return this.enrolledCourse;
    }
}
