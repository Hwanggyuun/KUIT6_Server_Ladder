import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


public class LadderCreatorTest {
    @Test
    @DisplayName("사다리 생성 확인")
    public void testCreator () throws Exception {
        //given
        LadderCreator ladderCreator =  LadderCreator.of(NaturalNum.of(2), NaturalNum.of(3));
        //when
        assertThat(ladderCreator).isNotNull();
    }
}
