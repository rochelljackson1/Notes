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

        //using overloaded methods
        System.out.println(one.createSum(11));

        System.out.println(one.createSum(3.4));

        // Doesnt' work
        //System.out.println(one.createSum(3.4, 6));

        System.out.println(one.createSum(6, 6));

        // call from main()
        System.out.println("Here we start using test f");
        test t = new test();

        System.out.print(t.getX() + ",");
        System.out.print(t.getY() + ",");
        System.out.println(t.getZ());

        t.f(1,1);

        System.out.print(t.getX() + ",");
        System.out.print(t.getY() + ",");
        System.out.println(t.getZ());

        t.f(3,3);

        System.out.print(t.getX() + ",");
        System.out.print(t.getY() + ",");
        System.out.println(t.getZ());
    }
}
