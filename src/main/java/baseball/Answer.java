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
    private static final int STRIKE_INDEX = 0;
    private static final int BALL_INDEX = 1;

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
        answerArr = new int[3];
        int i = 0;
        while (i < 3) {
            int randomOneDigit = createRandomOneDigit();
            if (isDuplicate(answerArr, randomOneDigit)) {
                answerArr[i] = randomOneDigit;
                i++;
            }
        }

        System.out.println(Arrays.toString(answerArr));
        return answerArr; // [4,5,6]
    }

    public void compareAnswerCorrect(int[] playerInputNumber, int[] answerNumber) {
        while (true) {
            int[] ballCount = new int[2];
            for (int i = 0; i < answerNumber.length; i++) {
                ballCount = isStrikeOrBall(answerNumber[i], i, playerInputNumber, ballCount);
            }

            printBallCount(ballCount);

            if (ballCount[STRIKE_INDEX] == 3) {
                break;
            }

            playerInputNumber = Player.inputNumber();
        }
        gameOver();
    }

    private int[] isStrikeOrBall(int answerNum, int index, int[] playerInputNumbers, int[] ballCount) {

        for (int j = 0; j < playerInputNumbers.length; j++) {
            if (answerNum == playerInputNumbers[j] && index == j) {
                ballCount[STRIKE_INDEX]++;
            }

            if (answerNum == playerInputNumbers[j] && index != j) {
                ballCount[BALL_INDEX]++;
            }
        }

        return new int[]{ballCount[STRIKE_INDEX], ballCount[BALL_INDEX]};
    }

    private void printBallCount(int[] ballCount) {

        if (ballCount[STRIKE_INDEX] > 0 && ballCount[BALL_INDEX] == 0) {
            System.out.println(ballCount[STRIKE_INDEX] + "스트라이크");
        }

        if (ballCount[STRIKE_INDEX] == 0 && ballCount[BALL_INDEX] > 0) {
            System.out.println(ballCount[BALL_INDEX] + "볼");
        }

        if (ballCount[STRIKE_INDEX] > 0 && ballCount[BALL_INDEX] > 0) {
            System.out.println(ballCount[BALL_INDEX] + "볼 " + ballCount[STRIKE_INDEX] + "스트라이크");
        }

        if (ballCount[STRIKE_INDEX] == 0 && ballCount[BALL_INDEX] == 0) {
            System.out.println("낫싱");
        }
    }

    private void gameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}