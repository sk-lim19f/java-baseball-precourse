package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;

public class Answer {

    /**
     * 1. 랜덤 숫자 생성
     * 2. 중복 검사
     * 3. 정답 여부 확인
     * 4. 출력
     */
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

    public void compareAnswerCorrect(int[] answerArr, int[] playerInputNumber) {
        int[] ballCount = new int[2];
        for (int i = 0; i < answerArr.length; i++) {
            ballCount = isStrikeOrBall(answerArr[i], i, playerInputNumber, ballCount);
        }

        printBallCount(ballCount);
    }

    private int[] isStrikeOrBall(int answerNum, int index, int[] playerInputNumbers , int[] ballCount) {
        int strikes = ballCount[0];
        int balls = ballCount[1];
        for (int j = 0; j < playerInputNumbers.length; j++) {
            if (answerNum == playerInputNumbers[j] && index == j) {
                strikes++;
            }

            if (answerNum == playerInputNumbers[j] && index != j) {
                balls++;
            }
        }

        return new int[]{strikes, balls};
    }

    private void printBallCount(int[] ballCount) {
        int strikes = ballCount[0];
        int balls = ballCount[1];

        if (strikes > 0 && balls == 0) {
            System.out.println(strikes + "스트라이크");
        }

        if (strikes == 0 && balls > 0) {
            System.out.println(balls + "볼");
        }

        if (strikes > 0 && balls > 0) {
            System.out.println(strikes + "스트라이크" + balls + "볼");
        }

        if (strikes == 0 && balls == 0) {
            System.out.println("낫싱");
        }
    }
}