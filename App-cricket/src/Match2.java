
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
public class Match2 extends javax.swing.JFrame {

    /**
     * Creates new form Match2
     */
    public Match2() {
        initComponents();
    }

    
        public ArrayList<User> userList(String A){
        ArrayList<User>userList=new ArrayList<User>();
        
      
        if(A=="First_Inning"){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
             
             String query1="SELECT * FROM Match2_inning1";
           
             
             java.sql.Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(query1);
             
             
             
             M2User1 user;
             while(rs.next()){
                 user=new M2User1(rs.getInt("id"),rs.getString("wicket"),rs.getInt("runs"),rs.getInt("balls"),rs.getInt("minutes"),rs.getInt("4s"),rs.getInt("6s"),rs.getInt("SR"),rs.getString("player"));
                 userList.add(user);
             }
            
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
             
             String query1="SELECT * FROM inning2";
             
             java.sql.Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(query1);
             
             M2User1 user;
             while(rs.next()){
                 user=new M2User1(rs.getInt("id"),rs.getString("wicket"),rs.getInt("runs"),rs.getInt("balls"),rs.getInt("minutes"),rs.getInt("4s"),rs.getInt("6s"),rs.getInt("SR"),rs.getString("player"));
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
         
        ArrayList<User> list=userList(input);
     
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[9];
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
        }
    }
    
    
    public void selectedItem(String getstring){
        
        if(getstring=="First_Inning"){
            
            userList(getstring);
            userList1(getstring);
            // cricket cr=new cricket();
             //cr.setVisible(true);
        }
        else if(getstring=="Second_Inning"){
             userList(getstring);
        }
    }
       public ArrayList<User1> userList1(String A){
        ArrayList<User1>userList1=new ArrayList<User1>();
         
      
        if(A=="First_Inning"){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
             
             String query2="SELECT * FROM inning1ball";
          
             
             java.sql.Statement st1=con.createStatement();
             ResultSet rs1=st1.executeQuery(query2);
             
             
             
             User1 user1;
             while(rs1.next()){
                  user1=new User1(rs1.getInt("id1"),rs1.getInt("wickets"),rs1.getInt("run"),rs1.getInt("maidens"),rs1.getInt("economy"),rs1.getInt("overs"),rs1.getString("name"));
                 userList1.add(user1);
             }
             
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
             
             String query1="SELECT * FROM inning2ball";
             
             java.sql.Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(query1);
             
             User1 user1;
             while(rs.next()){
                 user1=new User1(rs.getInt("id1"),rs.getInt("wickets"),rs.getInt("run"),rs.getInt("maidens"),rs.getInt("economy"),rs.getInt("overs"),rs.getString("name"));
                 userList1.add(user1);
             }
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
    }
        }
         
        return userList1;
       
    }
        public void show_user1(String input){
         
        ArrayList<User1> list=userList1(input);
     
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        Object[] row1 = new Object[6];
        for(int i=0;i<list.size();i++){
            row1[0]=list.get(i).getName();
            row1[1]=list.get(i).getWickets();
            row1[2]=list.get(i).getRun();
            row1[3]=list.get(i).getMaidens();
            row1[4]=list.get(i).getOvers();
            row1[5]=list.get(i).getEconomy();
           
            
           
    
            
            
            model.addRow(row1);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player", "wicket", "runs", "minutes", "balls", "4S", "6S", "SR"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Overs", "Maidens", "Wicket", "Runs", "Economy"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Overs", "Maidens", "Wicket", "Runs", "Economy"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Micromax Cup");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("match Inning");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First_Inning", "Second_Inning", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player", "wicket", "runs", "minutes", "balls", "4S", "6S", "SR"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Overs", "Maidens", "Wicket", "Runs", "Economy"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        String select=jComboBox1.getSelectedItem().toString();

        /*    Match1 match1=new Match1();
        match1.getMatch1(select);*/
        if(select=="First_Inning"){

            jButton2.setText((String) jComboBox1.getSelectedItem());
            DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged(); // notifies the JTable that the model has changed
            selectedItem(select);
            show_user(select);
        }
        else if(select=="Second_Inning"){
            jButton2.setText((String) jComboBox1.getSelectedItem());
            DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged(); // notifies the JTable that the model has changed

            selectedItem(select);
            show_user(select);
        }
        else{

            Match1Summery m1s=new Match1Summery();
            m1s.setVisible(true);
            /*   jButton2.setText((String) jComboBox1.getSelectedItem());
            DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged(); // notifies the JTable that the model has changed

            selectedItem(select);
            show_user(select);*/
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Match2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Match2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Match2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Match2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Match2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
