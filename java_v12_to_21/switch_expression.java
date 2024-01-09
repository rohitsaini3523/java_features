package java_v12_to_21;
public class switch_expression {
    public static void main(String args[])
    {
        String day = "M";
        // in this new switch syntax 
        String result = switch(day) {
            case "M","T","W","TH","F" -> "Working days!";
            case "SA","SU" -> "Weekends!";
            default -> "Invalid Input!";
        };
        System.out.println(result);
    }
}
