
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hashika maduranga
 */
public class Match1Summery extends javax.swing.JFrame {

    /**
     * Creates new form Match1Summery
     */
    public Match1Summery() {
        initComponents();
        //show_user();
    }

    
        public ArrayList<M1User> userList(String id){
        ArrayList<M1User>userList=new ArrayList<M1User>();
        
      //first match summery
        if(id.equals("1")){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
             
             String query1="SELECT * FROM  match_summery";
           
             
             java.sql.Statement st=con.createStatement();
             ResultSet rs1=st.executeQuery(query1);
             
             
             
             M1User user;
             while(rs1.next()){
                user=new M1User(rs1.getInt("id"),rs1.getInt("runs1"),rs1.getInt("runs2"),rs1.getInt("wicket1"),rs1.getInt("wicket2"),rs1.getString("name1"),rs1.getString("name2"),rs1.getString("name3"),rs1.getString("name4"));
                // user=new M1User(rs1.getInt("runs1"),rs1.getInt("runs2"),rs1.getInt("wicket1"),rs1.getInt("wicket2"),rs1.getString("name3"),rs1.getString("name4"));
                 userList.add(user);
             }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
        
        }
        else if(id.equals("2")){
            try{
             Class.forName("com.mysql.jdbc.Driver");
            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
             
             String query1="SELECT * FROM  match2_summery";
           
             
             java.sql.Statement st=con.createStatement();
             ResultSet rs1=st.executeQuery(query1);
             
             
             
             M1User user;
             while(rs1.next()){
                user=new M1User(rs1.getInt("id"),rs1.getInt("runs1"),rs1.getInt("runs2"),rs1.getInt("wicket1"),rs1.getInt("wicket2"),rs1.getString("name1"),rs1.getString("name2"),rs1.getString("name3"),rs1.getString("name4"));
                // user=new M1User(rs1.getInt("runs1"),rs1.getInt("runs2"),rs1.getInt("wicket1"),rs1.getInt("wicket2"),rs1.getString("name3"),rs1.getString("name4"));
                 userList.add(user);
             }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
        }
         return userList;
        }
        
        
        public void show_user(String input){
         
        ArrayList<M1User> list=userList(input);
     
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[8];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getName1();
            row[1]=list.get(i).getRuns1();
            row[2]=list.get(i).getName2();
            row[3]=list.get(i).getWicket1();
            row[4]=list.get(i).getName3();
            row[5]=list.get(i).getRuns2();
            row[6]=list.get(i).getName4();
            row[7]=list.get(i).getWicket2();
            
           
            
            
            model.addRow(row);
        }
    }
         public void selectedMatch(String getstring){
        
        if(getstring=="1"){
            
            userList(getstring);
            
            // cricket cr=new cricket();
             //cr.setVisible(true);
        }
        else if(getstring=="2"){
             userList(getstring);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        IdMatch = new javax.swing.JTextField();
        Inningbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Inning", "", "", "", "Second Inning", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Match Summery");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Micromax Cup");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Inningbtn.setText("Innings");
        Inningbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InningbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(Inningbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(IdMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inningbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id=IdMatch.getText();
        
        if(id.equals("1")){
                Inningbtn.setText("First Match Innings");
                DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
                dm.getDataVector().removeAllElements();
                dm.fireTableDataChanged(); // notifies the JTable that the model has changed
                
                 selectedMatch(id);
                 show_user(id);
        }
        else if(id.equals("2")){
                Inningbtn.setText("Second Match Innings");
                DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
                dm.getDataVector().removeAllElements();
                dm.fireTableDataChanged(); // notifies the JTable that the model has changed
                selectedMatch(id);
                show_user(id);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void InningbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InningbtnActionPerformed
       if(Inningbtn.getText()=="First Match Innings"){
            Main m=new Main();
            m.setVisible(true);
       }
       else if(Inningbtn.getText()=="Second Match Innings"){
           Match2 mt2=new Match2();
           mt2.setVisible(true);
       }
       
    }//GEN-LAST:event_InningbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Match1Summery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Match1Summery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Match1Summery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Match1Summery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
           
          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Match1Summery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdMatch;
    private javax.swing.JButton Inningbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   

   
}
