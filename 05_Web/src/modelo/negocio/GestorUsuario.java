package modelo.negocio;

import java.util.ArrayList;

import modelo.entidades.Usuario;
import modelo.persistencia.DaoUsuario;

//capa de logica de negocio de la aplicacion
public class GestorUsuario {
		
	/**
	 * Metodo que valida si un usuario esta registrado en el sistema
	 * @param user
	 * @return
	 */
	public boolean validarUsuario(Usuario user) {
		//esta capa es la que se comunica con la bbdd
		//validar usuario no este vacio
		if(user.getNombre().equals("")||user.getPassword().equals("")) {
			return false;
		}
		
		DaoUsuario daoUsuario = new DaoUsuario();
		ArrayList<Usuario> listaUsuario = daoUsuario.getListaUsuarios();
		for(Usuario usuarioAux : listaUsuario) {
			if(usuarioAux.getNombre().equals(user.getNombre()) && usuarioAux.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		
		return false;
	}
		
	
}
