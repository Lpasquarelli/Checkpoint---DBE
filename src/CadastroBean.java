import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

//NOTACAO
@ManagedBean
public class CadastroBean {
	
	private List<String> listaSelecionados;
	private List<String> listaSelecionados2;

	//ADICIONANDO A LISTA
	public List<Usuario> getUsuarios() {
		List<Usuario> usuararios = new ArrayList<Usuario>();
		usuararios.add(new Usuario("MOD(List)",1));
		usuararios.add(new Usuario("HIT(List)",2));
		
		return usuararios;
	}
	
	
	// METODOS
	public void cadastrar() {
		for (String string : listaSelecionados2) {
			System.out.println(string);
			System.out.println("--");
		}

		for (String u : listaSelecionados) {

			System.out.println(u);
			System.out.println("----");
		}
	}
	
	
	//CONSTRUTORES
	public CadastroBean() {
		super();
	}
	
	
	public CadastroBean(List<String> listaSelecionados) {
		super();
		this.listaSelecionados = listaSelecionados;
	}


	public CadastroBean(List<String> listaSelecionados, List<String> listaSelecionados2) {
		super();
		this.listaSelecionados = listaSelecionados;
		this.listaSelecionados2 = listaSelecionados2;
	}



	// GETS/SETS
	public List<String> getListaSelecionados2() {
		return listaSelecionados2;
	}



	public void setListaSelecionados2(List<String> listaSelecionados2) {
		this.listaSelecionados2 = listaSelecionados2;
	}



	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}
	
	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}

	
	
}
