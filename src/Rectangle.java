import java.util.Scanner;

public class Rectangle {
    public static boolean inRect(int x, int y){
        if((x>=100 && x<=200) && (y>=100 && y<=200))
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x1, y1)의 좌표를 입력하세요>> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("점 (x2, y2)의 좌표를 입력하세요>> ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if(inRect(x1,y1) || inRect(x2,y2)) {
            System.out.println("충돌합니다.");
        }
        else {
            if(((x1<100 && x2<100) && (y1<100 && y2<100)) || ((x1>200 && x2>200) && (y1>200 && y2>200)))
                System.out.println("충돌하지 않습니다.");
            else
                System.out.println("충돌합니다.");
        }

        scanner.close();
    }
}
