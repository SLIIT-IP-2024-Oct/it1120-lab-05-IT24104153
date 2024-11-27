import java.util.Scanner;
  public class IT24104153Lab5Q2{
   public static void main(String[]args){
     int members;
     Scanner add=new Scanner(System.in);
     System.out.print("Enter the number of new members introduced: ");
     members=add.nextInt();
     if(members>=0){
         switch(members){
             case 0:System.out.print("No Prize");
                      break;
             case 1:System.out.print("Prize is a : Pen");
                      break;
             case 2:System.out.print("Prize is a : Umbrella");
                      break;
             case 3:System.out.print("Prize is a : Bag");
                      break;
             case 4:System.out.print("Prize is a Travelling chair");
                      break;
            }
       if(members>=5){System.out.print("Prize is a Headphone");}
    }
   else{
    System.out.print("input must be a number 0 or greater");
   }
}
}

              