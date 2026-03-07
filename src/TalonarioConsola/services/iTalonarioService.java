package TalonarioConsola.services;

import TalonarioConsola.model.Talonario;

public interface iTalonarioService {
	
	public boolean guardar(Talonario talonario);
	public Talonario recuperar(Talonario talonario);
	public Talonario modificar(Talonario talonario);
	public boolean eliminar(Talonario talonario);

}
