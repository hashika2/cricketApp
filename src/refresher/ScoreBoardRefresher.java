package refresher;

import com.connector.Connector;
import com.connector.DbConnector;
import gui.Gui;
import gui.Home;
import net.proteanit.sql.DbUtils;
import scorecard.ShowInningOne;
import scorecard.ShowInningTwo;
import scorecard.ShowSummery;
import scorecard.ShowWinnigTeam;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScoreBoardRefresher implements Refresher{
    Connection con;
    Gui gui=new Home(this);

    public ScoreBoardRefresher(Connector connector) {
        this.con = connector.connect();

    }

    @Override
    public void refresh() {
        if(gui.getInput().get("selection").equals("First Inning")) {
            try {
                showComboBoxInnOne(gui.getInput().get("matchid"));
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        else if(gui.getInput().get("selection").equals("Second Inning")) {
            try {
                showComboBoxInnTwo(gui.getInput().get("matchid"));
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }

    }

    public void userList(String matchId) {


        try {
            ShowSummery showSummery = new ShowSummery(con);
            ResultSet rs1 = showSummery.setShowSummery(matchId);

            ShowWinnigTeam showWinnigTeam=new ShowWinnigTeam(con);
            showWinnigTeam.showTeam(matchId);

            gui.getOutput().get("Table1").setModel(DbUtils.resultSetToTableModel(rs1));



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


    public void showComboBoxInnOne(String matchId) throws SQLException {


        ShowInningOne showTable=new ShowInningOne(con);
        ResultSet rs=showTable.getBatting(matchId);
        ResultSet rs2=showTable.getBalling(matchId);


        gui.getOutput().get("Table1").setModel(DbUtils.resultSetToTableModel(rs));
        gui.getOutput().get("Table2").setModel(DbUtils.resultSetToTableModel(rs2));


    }

    public void showComboBoxInnTwo(String matchId) throws SQLException {



        ShowInningTwo showTable=new ShowInningTwo(con);
        ResultSet rs=showTable.getBatting(matchId);
        ResultSet rs2=showTable.getBalling(matchId);

        gui.getOutput().get("Table1").setModel(DbUtils.resultSetToTableModel(rs));
        gui.getOutput().get("Table1").setModel(DbUtils.resultSetToTableModel(rs2));


    }
}
