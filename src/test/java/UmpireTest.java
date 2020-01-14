import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UmpireTest {

  private final Umpire umpire = new Umpire();

  @Test
  public void givenBothPlayersScoreZero_whenUmpireGivesScore_thenReturnsLoveAll() {
    assertThat(umpire.score(0, 0), is("Love All"));
  }

  @Test
  public void givenPlayer1Scores1AndPlayer2Scores2_whenUmpireGivesScore_thenReturn1530() {
    assertThat(umpire.score(1, 2), is("15:30"));
  }

  @Test
  public void givenPlayer1Scores2AndPlayer2Scores2_whenUmpireGivesScore_thenReturn30All() {
    assertThat(umpire.score(2, 2), is("30 All"));
  }

  @Test
  public void givenPlayer1Scores3AndPlayer2Scores2_whenUmpireGivesScore_thenReturn4030() {
    assertThat(umpire.score(3, 2), is("40:30"));
  }

  @Test
  public void givenPlayer1Scores1AndPlayer2Scores0_whenUmpireGivesScore_thenReturn15Love() {
    assertThat(umpire.score(1, 0), is("15:Love"));
  }

  @Test
  public void
      givenPlayer1Scores4AndPlayer2Scores3_whenUmpireGivesScore_thenReturnAdvantagePlayerOne() {
    assertThat(umpire.score(4, 3), is("Advantage Player One"));
  }

  @Test
  public void givenPlayer1Scores4AndPlayer2Scores4_whenUmpireGivesScore_thenReturnDeuce() {
    assertThat(umpire.score(4, 4), is("Deuce"));
  }

  @Test
  public void
      givenPlayer1Scores6AndPlayer2Scores4_whenUmpireGivesScore_thenReturnWinnerPlayerOne() {
    assertThat(umpire.score(4, 4), is("Winner Player One"));
  }
}
