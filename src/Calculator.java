import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>> ");
        double operand1 = scanner.nextDouble();
        String operator = scanner.next();
        double operand2 = scanner.nextDouble();
        double result;

        if(operator.equals("+")) {
            result = operand1 + operand2;
            System.out.println(operand1+"+"+operand2+"의 계산 결과는 "+result);
        }
        else if(operator.equals("-")) {
            result = operand1 - operand2;
            System.out.println(operand1+"-"+operand2+"의 계산 결과는 "+result);
        }
        else if(operator.equals("*")) {
            result = operand1 * operand2;
            System.out.println(operand1+"*"+operand2+"의 계산 결과는 "+result);
        }
        else if(operator.equals("/")) {
            if (operand2==0)
                System.out.println("0으로 나눌 수 없습니다.");
            else{
                result = operand1 / operand2;
                System.out.println(operand1 + "/" + operand2 + "의 계산 결과는 " + result);
            }
        }
        scanner.close();
    }
}
