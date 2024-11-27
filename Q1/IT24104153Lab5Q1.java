import java.util.Scanner;
  public class IT24104153Lab5Q1{
   public static void main(String[]args){
    Scanner check=new Scanner(System.in);
    int number1,number2,number3;
   System.out.print("Enter the first integer");
   number1=check.nextInt();
   System.out.print("Enter the second integer");
   number2=check.nextInt();
   System.out.print("Enter the third integer");
   number3=check.nextInt();
   System.out.println("User entered numbers are "+number1 +" "+number2+" "+number3);
  if(number1>number2 && number1>number3){
      System.out.println("The largest number is " + number1);
    if(number2<number3){
      System.out.print("The smallest number is "+number2);}
    else{
       System.out.print("The smallest number is "+number3);}
     }
  else if(number2>number1 && number2>number3){
      System.out.println("The largest number is " + number2);
       if(number1<number3){
          System.out.print("The smallest number is " + number1);}
       else{
           System.out.print("The smallest number is "+number3);}
     }
  else {
      System.out.println("The largest number is " + number3);
      if(number1<number2){
         System.out.print("The smallest number is "+number1);}
      else{
         System.out.print("The smallest number is "+number2);}
}
}
}
 