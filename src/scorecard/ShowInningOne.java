package scorecard;

import com.connector.DbConnector;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;

public class ShowInningOne implements ScoreCard{

    ResultSet rs1 = null;

    ResultSet rs2,rs = null,rs3;

    Connection con = null;

    public ShowInningOne(Connection con) {
        this.con = con;
    }

    public ResultSet getBatting(String matchId) {

        try {

            String first_in = "select b.Name,b.Out,b.Runs ,b.4s,b.6s,b.Balls,b.Strike from matches m, batting b where b.inning=1 and  b.matchid=" + matchId;


            java.sql.Statement st1 = con.createStatement();

             rs = st1.executeQuery(first_in);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public ResultSet getBalling(String matchId) {


        try {


            String query1 = "SELECT b.Name,b.Wickets,b.Overs,b.Runs,b.Maidens,b.Economy FROM  matches m,bawler b where b.inning=1 and b.matchid= " + matchId;



            java.sql.Statement st2 = con.createStatement();


            rs2 = st2.executeQuery(query1);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs2;
    }
}
