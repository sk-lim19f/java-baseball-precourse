package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Game {

    // 게임 시작을 위한 변수 초기화
    static void playGame() {
        Answer randomAnswer = new Answer();

        int[] answer = randomAnswer.createAnswer(); // [1,2,3]
        int[] input = Player.inputNumber(); // [4,5,6]

        randomAnswer.compareAnswerCorrect(input, answer);
    }

    static int selectGameStart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String selectStr = Console.readLine();

        return Integer.parseInt(selectStr);
    }
}
