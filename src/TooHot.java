import java.util.Scanner;
public class TooHot {
public static void main(String[] Jacky) {
 Scanner input = new Scanner(System.in);
  String UserChoice = "";
  int LowerTemp = 60;
  int HigherTemp;
  boolean Result = false;

  boolean isSummer = false;
  boolean exitSwitch = false;
  
  
  
  while (exitSwitch == false) {
   System.out.println("Hi there! Is it summer? Please type either 'Y' or 'N'");
   UserChoice = input.next().toUpperCase();
   switch(UserChoice) {
   case "Y":
    isSummer = true;
    HigherTemp = 100;
    Result = Calculate.TooHot(LowerTemp, HigherTemp);
    exitSwitch = true;
    break;
   case "N":
    isSummer = false;
    HigherTemp = 90;
    Result = Calculate.TooHot(LowerTemp, HigherTemp);
    exitSwitch = true;
    break;   
    }
   }
  System.out.println("Summer: " + Result);
  }
}