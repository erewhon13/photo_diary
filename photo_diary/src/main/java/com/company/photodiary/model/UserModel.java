package com.company.photodiary.model;

import java.io.Serializable;


/**
 * 회원정보 모델
 * @author mgseo
 */
public class UserModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int ukey;				//pk
	private String email;			//id겸 이메일
	private String pwd;			    //패스워드
	private String nickname;		//닉네임
	private String regdate;			//등록일
	private String cflag;			//인증플래그 여부
	private String status;			//상태
	private String uptdate;			//수정일
	
	
	public int getUkey() {
		return ukey;
	}
	public void setUkey(int ukey) {
		this.ukey = ukey;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getCflag() {
		return cflag;
	}
	public void setCflag(String cflag) {
		this.cflag = cflag;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUptdate() {
		return uptdate;
	}
	public void setUptdate(String uptdate) {
		this.uptdate = uptdate;
	}
	
	
	
	
	
}
