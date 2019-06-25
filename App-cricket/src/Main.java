
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hashika maduranga
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
         show_user("First_Inning");
         show_user1("First_Inning");
    }
      public void close(){
        
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }
    
    public ArrayList<User> userList(String A){
        ArrayList<User>userList=new ArrayList<User>();
        
      
        if(A=="First_Inning"){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
             
             String query1="SELECT * FROM inning1";
           
             
             java.sql.Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(query1);
             
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             
           /*  User user;
             while(rs.next()){
                 user=new User(rs.getInt("id"),rs.getString("wicket"),rs.getInt("runs"),rs.getInt("balls"),rs.getInt("minutes"),rs.getInt("4s"),rs.getInt("6s"),rs.getInt("SR"),rs.getString("player"));
                 userList.add(user);
             }*/
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
        }
        
         if(A=="Second_Inning"){
        try{
             Class.forName("com.mysql.jdbc.Driver");
           
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
             
             String query1="SELECT * FROM inning2";
             
             java.sql.Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(query1);
             
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
          /*   User user;
             while(rs.next()){
                 user=new User(rs.getInt("id"),rs.getString("wicket"),rs.getInt("runs"),rs.getInt("balls"),rs.getInt("minutes"),rs.getInt("4s"),rs.getInt("6s"),rs.getInt("SR"),rs.getString("player"));
                 userList.add(user);
             }*/
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
    }
        }
         
        return userList;
       
    }
     public void show_user(String input){
         
        ArrayList<User> list=userList(input);
     
       // DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
      /*  Object[] row = new Object[9];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getPlayer();
            row[1]=list.get(i).getWicket();
            row[2]=list.get(i).getRuns();
            row[3]=list.get(i).getMinutes();
            row[4]=list.get(i).getBalls();
            row[5]=list.get(i).getFours();
            row[6]=list.get(i).getSixes();
            row[7]=list.get(i).getSR();
            
           
            
            
            model.addRow(row);
        }*/
    }
    
    
    public void selectedItem(String getstring){
        
        if(getstring=="First_Inning"){
            
            userList(getstring);
            userList1(getstring);
           
        }
        else if(getstring=="Second_Inning"){
             userList(getstring);
             userList1(getstring);
        }
    }
    
    public ArrayList<User1> userList1(String A){
        ArrayList<User1>userList1=new ArrayList<User1>();
         
      
        if(A=="First_Inning"){
        try{
             Class.forName("com.mysql.jdbc.Driver");
           
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
             
             String query2="SELECT * FROM inning1ball";
          
             
             java.sql.Statement st1=con.createStatement();
             ResultSet rs1=st1.executeQuery(query2);
             
             //result set jtable
             jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
             
           /*  User1 user1;
             while(rs1.next()){
                  user1=new User1(rs1.getInt("id1"),rs1.getInt("wickets"),rs1.getInt("run"),rs1.getInt("maidens"),rs1.getInt("economy"),rs1.getInt("overs"),rs1.getString("name"));
                  userList1.add(user1);
             }*/
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
        }
        
         if(A=="Second_Inning"){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
             
             String query1="SELECT * FROM inning2_ball";
             
             java.sql.Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(query1);
             
             jTable2.setModel(DbUtils.resultSetToTableModel(rs));
             
          /*   User1 user1;
             while(rs.next()){
                 user1=new User1(rs.getInt("id1"),rs.getInt("wickets"),rs.getInt("run"),rs.getInt("maidens"),rs.getInt("economy"),rs.getInt("overs"),rs.getString("name"));
                 userList1.add(user1);
             }*/
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
    }
        }
         
        return userList1;
       
    }
     public void show_user1(String input){
         
        ArrayList<User1> list=userList1(input);
     
        //DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        /*Object[] row1 = new Object[6];
        for(int i=0;i<list.size();i++){
            row1[0]=list.get(i).getName();
            row1[1]=list.get(i).getWickets();
            row1[2]=list.get(i).getRun();
            row1[3]=list.get(i).getMaidens();
            row1[4]=list.get(i).getOvers();
            row1[5]=list.get(i).getEconomy();
           
            
           
    
            
            
            model.addRow(row1);
        }*/
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Micromax Cup");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First_Inning", "Second_Inning", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("match Inning");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Overs", "Maidens", "Wicket", "Runs", "Economy"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player", "wicket", "runs", "minutes", "balls", "4S", "6S", "SR"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Sri Lanka Bating");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 255, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(301, 301, 301))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
        
        
        String select=jComboBox1.getSelectedItem().toString();
        
         /*    Match1 match1=new Match1();
             match1.getMatch1(select);*/
            if(select=="First_Inning"){
             
                jButton2.setText((String) jComboBox1.getSelectedItem());
               
                 selectedItem(select);
                 show_user(select);
            }
            else if(select=="Second_Inning"){
                jButton2.setText((String) jComboBox1.getSelectedItem());
               

                 selectedItem(select);
                 show_user(select);
            }
           
                
            
       
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        new Match1Summery().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
