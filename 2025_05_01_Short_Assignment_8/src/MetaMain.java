import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MetaMain {
    public static void main(String[] args) {
        try {
            Class<?> assignmentClass = Class.forName("Assignment");
            Method[] methods = assignmentClass.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            Constructor<?>[] constructors = assignmentClass.getDeclaredConstructors();
            Object assignmentInstance = constructors[0].newInstance("Final Project", 100, 20);

            Field privateField = assignmentClass.getDeclaredField("pointsPossible"); 
            privateField.setAccessible(true); 
            privateField.set(assignmentInstance, 90);

            Method setGradeMethod = assignmentClass.getMethod("setGrade", int.class); 
            setGradeMethod.invoke(assignmentInstance, 95); 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
