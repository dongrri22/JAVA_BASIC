import java.util.Scanner;

public class Compare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("2자리 정수 입력(10~99)>> ");
        int num = scanner.nextInt();

        if (num>=10 && num<=99) {
            if (num % 11 == 0)
                System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
            else
                System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }else{
            System.out.println("오류. 2자리 정수가 아닙니다.");
        }

        scanner.close();
    }
}
