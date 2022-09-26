import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laiXuat = 0.1;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter inves amount : ");
        money = input.nextDouble();
        System.out.println(" Enter number of months : ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage : ");
        laiXuat = input.nextDouble();
        double totalInterest = 0;
        for( int i = 0; i<month; i ++){
            totalInterest += money + (laiXuat/100)/12 * month;
        }
        System.out.println("total of interest : " + totalInterest);
    }
}
