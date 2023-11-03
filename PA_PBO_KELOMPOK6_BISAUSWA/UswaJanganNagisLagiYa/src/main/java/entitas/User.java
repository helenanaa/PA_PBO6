package entitas;

import java.sql.Statement;
import java.sql.SQLException;

public class User extends Database {
    public String ID_USER;
    public String Password;
    
//============================== CREATE ========================
    public final boolean create() {
        boolean isOperationSuccess = false;
        
        try {
            this.openConnection();
            
            String sql = "INSERT INTO user VALUES (?, ?)";
            this.preparedStatement = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            this.preparedStatement.setString(1, this.ID_USER);
            this.preparedStatement.setString(2, this.Password);
            
            
            int result = this.preparedStatement.executeUpdate();
            
            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        } finally {
            this.closeConnection();
        }
        
        return isOperationSuccess;
    }
    
    
//====================== UPDATE ===================
        public final boolean update() {
        boolean isOperationSuccess = false;
        
        try {
            this.openConnection();
            
            String sql = "UPDATE user "
                    + "SET Password = ?, "
                    + "WHERE id_apoteker = ?";
            
            this.preparedStatement = this.connection.prepareStatement(sql);
            
            this.preparedStatement.setString(1, this.Password);
            this.preparedStatement.setString(2, this.ID_USER);
            
            int result = this.preparedStatement.executeUpdate();
            
            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        } finally {
            this.closeConnection();
        }
        
        return isOperationSuccess;
    }
        
        
//==================== DELETE ================================
        public final boolean delete(int id) {
        boolean isOperationSuccess = false;

        try {
            this.openConnection();

            String sql = "DELETE FROM user WHERE ID_USER = ?";
            this.preparedStatement = this.connection.prepareStatement(sql);

            this.preparedStatement.setString(1, ID_USER);

            int result = this.preparedStatement.executeUpdate();

            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        } finally {
            this.closeConnection();
        }

        return isOperationSuccess;
    }
}
    