import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    @Test
    @DisplayName("사다리 내려가는거")
    public void LadderRun () {
        //given
        Ladder ladder = new Ladder(3,3);

        //when
        assertThat(ladder.run(new SelectedIndex(2))).isEqualTo(2);


    }
    @Test
    @DisplayName("선 하나 그리고 하는거")
    public void LadderDrawLine () {
        //given
        Ladder ladder = new Ladder(5,4);
        ladder.drawLine(2,3,new Height(2));
        //when
        assertThat(ladder.run(new SelectedIndex(2))).isEqualTo(3);
    }
    @Test
    @DisplayName("길이를 넘었습니다")
    public void throwLine() throws Exception {
        //given
        Ladder ladder = new Ladder(5,4);
        assertThatThrownBy(() -> ladder.drawLine(2,3,new Height(6)))
                .isInstanceOf(IllegalArgumentException.class);

        //when

    }
    @Test
    @DisplayName("하나 차이나게 선을 그어주세요")
    public void throwSameLine() throws Exception {
        //given
        Ladder ladder = new Ladder(5,4);
        assertThatThrownBy(() -> ladder.drawLine(3,3,new Height(4)))
                .isInstanceOf(IllegalArgumentException.class);

        //when

    }
    @Test
    @DisplayName("두 칸 이상은 선을 그을 수 없습니다")
    public void throwDoubleLine() throws Exception {
        //given
        Ladder ladder = new Ladder(5,4);
        assertThatThrownBy(() -> ladder.drawLine(1,3,new Height(4)))
                .isInstanceOf(IllegalArgumentException.class);

        //when

    }

    @Test
    @DisplayName("같은 칸에 선을 그을 수 없습니다")
    public void throwSameLines() throws Exception {
        //given
        Ladder ladder = new Ladder(5,4);
        ladder.drawLine(2,3,new Height(3));
        assertThatThrownBy(() -> ladder.drawLine(2,3,new Height(3)))
                .isInstanceOf(IllegalArgumentException.class);

        //when

    }
    @Test
    @DisplayName("옆 칸에 선을 그을 수 없습니다")
    public void throwNextLines() throws Exception {
        //given
        Ladder ladder = new Ladder(5,4);
        ladder.drawLine(1,2,new Height(4));
        assertThatThrownBy(() -> ladder.drawLine(2,3,new Height(4)))
                .isInstanceOf(IllegalArgumentException.class);

        //when

    }

}