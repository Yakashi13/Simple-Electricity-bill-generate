package classes;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import static java.lang.Class.forName;
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;


public class DBConnection {

    public Connection dbConn() {
        Connection con = null;
        try {
            forName("com.mysql.jdbc.Driver");
            con = (Connection) getConnection("jdbc:mysql://localhost:3306/ebill_1?autoReconnect=false&useSSL=false", "root", "");
            // showMessageDialog(null, "Database Connected!, Welcome..");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            showMessageDialog(null, "Database Not Connected");
        }
        return con;
    }

}
