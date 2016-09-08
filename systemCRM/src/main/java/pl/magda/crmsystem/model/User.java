package pl.magda.crmsystem.model;

public class User {

	private Integer iduser;
	private Integer idrole;
	private String login;
	private String password;
	private String foto;
	
	public User(Integer iduser, Integer idrole, String login, String password, String foto) {
		super();
		this.iduser = iduser;
		this.idrole = idrole;
		this.login = login;
		this.password = password;
		this.foto = foto;
	}

	

	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public Integer getIdrole() {
		return idrole;
	}

	public void setIdrole(Integer idrole) {
		this.idrole = idrole;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
