class method_referencing {
    public static void main(String args[])
    {
        A a  = (String s) -> System.out.println(s);
        a.getName("Interface is Executing.");
        A a1 = method_referencing::getInfo;
        a1.getName("getInfo() is Executing");
    }
    public static void getInfo(String info)
    {
        System.out.println(info);
    } 
}

interface A{
    public void getName(String Name);
}