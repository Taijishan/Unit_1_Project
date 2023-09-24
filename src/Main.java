import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input your bill before tip: ");
        String placeholder = s.nextLine();
        double billNoTip = Double.parseDouble(placeholder); //billNoTip is the bill before tip
        System.out.println("Please input the amount you want to tip(40%=0.4): ");
        String placeholder2 = s.nextLine();
        double tipPercent = Double.parseDouble(placeholder2); //tipPercent is the amount user wants to tip
        System.out.println("Including you, how many people are present?: ");
        String placeholder3 = s.nextLine();
        int peoplesPresent = Integer.parseInt(placeholder3); //peoplesPresent is the amount of people present
        double totalTip = billNoTip * tipPercent; //totalTip finds the total amount the user should tip
        double totalTipRounded = Math.round(totalTip* 100.0) / 100.0; //rounds it to the nearest cent
        double grandTotal = billNoTip + totalTip; //grandTotal finds the total price of the bill with tip
        double grandTotalRounded = Math.round(grandTotal* 100.0) / 100.0; //rounds it to the nearest cent
        double individualTip = totalTip/peoplesPresent; //individualTip finds the amount each person should tip
        double individualTipRounded = Math.round(individualTip* 100.0) / 100.0; //rounds it to the nearest cent
        double individualTotal = grandTotal/peoplesPresent; //individualTotal finds the amount each person should pay
        double individualTotalRounded = Math.round(individualTotal* 100.0) / 100.0; //rounds it to the nearest cent
        System.out.println("The total tip amount is: $" + totalTipRounded + " in tips.");
        System.out.println("The total bill including tip is: $" + grandTotalRounded);
        System.out.println("Each person in your group should pay: $" + individualTipRounded + " in tips.");
        System.out.println("Each person in your group should pay a total of: $" + individualTotalRounded);
    }
}
