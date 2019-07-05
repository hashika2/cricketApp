package Innings;

import com.connector.DbConnector;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;

public class ShowInTwoTable {

    ResultSet rs1 = null;

    ResultSet rs2,rs = null,rs3;

    Connection con = null;

    public ShowInTwoTable(Connection con) {
        this.con = con;
    }

    public ResultSet getTableInningSecondBatting(String matchId) {

        try {

            String second_in = "select b.Name,b.Out,b.Runs ,b.4s,b.6s,b.Balls,b.Strike from matches m, batting b where b.inning=2 and  b.matchid=" + matchId;
            //String query1 = "SELECT b.Name,b.Wickets,b.Overs,b.Runs,b.Maidens,b.Economy FROM  matches m,bawler b where b.inning=1 and b.matchid= " + matchId;
            //String runs = "select runs from batting where inning=1 and matchid= " + matchId;

            java.sql.Statement st1 = con.createStatement();

            rs = st1.executeQuery(second_in);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public ResultSet getTableInningSecondBalling(String matchId) {


        try {

            //String second_in = "select b.Name,b.Out,b.Runs ,b.4s,b.6s,b.Balls,b.Strike from matches m, batting b where b.inning=2 and  b.matchid=" + matchId;
            String query1 = "SELECT b.Name,b.Wickets,b.Overs,b.Runs,b.Maidens,b.Economy FROM  matches m,bawler b where b.inning=2 and b.matchid= " + matchId;
            //String runs = "select runs from batting where inning=1 and matchid= " + matchId;


            java.sql.Statement st2 = con.createStatement();


            rs2 = st2.executeQuery(query1);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs2;
    }
}
