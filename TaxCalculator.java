import java.util.Scanner; //imports Scanner class

public class TaxCalculator {
  public static void main(String[] args) {
    try (//Scanner to read input
    Scanner scanner = new Scanner(System.in)) {
        //Asking the user to input income
        System.out.println("Enter Income: ");
        double income = scanner.nextDouble();

        //Calculate tax based on income
        double tax = calculateTax(income);

        //Display calculated tax
        System.out.printf("the tax for an income of $%.2f is $%.2f%n",income,tax);
    }
  }

  //method of calculation
  public static double calculateTax(double income) {
    double tax;

    if (income < 500) {
        tax = income * 0.10;
    } else if (income >= 500 && income < 1500) {
        tax = income * 0.15;
    } else if (income >= 1500 && income < 2500) {
        tax = income * 0.20;
    }else {
        tax = income * 0.30;
    }

    return tax;


   




  }


}