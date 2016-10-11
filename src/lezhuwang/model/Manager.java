package lezhuwang.model;

public class Manager {
	private int ManagerId;
	private String ManagerName;
	private String ManagerLoginName;
	private String ManagerPasswd;
	private String ManagerEmail;
	private String ManagerPhone;
	private String ManagerPicPath;
  

	public Manager () {}
	public Manager(int ManagerId, String ManagerName, String ManagerLoginName, String ManagerPasswd,
			String ManagerEmail, String ManagerPhone, String ManagerPicPath) {
		this.ManagerId = ManagerId;
		this.ManagerName = ManagerName;
		this.ManagerLoginName = ManagerLoginName;
		this.ManagerPasswd = ManagerPasswd;
        this.ManagerEmail = ManagerEmail;
        this.ManagerPhone = ManagerPhone;
        this.ManagerPicPath = ManagerPicPath;
	}
	public int getManagerId() {
		return ManagerId;
	}
	public void setManagerId(int managerId) {
		ManagerId = managerId;
	}
	public String getManagerName() {
		return ManagerName;
	}
	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}
	public String getManagerLoginName() {
		return ManagerLoginName;
	}
	public void setManagerLoginName(String managerLoginName) {
		ManagerLoginName = managerLoginName;
	}
	public String getManagerPasswd() {
		return ManagerPasswd;
	}
	public void setManagerPasswd(String managerPasswd) {
		ManagerPasswd = managerPasswd;
	}
	public String getManagerEmail() {
		return ManagerEmail;
	}
	public void setManagerEmail(String managerEmail) {
		ManagerEmail = managerEmail;
	}
	public String getManagerPhone() {
		return ManagerPhone;
	}
	public void setManagerPhone(String managerPhone) {
		ManagerPhone = managerPhone;
	}
	public String getManagerPicPath() {
		return ManagerPicPath;
	}
	public void setManagerPicPath(String managerPicPath) {
		ManagerPicPath = managerPicPath;
	}
}
