import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = n / 10;
        int r = p % 10;
        System.out.println(r);
        // put your code here
    }
}
