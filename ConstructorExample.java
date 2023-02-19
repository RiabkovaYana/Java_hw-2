public class ConstructorExample {
    private static int height;
    private static int width;
    private static int depth;


    public static void main(String[] args) {
        Box y = new Box("Box one", 10, height, 30);
        y.name = "Box one";
        y.age = 10;
        y.object = height;
        System.out.println("Box name = " + y.name);
        System.out.println("height = " + y.object + y.age + "cm");

        Box y1 = new Box("Box two", 10, 20, 30);
        y1.name = "Box two";
        y.age = 10;
        y1.age = 20;
        y.object = height;
        y1.object = width;
        System.out.println("Box name = " + y1.name);
        System.out.println("height = " + y.object + y.age + "cm");
        System.out.println("width = " + y1.object + y1.age + "cm");

        Box y2 = new Box("Box two", 10, 20, 30);
        y2.name = "Box three";
        y.age = 10;
        y1.age = 20;
        y2.age = 30;
        y.object = height = 10;
        y1.object = width = 20;
        y2.object = depth = 30;
        System.out.println("Box name = " + y2.name);
        System.out.println("height = " + y.object + y.age + "cm");
        System.out.println("width = " + y1.object + y1.age + "cm");
        System.out.println("depth = " + y2.object + y2.age + "cm");

        System.out.println("V = " + 10 * 20 * 30 + "cm3");

        Box y3 = new Box("Box four", -10, 0, 0);
        y3.name = "Box four";
        y.age = -10;
        y3.object = 0;
        int i = 0;
        System.out.println("Box name = " + y3.name);
        System.out.println("age = " + y.age + "cm");

    }





//        Person p = new Person("Bob Morley");
//        p.name = "Bob Morley";
//        p.age = 30;
//        System.out.println("age = " + p.age + "y.o.");
//        System.out.println("Person name = " + p.name);

//        Person p2 = new Person("Lady Gaga", 40);
//        p2.name = "Lady Gaga";
//        p2.age = 40;
//        System.out.println("age = " + p2.age + "y.o.");
//        System.out.println("Person name = " + p2.name);
//        Person p3 = new Person();

}
