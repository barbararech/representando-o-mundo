public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();

        student.setName("Bárbara");
        student.setEmail("b@gmail.com");
        student.setBirthday("07/04");

        Course course = student.getEnrolledCourse();
        course.setIsFinished(true);

        System.out.println(student.getName());
        System.out.println(student.getEmail());
        System.out.println(student.getBirthday());
        System.out.println(course.getIsFinished());
    }
}
