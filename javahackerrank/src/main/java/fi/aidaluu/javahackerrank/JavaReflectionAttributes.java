package fi.aidaluu.javahackerrank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Java Reflection - Attributes
 *
 * @author aidaluu
 */
public class JavaReflectionAttributes {
    
    public static void main(String[] args){
        Class student = null;
        try {
            student = Class.forName("Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
    
}
