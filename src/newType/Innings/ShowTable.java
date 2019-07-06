package Innings;

import java.sql.ResultSet;

public interface ShowTable {
    public ResultSet getTableInningBatting(String matchId,int inning);
    ResultSet getTableInningBalling(String matchId,int inning);
}
