package entitas;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//==============================================
public class Database {
    public Connection connection = null;
    public Statement statement;
    public PreparedStatement preparedStatement;
    public ResultSet resultSet;
    
    public Connection getConnection() {
        return this.connection;}
    
    public final void openConnection() {
        try {
            // Bentuk stringnya: "jdbc:mysql://dbhost/dbname?user=username&password=password"
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/perkebunan7?user=root&password=");
        } catch (SQLException ex) {
            this.displayErrors(ex);
        }
    }
    
    public void executeQuery(String query) {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            // Proses hasil query
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public final void closeConnection() {
        try {
            if (this.resultSet != null) this.resultSet.close();
            if (this.statement != null) this.statement.close();
            if (this.preparedStatement != null) this.preparedStatement.close();
            if (this.connection != null) this.connection.close();
            
            this.resultSet = null;
            this.statement = null;
            this.preparedStatement = null;
            this.connection = null;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        }
    }
    
    public final void displayErrors(SQLException ex) {
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
}
