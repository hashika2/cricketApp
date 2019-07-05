import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;


import Innings.ShowInOneTable;
import Innings.ShowInTwoTable;
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

    // int totalRuns=0;
    Connection con = null;

     public Home() {
        //this  uses the form designer form
        add(Rootpanel);
        setTitle("This is my Cricket app");
        setSize(600, 500);
        con= new DbConnector().connect();

        searchbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ShowSummery showSummery=new ShowSummery(con);

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
                    showComboBoxInnOne(id.getText());
                }
                else if(selected.toString().equals("Second Inning")) {
                    showComboBoxInnTwo(id.getText());
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


            table1.setModel(DbUtils.resultSetToTableModel(rs1));
            winSum.setText("Match won by "+win+" runs");



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

   public void showComboBoxInnOne(String matchId)  {


        try {
            ShowInOneTable showTable = new ShowInOneTable(con);
            ResultSet rs = showTable.getTableInningOneBatting(matchId);
            ResultSet rs2 = showTable.getTableInningOneBalling(matchId);

            //show datas in table
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            table2.setModel(DbUtils.resultSetToTableModel(rs2));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

   }

    public void showComboBoxInnTwo(String matchId)  {

        try {
            ShowInTwoTable showTable = new ShowInTwoTable(con);
            ResultSet rs = showTable.getTableInningSecondBatting(matchId);
            ResultSet rs2 = showTable.getTableInningSecondBalling(matchId);

            table1.setModel(DbUtils.resultSetToTableModel(rs));
            table2.setModel(DbUtils.resultSetToTableModel(rs2));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }


    }

}


