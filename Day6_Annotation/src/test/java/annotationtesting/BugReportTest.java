package annotationtesting;

import com.annotation.exercise.BugReport;
import com.annotation.exercise.BugReports;
import com.annotation.exercise.Software;

import java.lang.reflect.Method;

public class BugReportTest {
    public static void main(String[] args) {
        try {
            // Get the method
            Method method = Software.class.getMethod("processData");

            // Check if the method has BugReport annotations
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports bugReports = method.getAnnotation(BugReports.class);

                System.out.println("Bug Reports for method: " + method.getName());
                for (BugReport bug : bugReports.value()) {
                    System.out.println("- " + bug.description());
                }
            } else {
                System.out.println("No Bug Reports found.");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

