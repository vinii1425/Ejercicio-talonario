package TalonarioConsola;

import TalonarioConsola.model.Talonario;


public class TalonarioConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hola...");
		
		Talonario talonario = new Talonario();
		talonario.setId(1);
		talonario.setCarnet("SS100600");
		talonario.setDescripcion("Matriculo, cuota 1");
		talonario.setEstado("A");
		
		boolean r = talonario.guardar(talonario);
		
		if (r)
			System.out.println ("Registro guardado correctamente");
		else
			System.out.println("error al guardar");
		
		

	}

}
