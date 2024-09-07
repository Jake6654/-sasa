package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        // Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회
        //Class clazz1 = new String().getClass(); // 2. 인스턴스에서 조회
        //Class clazz3 = Class.forName("java.lang.String"); // 3. 문자열로 조회

        // 모든 필드 출력
        Field [] declaredField = clazz.getDeclaredFields();
        for (Field field: declaredField) {
            System.out.println("field = " + field.getType()+" " + field.getName());
        }
        // 모든 메서드 출력
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("method = " + declaredMethod);

         }
        // 상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("Interface: " +anInterface);

        }



    }
    }

