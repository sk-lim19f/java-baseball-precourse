package baseball;

public class Application {

    private int[] inputNums = new int[3];

    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        Player player = new Player();
        Answer answer = new Answer();

        int[] answers = answer.createAnswer();

        while (true) {
            int[] inputs = player.inputNumber();
            answer.compareAnswerCorrect(answers, inputs);
        }
    }
}