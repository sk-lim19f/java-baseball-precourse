package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Player {

    public static int[] inputNumber() {
        System.out.print("숫자를 입력해주세요: ");
        String value = Console.readLine();
        Validate.validateInputNumber(value);

        int[] values = new int[3];
        for (int i = 0; i < 3; i++) {
            values[i] = value.charAt(i) - '0';
        }

        return values;
    }



// 자릿 수 확인을 할 수 있는 다른 방법 (공부 목적으로 주석 처리)
//    public void inputNumberWithDivider() {
//        int value = Integer.parseInt(Console.readLine());
//        int[] values = new int[3];
//
//        int tmp2 = 10;
//        for (int i = 0; i < 3; i++) {
//            values[i] = value % 10;
//            value /= tmp2;
//        }
//    }
}
