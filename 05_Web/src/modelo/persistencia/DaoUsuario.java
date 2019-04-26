package modelo.persistencia;

import java.util.ArrayList;

import modelo.entidades.Usuario;

/**
 * Se encarga del acceso a los objetos de negocio DAO
 * Simulamos una bbdd
 * @author pue
 *
 */
public class DaoUsuario {

	private ArrayList<Usuario> listaUsuarios;
	
	public DaoUsuario() {
		listaUsuarios = new ArrayList<>();
		
		Usuario usu1= new Usuario();
		usu1.setNombre("pepe");
		usu1.setPassword("1234");
		listaUsuarios.add(usu1);
		
		usu1 = new Usuario();
		usu1.setNombre("lola");
		usu1.setPassword("qwert");
		listaUsuarios.add(usu1);
		
	}
	
	public ArrayList<Usuario> getListaUsuarios() {
		//este mtodo hace la consulta a bbdd
		return listaUsuarios;
		
	}
	
	public Usuario getUsuario(String nombre) {
		return null;
	}
	
}
