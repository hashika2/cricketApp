import com.connector.Connector;
import com.connector.DbConnector;
import gui.Gui;
import gui.Home;
import refresher.Refresher;
import refresher.ScoreBoardRefresher;

import javax.swing.*;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        Connector connector = new DbConnector();
        Refresher refresher = new ScoreBoardRefresher(connector);


    }
}
