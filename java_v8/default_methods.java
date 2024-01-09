class default_method implements Tester {
    public static void main(String args[])
    {
        default_method d = new default_method();
        d.square(5);

        //calling default method
        d.show();
    }
    public void square(int n)
    {
        System.out.println("Square is: "+ n*n);
    }
}

interface Tester {
    public void square(int n);
    //default method in interface
    default void show()
    {
        System.out.println("Show Function inside interface");
    }
}