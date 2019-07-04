package scorecard;

import java.sql.ResultSet;

public interface ScoreCard {
    public ResultSet getBalling(String matchId);
    public ResultSet getBatting(String matchId);
}
