package Summery;

import Innings.ShowInnings;
import Summery.ShowWinnigTeam;

import java.sql.Connection;

public class Queries {
    Connection con = null;


    public String setSummeryQueries(String matchId){

        String runsInOne="select * from batting b  where b.inning=1 and b.matchid= "+matchId;
        return runsInOne;
    }
    public String setBattingQueries(String matchId,int inning){

        String batting = "SELECT b.Name,b.Wickets,b.Overs,b.Runs,b.Maidens,b.Economy FROM  bawler b where b.inning="+inning+" and b.matchid= " + matchId;
        return batting;
    }


}
