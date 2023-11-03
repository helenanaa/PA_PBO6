package entitas;

import java.sql.Statement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.logging.Level;
//import java.util.logging.Logger;

//======================DATA===================
public class Dataproduk extends Database {
    public int ID_Produk;
    public String Nama_Produk;
    public String Jenis_Produk;
    public String Tanggal_Panen;
    public int Stok_Kg; // Changed data type to int
    public String ADMIN_ID_USER;
    private Object RoundingMode;

//===================CREATE====================
    public final boolean create() throws ParseException {
        boolean isOperationSuccess = false;

        try {
            this.openConnection();
            String sql = "INSERT INTO dataproduk (Nama_Produk,Jenis_Produk,Tanggal_Panen,Stok_Kg,ADMIN_ID_USER) VALUES (?, ?, ?, ?, ?)";
            this.preparedStatement = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            this.preparedStatement.setString(1, this.Nama_Produk);
            this.preparedStatement.setString(2, this.Jenis_Produk);

            // Convert String to java.sql.Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date parsedDate = dateFormat.parse(this.Tanggal_Panen);
            java.sql.Date tanggalDate = new java.sql.Date(parsedDate.getTime());

            this.preparedStatement.setDate(3,tanggalDate);

            // Changed the data type to int
            this.preparedStatement.setInt(4, this.Stok_Kg);

            this.preparedStatement.setString(5, this.ADMIN_ID_USER);

            int result = this.preparedStatement.executeUpdate();

            if (result > 0) {
                isOperationSuccess = true;
            }
        } catch (SQLException ex) {
            this.displayErrors((SQLException) ex);
        } finally {
            try {
                if (this.preparedStatement != null) {
                    this.preparedStatement.close();
                }
                if (this.connection != null) {
                    this.connection.close();
                }
            } catch (SQLException e) {
                this.displayErrors(e);
            }
        }
        return isOperationSuccess;
    }
    

//==========================LIHAT======================
        public boolean find(String columnName, String value) {
        boolean isOperationSuccess = false;

        try {
            this.openConnection();

            String query = "SELECT * FROM dataproduk WHERE " + columnName + " = ?";
            this.preparedStatement = this.connection.prepareStatement(query);

            this.preparedStatement.setString(1, value);

            this.resultSet = this.preparedStatement.executeQuery();
                
            if (this.resultSet.next()) {
                this.ID_Produk = this.resultSet.getInt("ID_Produk");
                this.Nama_Produk = this.resultSet.getString("Nama_Produk");
                this.Jenis_Produk = this.resultSet.getString("Jenis_Produk");
                this.Tanggal_Panen = this.resultSet.getString("Tanggal_Panen");
                this.Stok_Kg = this.resultSet.getInt("Stok_Kg");
                this.ADMIN_ID_USER = this.resultSet.getString("ADMIN_ID_USER");
                isOperationSuccess = true;
            }
        } catch (SQLException ex) {
            this.displayErrors(ex);
        } finally {
            try {
                if (this.resultSet != null) {
                    this.resultSet.close();
                }
                if (this.preparedStatement != null) {
                    this.preparedStatement.close();
                }
                if (this.connection != null) {
                    this.connection.close();
                }
            } catch (SQLException e) {
                this.displayErrors(e);
            }
        }
        return isOperationSuccess;
    }

        
//====================== UPDATE =========================
    public boolean update() {
    boolean isOperationSuccess = false;
    
    try {
        this.openConnection();
        
        String sql = "UPDATE dataproduk "
                + "SET Nama_Produk = ?, "
                + "Jenis_Produk = ?, "
                + "Tanggal_Panen = ?, "
                + "Stok_Kg = ?, "
                + "ADMIN_ID_USER = ? "
                + "WHERE ID_Produk = ?";
        
        this.preparedStatement = this.connection.prepareStatement(sql);
        
        this.preparedStatement.setString(1, this.Nama_Produk);
        this.preparedStatement.setString(2, this.Jenis_Produk);

        // Convert String to java.sql.Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date parsedDate = dateFormat.parse(this.Tanggal_Panen);
        java.sql.Date tanggalDate = new java.sql.Date(parsedDate.getTime());

        this.preparedStatement.setDate(3, tanggalDate);

        this.preparedStatement.setInt(4, this.Stok_Kg);

        this.preparedStatement.setString(5, this.ADMIN_ID_USER);

        // Menambahkan ID_Produk setelah semua pengaturan parameter
        this.preparedStatement.setInt(6, this.ID_Produk);

        int result = this.preparedStatement.executeUpdate();

        if (result > 0) {
            isOperationSuccess = true;
        }
    } catch (SQLException | ParseException ex) {
        ex.printStackTrace(); // Menampilkan stack trace untuk melacak kesalahan
    } finally {
        try {
            if (this.preparedStatement != null) {
                this.preparedStatement.close();
            }
            if (this.connection != null) {
                this.connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Menampilkan stack trace untuk melacak kesalahan
        }
    }
    return isOperationSuccess;
}

//============================= DELETE ==========================
        public boolean delete(int ID_Produk) {
        boolean isOperationSuccess = false;

        try {
            this.openConnection();

            String sql = "DELETE FROM dataproduk WHERE ID_Produk = ?";
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.preparedStatement.setInt(1, ID_Produk);

            int result = this.preparedStatement.executeUpdate();

            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        }
        return isOperationSuccess;
    }
}
