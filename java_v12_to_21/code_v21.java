public class code_v21 {
    public static void main(String args[])
    {
        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Hello"));
        try{
            thread.join();
        }
        catch(Exception e)
        {
            System.out.println("Failed");
        }
    }
}
