package Summery;

import Innings.ShowInnings;
import Summery.ShowWinnigTeam;

import java.sql.Connection;

public class Queries {
    Connection con = null;


    public String setSummeryQueriesOne(String matchId){

        String runsInOne="select * from batting b  where b.inning=1 and b.matchid= "+matchId;
        return runsInOne;
    }
    public String setSummeryQueriesTwo(String matchId){

        String runsInTwo="select * from batting where inning=2 and matchid= "+matchId;;
        return runsInTwo;
    }
    public String setBattingQueries(String matchId,int inning){

        String batting ="select b.Name,b.Out,b.Runs ,b.4s,b.6s,b.Balls,b.Strike from batting b where b.inning= "+inning+" and  b.matchid= "+matchId;
        return batting;
    }

    public String setBallingQueries(String matchId,int inning){

        String balling = "SELECT b.Name,b.Wickets,b.Overs,b.Runs,b.Maidens,b.Economy FROM  bawler b where b.inning="+inning+" and b.matchid= " + matchId;
        return balling;
    }


}
