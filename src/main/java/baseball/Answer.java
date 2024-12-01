package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;

public class Answer {

    private int[] answerArr = new int[3];

    private int createRandomOneDigit() {
        return Randoms.pickNumberInRange(1, 9);
    }

    private boolean isDuplicate(int[] answerArr, int oneDigit) {
        for (int number : answerArr) {
            if (number == oneDigit) {
                return false;
            }
        }
        return true;
    }

    public int[] createAnswer() {
        int i = 0;
        while (i < 3) {
            int randomOneDigit = createRandomOneDigit();
            if (isDuplicate(answerArr, randomOneDigit)) {
                answerArr[i] = randomOneDigit;
                i++;
            }
        }

        System.out.println(Arrays.toString(answerArr));
        return answerArr;
    }

    private void compareAnswerCorrect() {
        Player player = new Player();
        int[] inputNumbers = player.inputNumber();

        for (int i = 0; i < answerArr.length ; i++) {
            int answerNum = answerArr[i];
            for (int j = 0; j < inputNumbers.length; j++) {
                int inputNum = inputNumbers[j];
            }
        }
    }

    private String printCompareAnswer() {

    }
}