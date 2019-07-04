package gui;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

import refresher.Refresher;

public class Home extends JFrame implements Gui {
    private JButton searchbtn;
    private JTextField id;
    private JComboBox comboBox1;
    private JPanel Rootpanel;
    private JTable table1;
    private JTable table2;
    private JTextField textField3;
    private Refresher refresher;

    private HashMap<String,String> input = new HashMap<String,String>();
    private HashMap<String,JTable> output = new HashMap<String,JTable>();

    public HashMap<String, String> getInput() {
        return input;
    }

    public HashMap<String, JTable> getOutput() {
        return output;
    }

    public Home(Refresher refresher) {

        add(Rootpanel);
        setTitle("This is my Cricket app");
        setSize(600, 500);
        this.refresher = refresher;
        this.setVisible(true);



        searchbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getchange();


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
               getchange();


            }
        });

     }

    public void getchange(){
        input.put("matchid",id.getText());
        input.put("selection",(String) comboBox1.getSelectedItem());

        output.put("Table1",table1);
        output.put("Table2",table2);
        refresher.refresh();
    }



}


