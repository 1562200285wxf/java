package refecttest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class refe {
    public static void main(String[] args) throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz = classLoader.loadClass("refecttest.Apple");
        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Apple apple = (Apple)clazz.newInstance();
        Method setColor = clazz.getMethod("setColor",String.class);
        setColor.invoke(apple,"red");
        System.out.println(apple);
        Method getColor = clazz.getMethod("getColor",null);

        apple.getClass().getDeclaredMethod("setColor",String.class).invoke(apple,"green");
        System.out.println(getColor.invoke(apple));

    }
}
