package TalonarioConsola.conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionMySQL {

    private final String user = "root";      // Su usuario
    private final String password = "Callenumero1";       // Su contraseña
    private final String url = "jdbc:mysql://localhost:3306/facturacion_ra"; // Su BDD (registro)
    private final String driver = "com.mysql.cj.jdbc.Driver"; // Driver de MySQL
    private Connection con = null;

    public Connection getConexion() throws SQLException {  // Metodo para devolver la conexion
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public void close() { // metodo para cerrar la conexion
        try {
            con.close();
        } catch (SQLException ex) {
          
        }
    }
}

