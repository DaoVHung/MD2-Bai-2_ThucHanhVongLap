import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a : ");
        a = sc.nextInt();
        System.out.println("Nhap so b : ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if ( a==0 || b==0){
            System.out.println(" NO GREATEST COMMON FACTOR");
        }
        while ( a != b ){
            if ( a > b ){
                a = a -b ;
                System.out.println("a = " + a);
            } else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }
        System.out.println(" GREATEST COMMON FACTOR : " + a );
    }
}
