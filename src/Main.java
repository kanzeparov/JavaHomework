public class Main {



    public static void main(String[] args) {

        int[] a = new int[5];


        System.out.println("Hello - world");
        run();
        Animal animal = new Animal() {
            @Override
            public void run() {

            }
        };

        A ab  = new A();
        A ba = new A();
        System.out.println(ab);
        System.out.println(ba);
        ab.equals(ba);
    }

    public static void run() {

    }

    static class A {

    }

}
