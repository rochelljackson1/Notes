/*
        * A class to demonstrate UML
 */
public class test {

    //fields
    private int x = 0;
    private int y = 2;
    private int z = 1;

    //getter/setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    private void doSomething() {
        System.out.print("I'm here in private 1");
    }

    public void doSomething2() {
        System.out.print("I'm here in public 2");
    }

    void doSomething3() {
        System.out.print("I'm here in 3");
    }

    //first createSum method takes int and returns int
    int createSum(int addOn) {
        return addOn + x;
    }

    //overloading
    int createSum(int addOn, int secondAddOn) {
        return addOn + secondAddOn + x;
    }

    double createSum(double addOn) {
        return addOn + x;
    }

    public static int doSomethingElse() {
        return 8;
    }

    void f(int x, int y)
    {
        y = y + this.y;
        z = x + this.z;
        this.y = y + this.x * z + z;
        x = this.x + 1;
    }
}