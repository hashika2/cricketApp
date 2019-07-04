package scorecard;

import com.connector.DbConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowWinnigTeam {
    int totalrunsIn1 = 0;
    int totalrunsIn2 = 0;
    Connection con = null;

    public ShowWinnigTeam(Connection con) {
        this.con = con;
    }

    public void showTeam(String matchId) throws SQLException {


        String runs1 = "select runs from batting where inning=1 and matchid= " + matchId;
        java.sql.Statement stmt1 = con.createStatement();
        ResultSet rs = stmt1.executeQuery(runs1);


        String runs2 = "select runs from batting where inning=2 and matchid= " + matchId;
        java.sql.Statement stmt2 = con.createStatement();
        ResultSet rs2 = stmt2.executeQuery(runs2);
        while (rs.next()) {
            totalrunsIn1 = rs.getInt(1) + totalrunsIn1;
            totalrunsIn2 = rs.getInt(1) + totalrunsIn2;

        }


        if (totalrunsIn1 < totalrunsIn2) {

            if (totalrunsIn1 > totalrunsIn2) {

            } else {

            }

        }
    }
}
