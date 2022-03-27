package ziwoxuexi;
import java.util.Scanner;
public class zuoye3 {
    public static void main(String[] args) {
        System.out.println("请输入第一条边长");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入第二条边长");
        int b = scanner.nextInt();
        System.out.println("请输入第三条边长");
        int c = scanner.nextInt();
        if ((a == b) && (b == c)) {
            System.out.println("等边三角形");
        }
        else if ((a == b) || (b == c)) {
            System.out.println("等腰三角形");
        }
        else if  (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
            System.out.println("直角三角形");
        }
        else {
            System.out.println("输入错误：三条边不构成三角形");
        }
    }
}
