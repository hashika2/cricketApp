import com.connector.DbConnector;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;


public class ShowSummery {

    Connection con = null;

    public ShowSummery(Connection con) {
        this.con = con;
    }

    public ResultSet setShowSummery(String matchId) {
        ResultSet rs1 = null;

        try {
            String overView = "select m.Match,m.inningOne,m.inningTwo,m.Winning from matches m where m.Mid = " + matchId;
            //String match="select Match from matches where Mid = '"+ matchId+"'";

            java.sql.Statement st = this.con.createStatement();
            rs1 = st.executeQuery(overView);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs1;
    }
}
