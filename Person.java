package FreeJava;

public class Person {

    public static int count;

    public Person() {
        count++;
    }

    public void getCount() {
        System.out.println("Количество: " + count);
    }
}
