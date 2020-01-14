public class Umpire {

  String score(int score1, int score2) {
    if (isAdvantageOrDeuce(score1, score2)) {
      return getAdvantageOrDeuce(score1, score2);
    }
    return getRegularGameScore(score1, score2);
  }

  private boolean isAdvantageOrDeuce(int score1, int score2) {
    return score1 >= 3 && score2 >= 3;
  }

  private String getAdvantageOrDeuce(int score1, int score2) {
    if (score1 == score2) {
      return "Deuce";
    } else if (score1 > score2) {
      return "Advantage Player One";
    } else {
      return "Advantage Player Two";
    }
  }

  private String getRegularGameScore(int score1, int score2) {
    String player1Score = getPlayerScore(score1);
    String player2Score = getPlayerScore(score2);
    if (player1Score.equals(player2Score)) {
      return player1Score + " All";
    }
    return String.format("%s:%s", player1Score, player2Score);
  }

  private String getPlayerScore(int score) {
    switch (score) {
      case 0:
        return "Love";
      case 1:
        return "15";
      case 2:
        return "30";
      case 3:
        return "40";
    }
    return null;
  }
}
