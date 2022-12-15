package bbdd;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ConexionBBDD {
    
// nueva=new ConexionBBDD("192.168.101.108", "3306", "world","root", "root");

 
    /**
     * Method to connect to the database by passing parameters.
     * Método para establecer la conexión a la base de datos mediante el paso de parámetros.
     * 
     * @param host <code>String</code> host name or ip. Nombre del host o ip.
     * @param port <code>String</code> listening database port. Puerto en el que escucha la base de datos.
     * @param database <code>String</code> database name for the conexion. Nombre de la base de datos para la conexión.
     * @param user <code>String</code> user name. Nombre de usuario.
     * @param password  <code>String</code> user password. Password del usuario.
     */
    String host;
    String port;
    String database;
    String user;
    String password;
    Connection conexion = null;
    
    public ConexionBBDD(String host, String port, String database, String user, String password) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.password = password;
        conectar();
    }

    private void conectar() {
        String url = "";
        try {
            // We register the PostgreSQL driver
            // Registramos el driver de MySQL
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }     
            url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            // Database connect
            // Conectamos con la base de datos
            conexion = DriverManager.getConnection(
                    url,
                    user, password);
            boolean valid = conexion.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con la base de datos de MySQL(" + url + "): " + sqle);
        }
    }
    public Connection getConnection(){
        return conexion;
    }
    public void selectSQL(String SQL, DefaultTableModel dtm){
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            int tam=rsmd.getColumnCount();
             for (int i = 1; i <= tam; i++) {
                dtm.addColumn(rsmd.getColumnLabel(i));               
            }
         
            while(rs.next()){
                String [] fila = new String[tam];
                for (int i = 0; i < tam; i++) {
                    fila[i]=rs.getString(i+1);                 
                }
                dtm.addRow(fila);   
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    public void selectSQL(String SQL, DefaultComboBoxModel dcbm){
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(SQL);        
            while(rs.next()){
                dcbm.addElement(rs.getString(1));   
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    public int ejecutaSQL(String SQL) {
        try {
            Statement st = conexion.createStatement();
            int resultado = st.executeUpdate(SQL);
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    public void cerrar(){
        try {
            conexion.close();
        } catch (java.sql.SQLException sqle) {
            System.out.println("No se ha podido cerrar la conexión");
        }
    }

}

