import java.util.Scanner;
public class Calculate {
public static boolean TooHot(int LowerTemp, int HigherTemp) {
 boolean Result;
 Scanner input = new Scanner(System.in);
 int Temperature;
  System.out.println("What is the temperature?");
  Temperature = input.nextInt();
  
 if (Temperature >= LowerTemp && Temperature <= HigherTemp) {
  Result = true;
 }
 else {
  Result = false;
 }
 
 
 return Result;
}
}