package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

public class AnswerTest {

    @RepeatedTest(5)
    @DisplayName("랜덤숫자 3개가 정상적으로 들어갔는지 확인")
    void createRandomAnswer01() {
        // given (메서드 호출을 위한 사전 작업)
        Answer answer = new Answer();

        // when (테스트하고 싶은 메서드 호출)
        int[] answers = answer.createAnswer();

        // then (테스트)
        assertThat(answers).doesNotContain(0);
        assertThat(answers).hasSize(3);
    }

    @RepeatedTest(5)
    @DisplayName("중복되는 숫자가 없는지")
    void createRandomAnswer02() {
        // given (메서드 호출을 위한 사전 작업)
        Answer answer = new Answer();

        // when (테스트하고 싶은 메서드 호출)
        int[] answers = answer.createAnswer();

        // then (테스트)
        assertThat(answers).doesNotHaveDuplicates();
    }
}
