package com.codetogether.user;

import java.time.LocalDateTime;

public class UserVO {


	String id;
	//@Email()
	String email;

	//@Pattern(regexp="^.*(?=.{6,20})(?=.*[0-9])(?=.*[a-zA-Z]).*$")
	String password;

	//@Pattern(regexp="^.*(?=.{6,20})(?=.*[0-9])(?=.*[a-zA-Z]).*$")
	String re_password;

	//@Pattern(regexp = "^[가-힣]{2,6}$")
	String name;

	String type;

	//@Pattern(regexp = "^(01[1|6|7|8|9|0])-(\\d{3,4})-(\\d{4})$")
	String phone;

	//@Email()
	String naver_email;

	//@Email()
	String google_email;

	int valid;

	LocalDateTime created;

	LocalDateTime updated;

	String uuid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getRe_password() {
		return re_password;
	}

	public void setRe_password(String re_password) {
		this.re_password = re_password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNaver_email() {
		return naver_email;
	}

	public void setNaver_email(String naver_email) {
		this.naver_email = naver_email;
	}

	public String getGoogle_email() {
		return google_email;
	}

	public void setGoogle_email(String google_email) {
		this.google_email = google_email;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", email=" + email + ", password=" + password + ", re_password=" + re_password
				+ ", name=" + name + ", type=" + type + ", phone=" + phone + ", naver_email=" + naver_email
				+ ", google_email=" + google_email + ", valid=" + valid + ", created=" + created + ", updated="
				+ updated + "]";
	}

}