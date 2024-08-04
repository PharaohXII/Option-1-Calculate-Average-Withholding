import java.util.Scanner; //imports Scanner class

class Main{
  public static void main(int[] args){
    Scanner income = new Scanner(System.in);
    System.out.println("Enter Amount");

    int userIncome = income.nextLine(); //Read user input
    System.outprintln("income is: " + income); //Output user input
}
