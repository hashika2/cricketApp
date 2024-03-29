package Innings;

import Summery.Queries;
import com.connector.DbConnector;
import com.sun.javafx.binding.StringFormatter;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;

public class ShowInnings implements ShowTable{

    ResultSet rs1 = null;

    ResultSet rs2,rs = null,rs3;

    Connection con = null;

    public ShowInnings(Connection con) {
        this.con = con;
    }
    Queries queries=new Queries();

    @Override
    public ResultSet getTableInningBatting(String matchId,int inning) {

        try {

           String first_in = queries.setBattingQueries(matchId,inning);
           java.sql.Statement st1 = con.createStatement();
           rs = st1.executeQuery(first_in);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public ResultSet getTableInningBalling(String matchId,int inning) {


        try {

            String query1=queries.setBallingQueries(matchId,inning);
            java.sql.Statement st2 = con.createStatement();
            rs2 = st2.executeQuery(query1);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs2;
    }
}
