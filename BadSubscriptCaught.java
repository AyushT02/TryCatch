

public class BadSubscriptCaught
{  
   public static void main() {
   String[] firstNames = {"Ayush", "Nick", "Ryan", "Brandon", "Christian", "Peter", "Jamison", "Bryce", "Max", "Zach"};
   try{
       System.out.println(firstNames[12]);
    }
   catch(Exception e){
       System.out.println("The number is out of range");
    }
}
}
