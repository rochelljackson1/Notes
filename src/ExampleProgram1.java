public class ExampleProgram1 {

    public static void main (String[] args) {

        //Create instance of objects Person
        Person anna = new Person("Anna");
        Person hubert = new Person("Hubert");

        anna.setName("Annamarie");

        System.out.println(hubert.getName());
        System.out.println(anna.getName());

        System.out.println(anna.printEverything());
        System.out.println(hubert.printEverything());

        //Create instance of class Test
        test one = new test();
        test two = new test();

        one.setY(7);
        one.setX(8);

        System.out.println(one.getX());
        System.out.println(two.getX());

        int temp = one.getX();
        System.out.println(5 + temp);

        // This does exactly the same as above
        System.out.println(5 + one.getX());


    }
}
