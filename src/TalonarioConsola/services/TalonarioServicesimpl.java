package TalonarioConsola.services;

import java.util.LinkedList;
import java.util.List;

import TalonarioConsola.model.Talonario;

public class TalonarioServicesimpl implements iTalonarioService{
	
	List<Talonario> talonarios = null;
	
	

	public TalonarioServicesimpl() {
		talonarios = new LinkedList<>();
	}

	@Override
	public boolean guardar(Talonario talonario) {
	
		talonarios.add(talonario);
		
		return true;
	}

	@Override
	public Talonario recuperar(Talonario talonario) {
		
		return talonarios.get(0);
	}
	
	@Override
	public List<Talonario> recuperarTalonarios() {
		
		return talonarios;
	}

	@Override
	public Talonario modificar(Talonario talonario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Talonario talonario) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
	
}
