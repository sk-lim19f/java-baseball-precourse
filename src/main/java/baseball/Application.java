package baseball;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        Answer answer = new Answer();
        answer.createAnswer();

        char alphabet = '1'; // == int 97
        int alphabet2 = alphabet - '0';

        System.out.println(alphabet2);
    }
}