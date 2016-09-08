package pl.magda.crmsystem.model;

public class Role {

	private Integer idrole;
	private String roleName;
	
	public Role(Integer idrole, String roleName) {
		super();
		this.idrole = idrole;
		this.roleName = roleName;
	}

	public Integer getIdrole() {
		return idrole;
	}

	public void setIdrole(Integer idrole) {
		this.idrole = idrole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
