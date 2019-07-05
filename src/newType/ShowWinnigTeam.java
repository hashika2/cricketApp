import com.connector.DbConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowWinnigTeam {
    int totalrunsIn1=0;
    int totalrunsIn2=0;
    Connection con = null;

    public ShowWinnigTeam(Connection con) {
        this.con = con;
    }

    public void showTeam(String matchId) throws SQLException {

/*
        //get inning one palyers runs
        String runs1="select runs from batting where inning=1 and matchid= "+matchId;
        java.sql.Statement stmt1 = con.createStatement();
        ResultSet rs = stmt1.executeQuery(runs1);

        //get inning one palyers runs
        String runs2="select runs from batting where inning=2 and matchid= "+matchId;
        java.sql.Statement stmt2 = con.createStatement();
        ResultSet rs2 = stmt2.executeQuery(runs2);
        while(rs.next()){
            totalrunsIn1 =rs.getInt(1)+totalrunsIn1;
            totalrunsIn2 =rs.getInt(1)+totalrunsIn2;

        }

        System.out.println(totalrunsIn1);
        System.out.println(totalrunsIn2);

        if(totalrunsIn1<totalrunsIn2){
            System.out.println("inning one team won the match");
        }
        if(totalrunsIn1>totalrunsIn2){
            System.out.println("inning one team won the match");
        }
        else{
            System.out.println("match drown");
        }
  */
        String runsInOne="select * from batting where inning=1 and matchid= "+matchId;
        String runsInTwo="select * from batting where inning=2 and matchid= "+matchId;
        java.sql.Statement stmt1 = con.createStatement();
        java.sql.Statement stmt2 = con.createStatement();
        ResultSet rs = stmt1.executeQuery(runsInOne);
        ResultSet rs1 = stmt2.executeQuery(runsInTwo);
        ArrayList<GetSummerydetails> sm=new ArrayList<GetSummerydetails>();


        //while loop
        GetSummerydetails gsd=new GetSummerydetails();
        int totalInnOne = gsd.showDetails(rs);
        int totalInnTwo=gsd.showDetails(rs1);
        System.out.println(totalInnOne);
        System.out.println(totalInnTwo);


    }
}
