

public class TryToParseDouble
{
    public static void main() {
     try{
         Double.parseDouble("s");
        }
     catch(Exception e) {
         System.out.println(Double.parseDouble("0"));
         System.out.println("Error");
        }
    }
}
