package Inheritance;

public class CourseManagementSystem {
    public static void main(String[] args) {
        Course course = new Course("Intro to Java", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 60, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Mastering Java", 80, "Coursera", true, 199.99, 10);

        course.displayCourseInfo();
        System.out.println("-----------------");
        onlineCourse.displayCourseInfo();
        System.out.println("-----------------");
        paidCourse.displayCourseInfo();
    }
}
