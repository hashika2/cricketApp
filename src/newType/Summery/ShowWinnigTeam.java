package Summery;

import Summery.GetSummerydetails;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowWinnigTeam {
    int totalInnOne=0;
    int totalInnTwo=0;
    int win=0;
    Connection con = null;

    public ShowWinnigTeam(Connection con) {
        this.con = con;
    }

    public String showTeam(String matchId) throws SQLException {


        String runsInOne="select * from batting b,Match m  where b.inning=1 and b.matchid= "+matchId;
        String runsInTwo="select * from batting where inning=2 and matchid= "+matchId;
        java.sql.Statement stmt1 = con.createStatement();
        java.sql.Statement stmt2 = con.createStatement();
        ResultSet rs = stmt1.executeQuery(runsInOne);
        ResultSet rs1 = stmt2.executeQuery(runsInTwo);
        ArrayList<GetSummerydetails> sm=new ArrayList<GetSummerydetails>();

        //show who won the match

        //while loop
        GetSummerydetails gsd=new GetSummerydetails();
         totalInnOne = gsd.showDetails(rs);
         totalInnTwo=gsd.showDetails(rs1);

        win=Math.abs(totalInnOne-totalInnTwo);
        String setWin=Integer.toString(win);

        return setWin;
    }
}
