public class Person {


    //fields
    private String name ;
    private int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Created Person: " + name);
    }

    //Constructor
    public Person(String na) {
        name = na;
        System.out.println("Created Person using other constructor: " + name);
    }


    //Setter method for name
    public void setName(String na) {

        name = na;
    }

    //getter method for name
    public String getName() {
        return name;
    }

    //Setter method for name
    public void setAge(int age) {

        this.age = age;
    }

    //getter method for name
    public int getAge() {
        return age;
    }

    public String printEverything() {

        return String.format("Name: " + name + ", age: ", + age);
    }

    //placeholder for a function that could set fields from a file
    public void readDataFromFile(String filename){
        // ....

    }

}
