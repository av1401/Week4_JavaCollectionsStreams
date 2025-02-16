package annotationbasictesting;

import com.annotation.basic.ImportantMethod;
import com.annotation.basic.TaskProcessor;

import java.lang.reflect.Method;

public class ImportantMethodTest {
    public static void main(String[] args) {
        for (Method method : TaskProcessor.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName() + " | Level: " + annotation.level());
            }
        }
    }
}

