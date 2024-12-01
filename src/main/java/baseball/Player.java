package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;

public class Player {

    public int[] inputNumber() {
        System.out.print("숫자를 입력해주세요: ");
        String value = Console.readLine();

        int[] values = new int[3];
        for (int i = 0; i < 3; i++) {
            values[i] = value.charAt(i) - '0';
        }

        return values;
    }

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
