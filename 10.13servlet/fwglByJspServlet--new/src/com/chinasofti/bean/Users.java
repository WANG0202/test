package com.chinasofti.bean;
	
public class Users {
	private String loginId;
	private String loginPwd;
	private String nickName;
	private String tel;
	private String pic;
	
	
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Users() {
		super();
	}
	public Users(String loginId, String loginPwd, String nickName, String tel,String pic) {
		super();
		this.pic=pic;
		this.loginId = loginId;
		this.loginPwd = loginPwd;
		this.nickName = nickName;
		this.tel = tel;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
