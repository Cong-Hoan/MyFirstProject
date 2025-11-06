import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many trips they made: ");
        int trips = sc.nextInt();
         double [] cost = new double[trips];

         for(int i = 0;i< cost.length;i++){
            System.out.println("Enter gas cost for trip " + (i+1)+ ".");
            cost[i]=sc.nextDouble();
         }
         System.out.println("---Gas Expense Summary---");
         for(int i = 0; i< cost.length;i++){
             System.out.println("Trip:" + (i+1) + " $" + cost[i]);
         }
         double sum = 0;
         for(int i = 0;i<cost.length;i++){
            sum=sum+cost[i];
        }
         double average = sum/cost.length;

         System.out.println("Total spent on gas: " + "$" + sum);
         System.out.println("Average per trip: " + "$" +average);
    }
}