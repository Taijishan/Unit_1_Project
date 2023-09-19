import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input your bill before tip");
        String placeholder = s.nextLine();
        double billNoTip = Double.parseDouble(placeholder);
    }
}