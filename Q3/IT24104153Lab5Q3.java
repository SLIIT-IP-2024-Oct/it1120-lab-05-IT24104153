import java.util.Scanner;
  public class IT24104153Lab5Q3{
  public static final int roomcharge=48000;
   public static void main(String[]args){

    Scanner date=new Scanner(System.in);
    System.out.print("Enter start date (1-31): ");
    int sdate=date.nextInt();
    System.out.print("Enter end date (1-31): ");
    int edate=date.nextInt();
    
    if((sdate>1 && sdate<31) && (edate>1 && edate<31)){
     
      if(sdate<edate){
          System.out.println("Room charge per day: "+roomcharge);
          int noofdays=edate-sdate;
          System.out.println("Number of days reserved : " + noofdays);
           int amount=roomcharge*noofdays;

            if(noofdays<3){
               System.out.print("Total amount to be paid: "+amount);}
           else if(noofdays<5){
                double Tamount=amount-(amount*0.10);
                System.out.print("Total amount to be paid: "+Tamount);}
           else{
               double Tamount=amount-(amount*0.20);
               System.out.print("Total amount to be paid: "+Tamount);}}

      else{
        System.out.print("Error: Start date must be less than End date");}}

  else{
     System.out.print("Error: Days must be between 1 and 31");}
}
}