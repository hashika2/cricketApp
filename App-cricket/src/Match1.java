//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Hashika maduranga
// */
//public class Match1 {
//    
//    Main main=new Main();
//    
//    
//    public ArrayList<User> userList(String A){
//        ArrayList<User>userList=new ArrayList<User>();
//        
//      
//        if(A=="First_Inning"){
//        try{
//             Class.forName("com.mysql.jdbc.Driver");
//            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
//             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
//             
//             String query1="SELECT * FROM inning1";
//           
//             
//             java.sql.Statement st=con.createStatement();
//             ResultSet rs=st.executeQuery(query1);
//             
//             
//             
//             User user;
//             while(rs.next()){
//                 user=new User(rs.getInt("id"),rs.getString("wicket"),rs.getInt("runs"),rs.getInt("balls"),rs.getInt("minutes"),rs.getInt("4s"),rs.getInt("6s"),rs.getInt("SR"),rs.getString("player"));
//                 userList.add(user);
//             }
//            
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//            }
//        }
//        
//         if(A=="Second_Inning"){
//        try{
//             Class.forName("com.mysql.jdbc.Driver");
//            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
//             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
//             
//             String query1="SELECT * FROM inning2";
//             
//             java.sql.Statement st=con.createStatement();
//             ResultSet rs=st.executeQuery(query1);
//             
//             User user;
//             while(rs.next()){
//                 user=new User(rs.getInt("id"),rs.getString("wicket"),rs.getInt("runs"),rs.getInt("balls"),rs.getInt("minutes"),rs.getInt("4s"),rs.getInt("6s"),rs.getInt("SR"),rs.getString("player"));
//                 userList.add(user);
//             }
//             
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//    }
//        }
//         
//        return userList;
//       
//    }
//     public void show_user(String input){
//         
//        ArrayList<User> list=userList(input);
//     
//        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
//        Object[] row = new Object[9];
//        for(int i=0;i<list.size();i++){
//            row[0]=list.get(i).getPlayer();
//            row[1]=list.get(i).getWicket();
//            row[2]=list.get(i).getRuns();
//            row[3]=list.get(i).getMinutes();
//            row[4]=list.get(i).getBalls();
//            row[5]=list.get(i).getFours();
//            row[6]=list.get(i).getSixes();
//            row[7]=list.get(i).getSR();
//            
//           
//            
//            
//            model.addRow(row);
//        }
//    }
//    
//    
//    public void selectedItem(String getstring){
//        
//        if(getstring=="First_Inning"){
//            
//            userList(getstring);
//            userList1(getstring);
//            // cricket cr=new cricket();
//             //cr.setVisible(true);
//        }
//        if(getstring=="Second_Inning"){
//             userList(getstring);
//        }
//    }
//    
//    public ArrayList<User1> userList1(String A){
//        ArrayList<User1>userList1=new ArrayList<User1>();
//         
//      
//        if(A=="First_Inning"){
//        try{
//             Class.forName("com.mysql.jdbc.Driver");
//            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
//             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
//             
//             String query2="SELECT * FROM inning1ball";
//          
//             
//             java.sql.Statement st1=con.createStatement();
//             ResultSet rs1=st1.executeQuery(query2);
//             
//             
//             
//             User1 user1;
//             while(rs1.next()){
//                  user1=new User1(rs1.getInt("id1"),rs1.getInt("run"),rs1.getInt("maidens"),rs1.getInt("economy"),rs1.getString("name"),rs1.getInt("overs"));
//                 userList1.add(user1);
//             }
//             
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//            }
//        }
//        
//         if(A=="Second_Inning"){
//        try{
//             Class.forName("com.mysql.jdbc.Driver");
//            // String url="jdbc:sqlserver://localhost:4200;databaseName=cricketdata;user=root;password=";
//             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdata","root","");
//             
//             String query1="SELECT * FROM inning2ball";
//             
//             java.sql.Statement st=con.createStatement();
//             ResultSet rs=st.executeQuery(query1);
//             
//             User1 user1;
//             while(rs.next()){
//                 user1=new User1(rs.getInt("id1"),rs.getInt("run"),rs.getInt("maidens"),rs.getInt("economy"),rs.getString("name"));
//                 userList1.add(user1);
//             }
//             
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//    }
//        }
//         
//        return userList1;
//       
//    }
//     public void show_user1(String input){
//         
//        ArrayList<User1> list=userList1(input);
//     
//        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
//        Object[] row1 = new Object[6];
//        for(int i=0;i<list.size();i++){
//            row1[0]=list.get(i).getName();
//            row1[1]=list.get(i).getWickets();
//            row1[2]=list.get(i).getRun();
//            row1[3]=list.get(i).getMaidens();
//            row1[4]=list.get(i).getOvers();
//            row1[5]=list.get(i).getEconomy();
//           
//            
//           
//    
//            
//            
//            model.addRow(row1);
//        }
//    
//    /**
//     *
//     * @param select
//     */
//    public void getMatch1(String select){
//         if(select=="First_Inning"){
//             
//                jButton2.setText((String) jComboBox1.getSelectedItem());
//                DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
//                dm.getDataVector().removeAllElements();
//                dm.fireTableDataChanged(); // notifies the JTable that the model has changed
//                 selectedItem(select);
//                 show_user(select);
//            }
//            else if(select=="Second_Inning"){
//                 jButton2.setText((String) jComboBox1.getSelectedItem());
//                DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
//                dm.getDataVector().removeAllElements();
//                dm.fireTableDataChanged(); // notifies the JTable that the model has changed
//
//                 selectedItem(select);
//                 show_user(select);
//            }
//            else{
//                 jButton2.setText((String) jComboBox1.getSelectedItem());
//                DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
//                dm.getDataVector().removeAllElements();
//                dm.fireTableDataChanged(); // notifies the JTable that the model has changed
//                 
//                 selectedItem(select);
//                 show_user(select);
//            }
//                
//            
//       
//        
//    }                                          
//
//    
//           
//    
//    
//}
