import javax.faces.bean.ManagedBean;


//NOTACAO
@ManagedBean
public class LoginBean {
	
	private String login;
	private String senha;
	private boolean termo;

	// METODOS
	public void logar() {
		if ("rafael".equals(getLogin()) && "123".equals(getSenha())) {
			System.out.println("Usuario logado: " + getLogin());
			System.out.println(isTermo());
		} else
			System.out.println("Usuario com senha incorreta");
	}

	// CONSTRUTORES
	public LoginBean() {
		super();
	}

	public LoginBean(String login, String senha, boolean termo) {
		super();
		this.login = login;
		this.senha = senha;
		this.termo = termo;
	}

	// GETS E SETS
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isTermo() {
		return termo;
	}

	public void setTermo(boolean termo) {
		this.termo = termo;
	}

}