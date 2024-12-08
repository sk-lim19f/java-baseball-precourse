package baseball;

import static baseball.Game.selectGameStart;

public class Application {

    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        boolean restart;

        do {
            Game.playGame();
        } while (selectGameStart() == 1);
    }
}