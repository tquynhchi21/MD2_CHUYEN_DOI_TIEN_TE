import java.util.Scanner;
public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập số USD bạn muốn  đổi nhé");
        double usd = scanner.nextDouble();
        double vnd = usd*23000;
        System.out.printf("VND nhận được là " + vnd);
    }
}