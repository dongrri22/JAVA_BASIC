import java.util.Scanner;

public class Game369 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99사이의 정수를 입력하세요>> ");
        int num = scanner.nextInt();

        if( (num%10==3)||(num%10==6)||(num%10==9) ){
            if(num%3==0) {
                if(num==3||num==6||num==9)
                    System.out.println("박수 짝");
                else
                    System.out.println("박수 짝짝");
            }
            else
                System.out.println("박수 짝");
        }
        else
            System.out.println("프로그램 종료.");
        scanner.close();
    }
}
