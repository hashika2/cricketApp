package Summery;

import java.sql.ResultSet;

public interface Summery {
    public String showTeam(String matchId);
    public int showDetails(ResultSet rs);
    public int showMostRuns(ResultSet rs);
}
