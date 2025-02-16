package annotationbasictesting;

import com.annotation.basic.Development;
import com.annotation.basic.Todo;

import java.lang.reflect.Method;

public class TodoTest {
    public static void main(String[] args) {
        for (Method method : Development.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task() + " | Assigned to: " + todo.assignedTo() + " | Priority: " + todo.priority());
            }
        }
    }
}

