import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;


import Innings.ShowInnings;
//import Innings.ShowInTwoTable;
import Summery.ShowSummery;
import Summery.ShowWinnigTeam;
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
    private JTextField InMruns;
    private JTextField textField2;


    Connection con = null;

     public Home() {
        //this  uses the form designer form
        add(Rootpanel);
        setTitle("This is my Cricket app");
        setSize(800, 500);
        con= new DbConnector().connect();

        searchbtn.addActionListener(e -> userList(id.getText()));



        comboBox1.addActionListener(e -> {
            Object selected = comboBox1.getSelectedItem();

            if(selected.toString().equals("First Inning")) {
                showComboBoxInnOne(id.getText(),1);
            }
            else if(selected.toString().equals("Second Inning")) {
                showComboBoxInnOne(id.getText(),2);
            }
        });


     }

    public void userList(String matchId) {


        try {
           ShowSummery showSummery = new ShowSummery(con);
           ResultSet rs1 = showSummery.setShowSummery(matchId);


           ShowWinnigTeam showWinnigTeam=new ShowWinnigTeam(con);
           String win=showWinnigTeam.showTeam(matchId);
           String most=showWinnigTeam.showTeam(matchId);

            table1.setModel(DbUtils.resultSetToTableModel(rs1));
            winSum.setText("Match won by "+win+" runs");
            InMruns.setText(most);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

   public void showComboBoxInnOne(String matchId,int inning)  {


        try {

            ShowInnings showTable = new ShowInnings(con);
            ResultSet rs = showTable.getTableInningBatting(matchId,inning);
            ResultSet rs2 = showTable.getTableInningBalling(matchId,inning);

            //show datas in table
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            table2.setModel(DbUtils.resultSetToTableModel(rs2));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

   }

//    public void showComboBoxInnTwo(String matchId)  {
//
//        try {
//            ShowInnings showTable1 = new ShowInnings(con);
//            ResultSet rs = showTable1.getTableInningOneBatting(matchId,1);
//
//            //old
//            ShowInTwoTable showTable = new ShowInTwoTable(con);
//            ResultSet rs2 = showTable.getTableInningSecondBalling(matchId);
//
//            table1.setModel(DbUtils.resultSetToTableModel(rs));
//            table2.setModel(DbUtils.resultSetToTableModel(rs2));
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//
//
//    }

}


