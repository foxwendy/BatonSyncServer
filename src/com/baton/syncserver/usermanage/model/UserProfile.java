package com.baton.syncserver.usermanage.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserProfile {
	private int uid;
	private String gcm_regid;
	private String nick_name;
	private String email;
	private String password;
	private String f_name;
	private String l_name;
	private String created_at;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getGcm_regid() {
		return gcm_regid;
	}
	public void setGcm_regid(String gcm_regid) {
		this.gcm_regid = gcm_regid;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	public UserProfile(String gcm_regid, String nick_name,
			String email, String password, String f_name, String l_name) {
		super();
		this.uid = uid;
		this.gcm_regid = gcm_regid;
		this.nick_name = nick_name;
		this.email = email;
		this.password = password;
		this.f_name = f_name;
		this.l_name = l_name;
		this.created_at=created_at;
	}
	
	public UserProfile(Map<String, Object> data)
	{
		super();
		this.uid = Integer.valueOf(data.get("uid").toString());
		this.gcm_regid = data.get("gcm_regid").toString();
		this.nick_name = data.get("nick_name").toString();
		this.email = data.get("email").toString();
		this.password = data.get("password").toString();
		this.f_name = data.get("f_name").toString();
		this.l_name = data.get("l_name").toString();
		this.created_at = data.get("created_at").toString();
	}
	
	public List<String> getUserData()
	{
		List<String> userData = new ArrayList<String>();
		userData.add(this.gcm_regid);
		userData.add(this.nick_name);
		userData.add(this.email);
		userData.add(this.password);
		userData.add(this.f_name);
		userData.add(this.l_name);
		return userData;
	}

}
