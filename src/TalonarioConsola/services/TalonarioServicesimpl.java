package TalonarioConsola.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import TalonarioConsola.conexion.ConexionMySQL;
import TalonarioConsola.model.Talonario;

public class TalonarioServicesimpl implements iTalonarioService {

    @Override
    public boolean guardar(Talonario talonario) {
        boolean hecho = false;

        ConexionMySQL conexion = new ConexionMySQL();
        Connection con = null;
        PreparedStatement ps;

        String sql = "INSERT INTO talonario(carnet, descripcion, fecha, estado) values(?,?,?,?)";

        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, talonario.getCarnet());
            ps.setString(2, talonario.getDescripcion());
            ps.setString(3, talonario.getFecha());
            ps.setString(4, talonario.getEstado());

            ps.execute();
            hecho = true;

        } catch (SQLException e) {
            System.out.println(e);

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return hecho;
    }

	@Override
	public Talonario recuperar(Talonario talonario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Talonario> recuperarTalonarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modificar(Talonario talonario) {
		boolean hecho = false;

        ConexionMySQL conexion = new ConexionMySQL();
        Connection con = null;
        PreparedStatement ps;

        String sql = "UPDATE talonario set descripcion=?, fecha=?, estado=?  WHERE Carnet=?";

        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);

          
            ps.setString(1, talonario.getDescripcion());
            ps.setString(2, talonario.getFecha());
            ps.setString(3, talonario.getEstado());
            
            ps.setString(4, talonario.getCarnet());
            

            ps.executeUpdate();
            hecho = true;
            

        } catch (SQLException e) {
            System.out.println(e);

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return hecho;
	}

	@Override
	public boolean eliminar(Talonario talonario) {
		// TODO Auto-generated method stub
		return false;
	}
}