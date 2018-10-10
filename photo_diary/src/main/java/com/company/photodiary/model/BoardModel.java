package com.company.photodiary.model;

import java.io.Serializable;


/**
 * 회원정보 모델
 * @author mgseo
 */
public class BoardModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int bseq;				//pk
	private int regUser;			//등록자
	private String title;			//제목
	private String content;		    //내용
	private String regdate;			//등록일
	private String uptdate;			//수정일
	private String filekey1;	    //파일키1
	private String filekey2;	    //파일키2
	
	
	public int getBseq() {
		return bseq;
	}
	public void setBseq(int bseq) {
		this.bseq = bseq;
	}
	public int getRegUser() {
		return regUser;
	}
	public void setRegUser(int regUser) {
		this.regUser = regUser;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getUptdate() {
		return uptdate;
	}
	public void setUptdate(String uptdate) {
		this.uptdate = uptdate;
	}
	public String getFilekey1() {
		return filekey1;
	}
	public void setFilekey1(String filekey1) {
		this.filekey1 = filekey1;
	}
	public String getFilekey2() {
		return filekey2;
	}
	public void setFilekey2(String filekey2) {
		this.filekey2 = filekey2;
	}
	
	
	
	
	
}
