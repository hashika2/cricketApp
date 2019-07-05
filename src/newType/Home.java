import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connector.DbConnector;
import net.proteanit.sql.DbUtils;

public class Home extends JFrame {
    private JButton searchbtn;
    private JTextField id;
    private JComboBox comboBox1;
    private JPanel Rootpanel;
    private JTable table1;
    private JTable table2;
    private JTextField winSum;

    // int totalRuns=0;
    Connection con = null;

     Home() {
        //this  uses the form designer form
        add(Rootpanel);
        setTitle("This is my Cricket app");
        setSize(600, 500);
        con= new DbConnector().connect();

        searchbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ShowSummery showSummery=new ShowSummery(con);
               // showSummery.userList(id.getText().toString());
                userList(id.getText().toString());
            }
        });


        comboBox1.addMouseListener(new MouseAdapter() {
          @Override
           public void mouseClicked(MouseEvent e) {
               super.mouseClicked(e);
           }
       });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object selected = comboBox1.getSelectedItem();

                if(selected.toString().equals("First Inning")) {
                    try {
                        showComboBoxInnOne(id.getText().toString());
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
                else if(selected.toString().equals("Second Inning")) {
                    try {
                        showComboBoxInnTwo(id.getText().toString());
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });


     }

    public void userList(String matchId) {


        try {
           ShowSummery showSummery = new ShowSummery(con);
           ResultSet rs1 = showSummery.setShowSummery(matchId);

           ShowWinnigTeam showWinnigTeam=new ShowWinnigTeam(con);
           String win=showWinnigTeam.showTeam(matchId);

           // this.match.setText(rs2.getString("Match"));
            table1.setModel(DbUtils.resultSetToTableModel(rs1));
            winSum.setText("Match won by "+win+" runs");



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

   public void showComboBoxInnOne(String matchId) throws SQLException {

//            String first_in = "select b.Name,b.Out,b.Runs ,b.4s,b.6s,b.Balls,b.Strike from matches m, batting b where b.inning=1 and  b.matchid="+ matchId ;
//            String query1 = "SELECT b.Name,b.Wickets,b.Overs,b.Runs,b.Maidens,b.Economy FROM  matches m,bawler b where b.inning=1 and b.matchid= "+ matchId;
//            String runs="select runs from batting where inning=1 and matchid= "+matchId;
//
//            java.sql.Statement st1 = con.createStatement();
//            java.sql.Statement st2 = con.createStatement();
//            java.sql.Statement st3 = con.createStatement();
//            ResultSet rs = st1.executeQuery(first_in);
//            ResultSet rs2 = st2.executeQuery(query1);
//            ResultSet rs3 = st3.executeQuery(runs);
            



          ShowTable showTable=new ShowTable(con);
          ResultSet rs=showTable.getTableInningOneBatting(matchId);
          ResultSet rs2=showTable.getTableInningOneBalling(matchId);

            //show datas in table
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            table2.setModel(DbUtils.resultSetToTableModel(rs2));


   }

    public void showComboBoxInnTwo(String matchId) throws SQLException {

//        String first_in = "select b.Name,b.Out,b.Runs ,b.4s,b.6s,b.Balls,b.Strike from matches m, batting b where b.inning=2 and m.Mid = b.matchid="+ matchId ;
//        String query1 = "SELECT b.Name,b.Wickets,b.Overs,b.Runs,b.Maidens,b.Economy FROM  matches m,bawler b where b.inning=2 and m.Mid= "+ matchId;
//
//        java.sql.Statement st1 = con.createStatement();
//        java.sql.Statement st2 = con.createStatement();
//        ResultSet rs = st1.executeQuery(first_in);
//        ResultSet rs2 = st2.executeQuery(query1);

        ShowTable2 showTable=new ShowTable2(con);
        ResultSet rs=showTable.getTableInningSecondBatting(matchId);
        ResultSet rs2=showTable.getTableInningSecondBalling(matchId);

        table1.setModel(DbUtils.resultSetToTableModel(rs));
        table2.setModel(DbUtils.resultSetToTableModel(rs2));


    }

}


