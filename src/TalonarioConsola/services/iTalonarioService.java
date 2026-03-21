package TalonarioConsola.services;

import java.util.List;

import TalonarioConsola.model.Talonario;

public interface iTalonarioService {
	
	public boolean guardar(Talonario talonario);
	public Talonario recuperar(Talonario talonario);
	public List<Talonario> recuperarTalonarios();
	public boolean modificar(Talonario talonario);
	public boolean eliminar(Talonario talonario);

}
