package lezhuwang.model;


public class User {
    private int UserId;
	private String UserName;
	private String UserLoginName;
	private String UserPasswd;
	private String UserSex;
	private String UserLocation;
	private String UserEmail;
	private String UserPhone;
	private float UserAcount;
	private int UserTrust;
	private String UserPicPath;
  

	public User () {}
	public User(int UserId, String UserName, String UserLoginName, String UserPasswd, 
			String UserSex, String UserLocation, String UserEmail, String UserPhone, 
			float UserAcount, int UserTrust, String UserPicPath) {
		this.UserId = UserId;
		this.UserLoginName = UserLoginName;
		this.UserName = UserName;
		this.UserPasswd = UserPasswd;
        this.UserSex = UserSex;
        this.UserLocation = UserLocation;
        this.UserEmail = UserEmail;
        this.UserPhone = UserPhone;
        this.UserAcount = UserAcount;
        this.UserTrust = UserTrust;
        this.UserPicPath = UserPicPath;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserLoginName() {
		return UserLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		UserLoginName = userLoginName;
	}
	public String getUserPasswd() {
		return UserPasswd;
	}
	public void setUserPasswd(String userPasswd) {
		UserPasswd = userPasswd;
	}
	public String getUserSex() {
		return UserSex;
	}
	public void setUserSex(String userSex) {
		UserSex = userSex;
	}
	public String getUserLocation() {
		return UserLocation;
	}
	public void setUserLocation(String userLocation) {
		UserLocation = userLocation;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPhone() {
		return UserPhone;
	}
	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}
	public void setUserAcount(float userAcount) {
		UserAcount = userAcount;
	}
	public float getUserAcount() {
		return UserAcount;
	}
	public void UserPicPath(float userAcount) {
		UserAcount = userAcount;
	}
	public int getUserTrust() {
		return UserTrust;
	}
	public void setUserTrust(int userTrust) {
		UserTrust = userTrust;
	}
	public String getUserPicPath() {
		return UserPicPath;
	}
	public void setUserPicPath(String userPicPath) {
		UserPicPath = userPicPath;
	}


}
