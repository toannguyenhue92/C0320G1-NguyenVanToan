package review;

public interface Resizable {
    int a = 6;

    default void say() {
        System.out.println('a');
        hello();
    }

    static void hello() {
        System.out.println('b');
    }
}
